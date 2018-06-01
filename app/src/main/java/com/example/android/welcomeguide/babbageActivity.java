package com.example.android.welcomeguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class babbageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babbage);
        ImageView i1 = findViewById(R.id.gotoPhone1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9501105645"));
                startActivity(phoneActivity);
            }
        });
        ImageView i2 = findViewById(R.id.gotoPhone2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9501105645"));
                startActivity(phoneActivity);
            }
        });
        ImageView i3 = findViewById(R.id.gotoPhone3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9501105645"));
                startActivity(phoneActivity);
            }
        });
        ImageView i4 = findViewById(R.id.gotoPhone4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9501105645"));
                startActivity(phoneActivity);
            }
        });
    }/*
    void gotoPhone1(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9501105645"));
        startActivity(phoneActivity);

    }
    void gotoPhone2(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9501105646"));
        startActivity(phoneActivity);

    }
    void gotoPhone3(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9501105651"));
        startActivity(phoneActivity);

    } void gotoPhone4(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9501105640"));
        startActivity(phoneActivity);

    }*/
}
