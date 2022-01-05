package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department8 extends AppCompatActivity {
    ImageButton my_pic71,my_pic72,my_pic73,my_pic74,my_pic75,my_pic76,my_pic77,my_pic78,my_pic79;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department8);

        my_pic71=(ImageButton)findViewById(R.id.my_pic71);
        my_pic72=(ImageButton)findViewById(R.id.my_pic72);
        my_pic73=(ImageButton)findViewById(R.id.my_pic73);
        my_pic74=(ImageButton)findViewById(R.id.my_pic74);
        my_pic75=(ImageButton)findViewById(R.id.my_pic75);
        my_pic76=(ImageButton)findViewById(R.id.my_pic76);
        my_pic77=(ImageButton)findViewById(R.id.my_pic77);
        my_pic78=(ImageButton)findViewById(R.id.my_pic78);
        my_pic79=(ImageButton)findViewById(R.id.my_pic79);


        my_pic71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8.this,medical1_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8.this,medical2_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8.this,medical3_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8.this,medical4_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8.this,medical5_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8.this,medical6_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8.this,medical7_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8.this,medical8_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8.this,medical9_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });



    }
}
