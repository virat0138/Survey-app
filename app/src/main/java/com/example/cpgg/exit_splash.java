package com.example.cpgg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class exit_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_splash);
        exit_splash.this.finish();
        System.exit(0);
    }
}
