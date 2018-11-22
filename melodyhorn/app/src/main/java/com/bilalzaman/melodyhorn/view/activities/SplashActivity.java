package com.bilalzaman.melodyhorn.view.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bilalzaman.melodyhorn.R;

public class SplashActivity extends AppCompatActivity {

    private int SPLASH_TIME_OUT =  2000;
    private TextView txtPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        init();

    }

    private void init() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, AnimateActivity.class);
                startActivity(intent);
            }
        },SPLASH_TIME_OUT);
    }
}