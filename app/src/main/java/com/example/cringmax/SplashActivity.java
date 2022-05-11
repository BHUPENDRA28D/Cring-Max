package com.example.cringmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //Defing an Intent .
        Intent iHome= new Intent(SplashActivity.this,MainActivity.class);
        //Handler object calls Runnabe object...
        new Handler().postDelayed(new Runnable() {
            @Override
            //run method
            public void run() {
                //passing an intent to Mainactivity
                startActivity(iHome);
                /*when we press back button i will not come on that activity again. this finishes the activity*/
                finish();
            }
        },2000);

    }
}