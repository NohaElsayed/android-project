package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department7 extends AppCompatActivity {
    ImageButton my_pic61,my_pic62,my_pic63,my_pic64,my_pic65,my_pic66,my_pic67,my_pic68,my_pic69;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department7);

        my_pic61=(ImageButton)findViewById(R.id.my_pic61);
        my_pic62=(ImageButton)findViewById(R.id.my_pic62);
        my_pic63=(ImageButton)findViewById(R.id.my_pic63);
        my_pic64=(ImageButton)findViewById(R.id.my_pic64);
        my_pic65=(ImageButton)findViewById(R.id.my_pic65);
        my_pic66=(ImageButton)findViewById(R.id.my_pic66);
        my_pic67=(ImageButton)findViewById(R.id.my_pic67);
        my_pic68=(ImageButton)findViewById(R.id.my_pic68);
        my_pic69=(ImageButton)findViewById(R.id.my_pic69);


        my_pic61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7.this,medical1_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7.this,medical2_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7.this,medical3_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7.this,medical4_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7.this,medical5_Dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7.this,medical6_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7.this,medical7_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7.this,medical8_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7.this,medical9_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });



    }
}
