package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department6 extends AppCompatActivity {
    ImageButton my_pic51,my_pic52,my_pic53,my_pic54,my_pic55,my_pic56,my_pic57,my_pic58,my_pic59;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department6);

        my_pic51=(ImageButton)findViewById(R.id.my_pic51);
        my_pic52=(ImageButton)findViewById(R.id.my_pic52);
        my_pic53=(ImageButton)findViewById(R.id.my_pic53);
        my_pic54=(ImageButton)findViewById(R.id.my_pic54);
        my_pic55=(ImageButton)findViewById(R.id.my_pic55);
        my_pic56=(ImageButton)findViewById(R.id.my_pic56);
        my_pic57=(ImageButton)findViewById(R.id.my_pic57);
        my_pic58=(ImageButton)findViewById(R.id.my_pic58);
        my_pic59=(ImageButton)findViewById(R.id.my_pic59);


        my_pic51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6.this,medical1_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6.this,medical2_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6.this,medical3_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6.this,medical4_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6.this,medical5_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6.this,medical6_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6.this,meidcal7_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6.this,medical8_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6.this,medical9_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });



    }
}
