package com.example.cpgg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static Button english,hindi,confirm,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

       if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
                    Manifest.permission.ACCESS_FINE_LOCATION)){
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            }else{
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            }
        }


      /*  if (ContextCompat.checkSelfPermission(CONTEXT, Manifest.permission.REQUESTED_PERMISSION) == PackageManager.PERMISSION_GRANTED) {
            // You can use the API that requires the permission.
            performAction(...);
        } else if (shouldShowRequestPermissionRationale(...)) {
            // In an educational UI, explain to the user why your app requires this
            // permission for a specific feature to behave as expected. In this UI,
            // include a "cancel" or "no thanks" button that allows the user to
            // continue using your app without granting the permission.
            showInContextUI(...);
        } else {
            // You can directly ask for the permission.
            requestPermissions(...);
        }


     @Override
        public void onRequestPermissionsResults(int requestCode, String[] , int[] grantResults) {
            switch (requestCode) {
                case 1:
                    // If request is cancelled, the result arrays are empty.
                    if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        // Permission is granted. Continue the action or workflow
                        // in your app.
                    }  else {
                        // Explain to the user that the feature is unavailable because
                        // the features requires a permission that the user has denied.
                        // At the same time, respect the user's decision. Don't link to
                        // system settings in an effort to convince the user to change
                        // their decision.
                    }
                    return;
            }
            // Other 'case' lines to check for other
            // permissions this app might request.
        } */

        english = findViewById(R.id.english);
        hindi = findViewById(R.id.hindi);
        confirm = findViewById(R.id.confirm);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                english.setBackground(getDrawable(R.drawable.english_button_selected));
                hindi.setBackground(getDrawable(R.drawable.hindi_button));
                confirm.setEnabled(true);
                next = english;
            }
        });
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hindi.setBackground(getDrawable(R.drawable.hindi_button_selected));
                english.setBackground(getDrawable(R.drawable.english_button));
                confirm.setEnabled(true);
                next = hindi;
            }
        });



        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             // new uploadData(getApplicationContext()).execute("");
                switch (next.getId())
                {
                    case R.id.english:    Intent ie = new Intent(getApplicationContext(),English_details.class);
                                           startActivity(ie);
                                           break;
                    case R.id.hindi:       Intent ih = new Intent(getApplicationContext(),Hindi_details.class);
                                        startActivity(ih);
                                                        }
            }
        });
    }


    @Override
    public void onBackPressed() {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults){
        switch (requestCode){
            case 1:
                if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    if (ContextCompat.checkSelfPermission(MainActivity.this,
                            Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
                }
                return;
        }


    }
}
