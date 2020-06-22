package com.example.cpgg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class image implements Runnable {
    //String imageString;
    //ImageView photo;
    Intent data;
    Uri selectedImage;
    private static final int RESULT_LOAD_IMAGE = 1;
    // Button uploadpic;
    ImageView imagebox;
    byte[] byteArray;
    String encodedImage,id;
    Location l;
    Context ct;

    public image(Context c, ImageView photo, Uri u, Location l,String id) {
        ct = c;
        imagebox = photo;
        selectedImage = u;
        this.data = data;
        this.l = l;
        this.id = id;
    }


    public void run() {
        // Bitmap bm = ShrinkBitmap(image_uri.toString(), 300, 300);
        /*ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmap = ((BitmapDrawable) photo.getDrawable()).getBitmap();
        bitmap.compress(Bitmap.CompressFormat.PNG, 25, byteArrayOutputStream);
        byte[] imageBytes = byteArrayOutputStream.toByteArray();
        imageString = Base64.encodeToString(imageBytes, Base64.DEFAULT);*/

        Bitmap originBitmap = null;
        //Uri selectedImage = data.getData();
      //  Toast.makeText(ct, selectedImage.toString(), Toast.LENGTH_LONG).show();
        InputStream imageStream;
        try {
            imageStream = ct.getContentResolver().openInputStream(selectedImage);
            originBitmap = BitmapFactory.decodeStream(imageStream);
        } catch (FileNotFoundException e) {
       //     Toast.makeText(ct, "" + e, Toast.LENGTH_LONG).show();
        }
        if (originBitmap != null) {
            //imagebox.setImageBitmap(originBitmap);
            Log.w("Image Setted in", "Done Loading Image");
            try {
                Bitmap image = ((BitmapDrawable) imagebox.getDrawable()).getBitmap();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                image.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                encodedImage = Base64.encodeToString(byteArray, Base64.DEFAULT);
                // Calling the background process so that application wont slow down
                new uploadImage(ct, encodedImage, l,id).execute("");
                //End Calling the background process so that application wont slow down
            } catch (Exception e) {
                Log.w("OOooooooooo","exception");
            }
           // Toast.makeText(ct, "Conversion Done", Toast.LENGTH_SHORT).show();
        }
        // End getting the selected image, setting in imageview and converting it to byte and base 64
       // else
          //  Toast.makeText(ct, "Error occurred", Toast.LENGTH_LONG).show();
    }
}


//Toast.makeText(ct, "Help  " + imageString, Toast.LENGTH_SHORT).show();

