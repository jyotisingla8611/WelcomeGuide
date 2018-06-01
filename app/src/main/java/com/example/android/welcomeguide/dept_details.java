package com.example.android.welcomeguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class dept_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept_details);

        CardView edisonButton = findViewById(R.id.edison_block);
        edisonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this, EdisonActivity.class);
                startActivity(intent);
            }
        });

        CardView turingButton = findViewById(R.id.turing_block);
        turingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this, turingActivity.class);
                startActivity(intent);
            }
        });

        CardView teslaButton = findViewById(R.id.tesla_block);
        teslaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this, teslaActivity.class);
                startActivity(intent);
            }
        });

        CardView newtonButton = findViewById(R.id.newton_block);
        newtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this, newtonActivity.class);
                startActivity(intent);
            }
        });

        CardView galelioButton = findViewById(R.id.galelio_block);
        galelioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this, galelioActivity.class);
                startActivity(intent);
            }
        });


        CardView bloomButton = findViewById(R.id.bloom_block);
        bloomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this,bloomActivity.class);
                startActivity(intent);
            }
        });
        CardView babbageButton = findViewById(R.id.babbage_block);
        babbageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this,babbageActivity.class);
                startActivity(intent);
            }
        });
        CardView demorganButtin = findViewById(R.id.demorgan_block);
        demorganButtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this,demorganActivity.class);
                startActivity(intent);
            }
        });
        CardView lecorbuiserButton = findViewById(R.id.lecorbuiser_block);
        lecorbuiserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this,lecorbuiserActivity.class);
                startActivity(intent);
            }
        });
        CardView flemingButton = findViewById(R.id.fleming_block);
        flemingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this,flemingActivity.class);
                startActivity(intent);
            }
        });
        CardView demorganButton = findViewById(R.id.demorgan_block);
        demorganButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept_details.this,demorganActivity.class);
                startActivity(intent);
            }
        });
    }
}
