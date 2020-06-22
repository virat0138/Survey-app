package com.example.cpgg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.location.LocationProvider;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.net.Uri;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import static  android.Manifest.permission.CAMERA;
import static  android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static  android.Manifest.permission.ACCESS_FINE_LOCATION;




public class Last_page extends AppCompatActivity {
    public static final String KEY_User_Document1 = "doc1";
    CheckBox c;
    Button confirm,upload;
    String id,imageString;
    ImageView photo;
    boolean f;
    Location loc;
    private static final int PERMISSION_CODE = 1000;
    private static final int IMAGE_CAPTURE_CODE = 1001;
    Uri image_uri;
    private FusedLocationProviderClient client;
    Location l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_last_page);
        requestPermission();
        client = LocationServices.getFusedLocationProviderClient(this);
        Intent i = getIntent();
        id = i.getStringExtra("id");
        c = findViewById(R.id.checkBox);
        confirm = findViewById(R.id.submit);
        upload = findViewById(R.id.button2);
        photo = findViewById(R.id.photo);
        //loc = new double[3];
        f = false;
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
                f = true;
            }
        });

        c.setOnCheckedChangeListener(new Chk_class());
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  new uploadImage(getApplicationContext(), imageString, loc).execute("");
                  // Toast.makeText(getApplicationContext(), "Permission" + imageString, Toast.LENGTH_SHORT).show();


                if (f) {
                    client.getLastLocation().addOnSuccessListener(Last_page.this, new OnSuccessListener<Location>() {
                        @Override
                        public void onSuccess(Location location) {
                            if (location != null) {
                                //Toast.makeText(getApplicationContext(), location.toString(), Toast.LENGTH_SHORT).show();
                                loc = location;
                                //Toast.makeText(getApplicationContext(), "" + loc[0] + "  "+ loc[1], Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

                   image i = new image(getApplicationContext(),photo,image_uri,loc,id);
                   new Thread(i).start();


                    Intent intent = new Intent(Last_page.this, thank.class);
                    startActivity(intent);
                } else
                    Toast.makeText(getApplicationContext(), "Capture Image", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void selectImage() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (checkSelfPermission(Manifest.permission.CAMERA) ==
                    PackageManager.PERMISSION_DENIED ||
                    checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                            PackageManager.PERMISSION_DENIED) {
                String[] permission = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
                requestPermissions(permission, PERMISSION_CODE);

            } else {
                openCamera();
            }


        } else {
            openCamera();
        }
    }
    private void openCamera(){

    ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.TITLE,"New Picture");
        values.put(MediaStore.Images.Media.DESCRIPTION,"From The Camera");
    image_uri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,values);
    Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, image_uri);
    startActivityForResult(cameraIntent, IMAGE_CAPTURE_CODE);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        new deleteF(id).execute("");
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case PERMISSION_CODE:{
                if(grantResults.length > 0 && grantResults[0] ==
                        PackageManager.PERMISSION_GRANTED){
                    openCamera();
                }
                else{
                    Toast.makeText(this, "Permission Denied...", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap originImage = null;
        InputStream inputStream;
        try {

            if (resultCode == RESULT_OK) {
                photo.setImageURI(image_uri);


                //Bitmap bm = ShrinkBitmap(image_uri.toString(), 300, 300);
               // ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             //   Bitmap bitmap = ((BitmapDrawable) photo.getDrawable()).getBitmap();
               // photo.setImageBitmap(bitmap);
              //  bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
              //  byte[] imageBytes = byteArrayOutputStream.toByteArray();
              //  imageString = Base64.encodeToString(imageBytes, Base64.DEFAULT);


                // textView.setText(imageString);
               // Toast.makeText(getApplicationContext(), "Help  " + imageString, Toast.LENGTH_SHORT).show();

                //   textView.setText(imageString);
            }
        }
        catch (Exception e)
        {
           // Toast.makeText(getApplicationContext(), "" + e, Toast.LENGTH_SHORT).show();

        }
    }

    private void requestPermission(){
        ActivityCompat.requestPermissions(this,new String[]{ACCESS_FINE_LOCATION},1);
    }




    class Chk_class implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


            if (c.isChecked())
                confirm.setEnabled(true);
            else
                confirm.setEnabled(false);

        }
    }



}
