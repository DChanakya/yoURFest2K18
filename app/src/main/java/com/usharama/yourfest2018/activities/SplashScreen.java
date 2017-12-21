package com.usharama.yourfest2018.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.usharama.yourfest2018.R;

public class SplashScreen extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    private static int SPLASH_TIME_OUT = 5000;
    Animation slideUpAnimation, slideDownAnimation,shakeAnimation;

    ImageView imageView;
    String TAG = "Splash Screen Activity";
    private Typeface typeface;
    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
    //    private static int SPLASH_TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Button enterButton=(Button)findViewById(R.id.button_enter);
        imageView = (ImageView)findViewById(R.id.iv);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
            }
        });
        slideDownAnimation = AnimationUtils.loadAnimation(getApplicationContext(),

                R.anim.slide_down_animation);

        imageView.startAnimation(slideDownAnimation);

//        new Handler().postDelayed(new Runnable() {
//            /*
//             * Showing splash screen with a timer. This will be useful when you
//             * want to show case your app logo / company
//             */
//            @Override
//            public void run() {
//                // This method will be executed once the timer is over
//                // Start your app main activity
//                Intent i = new Intent(SplashScreen.this, MainActivity.class);
//                startActivity(i);
//            }
//        }, SPLASH_TIME_OUT);

    }

    }
