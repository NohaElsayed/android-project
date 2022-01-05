package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department10 extends AppCompatActivity {
    ImageButton my_pic91,my_pic92,my_pic93,my_pic94,my_pic95,my_pic96,my_pic97,my_pic98,my_pic99;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department10);

        my_pic91=(ImageButton)findViewById(R.id.my_pic91);
        my_pic92=(ImageButton)findViewById(R.id.my_pic92);
        my_pic93=(ImageButton)findViewById(R.id.my_pic93);
        my_pic94=(ImageButton)findViewById(R.id.my_pic94);
        my_pic95=(ImageButton)findViewById(R.id.my_pic95);
        my_pic96=(ImageButton)findViewById(R.id.my_pic96);
        my_pic97=(ImageButton)findViewById(R.id.my_pic97);
        my_pic98=(ImageButton)findViewById(R.id.my_pic98);
        my_pic99=(ImageButton)findViewById(R.id.my_pic99);


        my_pic91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10.this,medical1_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10.this,medical2_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10.this,medical3_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10.this,medical4_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10.this,medical5_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10.this,medical6_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10.this,medical7_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10.this,medical8_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10.this,medical9_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
