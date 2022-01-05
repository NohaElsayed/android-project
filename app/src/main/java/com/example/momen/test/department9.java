package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department9 extends AppCompatActivity {
    ImageButton my_pic81,my_pic82,my_pic83,my_pic84,my_pic85,my_pic86,my_pic87,my_pic88,my_pic89;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department9);

        my_pic81=(ImageButton)findViewById(R.id.my_pic81);
        my_pic82=(ImageButton)findViewById(R.id.my_pic82);
        my_pic83=(ImageButton)findViewById(R.id.my_pic83);
        my_pic84=(ImageButton)findViewById(R.id.my_pic84);
        my_pic85=(ImageButton)findViewById(R.id.my_pic85);
        my_pic86=(ImageButton)findViewById(R.id.my_pic86);
        my_pic87=(ImageButton)findViewById(R.id.my_pic87);
        my_pic88=(ImageButton)findViewById(R.id.my_pic88);
        my_pic89=(ImageButton)findViewById(R.id.my_pic89);


        my_pic81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9.this,medical1_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9.this,medical2_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9.this,medical3_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9.this,medical4_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9.this,medical5_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9.this,medical6_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9.this,medical7_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9.this,medical8_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9.this,medical9_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });


    }
}
