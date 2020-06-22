package com.example.cpgg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Exit extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;
    Animation top_anim, bottom_anim;
    ImageView top;
    TextView bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);

        top_anim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        bottom_anim =AnimationUtils.loadAnimation(this, R.anim.bottom_anim);

        top= findViewById(R.id.logo);
        bottom= findViewById(R.id.bottom);
        top.setAnimation(top_anim);
        bottom.setAnimation(bottom_anim);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(getApplicationContext(), exit_splash.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
