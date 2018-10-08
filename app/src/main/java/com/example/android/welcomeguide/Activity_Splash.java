package com.example.android.welcomeguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class Activity_Splash extends AppCompatActivity {

    private static final long DELAY = 3000;
    private boolean scheduled = false;
    private Timer splashTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__splash);

        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(Activity_Splash.this, MainActivity.class));
                finish();
            }
        }, 2000 );
    }
}
