package com.bilalzaman.melodyhorn.view.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bilalzaman.melodyhorn.R;

public class AnimateActivity extends AppCompatActivity {

    private TextView txtlogo, txtStarted, txtWay;
    private ImageView imgArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate);

        init();
    }

    private void init() {
        txtlogo = findViewById(R.id.txtMelody);
        txtStarted = findViewById(R.id.txtDesc);
        txtWay = findViewById(R.id.txtWay);
        imgArrow = findViewById(R.id.imgArrow);

        Animation slideUp = AnimationUtils.loadAnimation(AnimateActivity.this, R.anim.slide_up);
        txtlogo.startAnimation(slideUp);
        txtlogo.setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation slideDown = AnimationUtils.loadAnimation(AnimateActivity.this, R.anim.slide_down);
                txtStarted.startAnimation(slideDown);
                txtStarted.setVisibility(View.VISIBLE);
            }
        },2000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation slideRight = AnimationUtils.loadAnimation(AnimateActivity.this, R.anim.slide_up);
                txtWay.startAnimation(slideRight);
                txtWay.setVisibility(View.VISIBLE);
                txtStarted.setVisibility(View.GONE);
            }
        },3000);

        showNextScreen();
    }

    private void showNextScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txtWay.setVisibility(View.VISIBLE);
                imgArrow.setVisibility(View.VISIBLE);
                imgArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(AnimateActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }
                });
            }
        },4000);
    }
}
