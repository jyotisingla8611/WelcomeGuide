package com.example.android.welcomeguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class demorganActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demorgan);
    }
    void gotoPhone1(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"7845263165"));
        startActivity(phoneActivity);

    }
    void gotoPhone2(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"919915470830"));
        startActivity(phoneActivity);

    }
    void gotoPhone3(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"25825698"));
        startActivity(phoneActivity);

    } void gotoPhone4(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"1234567899"));
        startActivity(phoneActivity);

    }
}
