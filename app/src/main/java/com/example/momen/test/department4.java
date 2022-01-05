package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department4 extends AppCompatActivity {
    ImageButton my_pic31,my_pic32,my_pic33,my_pic34,my_pic35,my_pic36,my_pic37,my_pic38,my_pic39;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department4);
        my_pic31=(ImageButton)findViewById(R.id.my_pic31);
        my_pic32=(ImageButton)findViewById(R.id.my_pic32);
        my_pic33=(ImageButton)findViewById(R.id.my_pic33);
        my_pic34=(ImageButton)findViewById(R.id.my_pic34);
        my_pic35=(ImageButton)findViewById(R.id.my_pic35);
        my_pic36=(ImageButton)findViewById(R.id.my_pic36);
        my_pic37=(ImageButton)findViewById(R.id.my_pic37);
        my_pic38=(ImageButton)findViewById(R.id.my_pic38);
        my_pic39=(ImageButton)findViewById(R.id.my_pic39);

        my_pic31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4.this,meidcal1_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4.this,medical2_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4.this,medical3_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4.this,medical4_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4.this,medical5_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4.this,medical6_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4.this,medical7_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4.this,medical8_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4.this,medical9_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
    }
}
