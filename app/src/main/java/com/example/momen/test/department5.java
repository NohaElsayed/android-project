package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department5 extends AppCompatActivity {
    ImageButton my_pic41,my_pic42,my_pic43,my_pic44,my_pic45,my_pic46,my_pic47,my_pic48,my_pic49;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department5);
        my_pic41=(ImageButton)findViewById(R.id.my_pic41);
        my_pic42=(ImageButton)findViewById(R.id.my_pic42);
        my_pic43=(ImageButton)findViewById(R.id.my_pic43);
        my_pic44=(ImageButton)findViewById(R.id.my_pic44);
        my_pic45=(ImageButton)findViewById(R.id.my_pic45);
        my_pic46=(ImageButton)findViewById(R.id.my_pic46);
        my_pic47=(ImageButton)findViewById(R.id.my_pic47);
        my_pic48=(ImageButton)findViewById(R.id.my_pic48);
        my_pic49=(ImageButton)findViewById(R.id.my_pic49);


        my_pic41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5.this,medical1_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5.this,medical2_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5.this,medical3_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5.this,medical4_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5.this,medical5_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5.this,medical6_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5.this,medical7_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5.this,medical8_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5.this,medical9_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });



    }
}
