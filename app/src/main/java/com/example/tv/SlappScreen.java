package com.example.tv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.DoubleBounce;

public class SlappScreen extends AppCompatActivity {

    ImageView imageView;
    ProgressBar progressBar;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slapp_screen);
        getSupportActionBar().hide();

        imageView = findViewById(R.id.imageView);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        imageView.setAnimation(animation);

        ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);
        Sprite doubleBounce = new Circle();
        progressBar.setIndeterminateDrawable(doubleBounce);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SlappScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);


    }
}