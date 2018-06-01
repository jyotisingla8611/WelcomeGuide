package com.example.android.welcomeguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class chandigarhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chandigarh);
    }
    void gotoPhone1(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"8526954845"));
        startActivity(phoneActivity);

    }
    void gotoPhone2(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"7589298658"));
        startActivity(phoneActivity);

    }
    void gotoPhone3(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9785252586"));
        startActivity(phoneActivity);

    }
    void gotoPhone4(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"7235855845"));
        startActivity(phoneActivity);

    }
    void gotoPhone5(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"8256856684"));
        startActivity(phoneActivity);

    }
    void gotoPhone6(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9875415786"));
        startActivity(phoneActivity);

    }
}
