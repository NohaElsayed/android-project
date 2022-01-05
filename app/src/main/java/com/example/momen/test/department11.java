package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department11 extends AppCompatActivity {
    ImageButton my_pic101,my_pic102,my_pic103,my_pic104,my_pic105,my_pic106,my_pic107,my_pic108,my_pic109;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department11);

        my_pic101=(ImageButton)findViewById(R.id.my_pic101);
        my_pic102=(ImageButton)findViewById(R.id.my_pic102);
        my_pic103=(ImageButton)findViewById(R.id.my_pic103);
        my_pic104=(ImageButton)findViewById(R.id.my_pic104);
        my_pic105=(ImageButton)findViewById(R.id.my_pic105);
        my_pic106=(ImageButton)findViewById(R.id.my_pic106);
        my_pic107=(ImageButton)findViewById(R.id.my_pic107);
        my_pic108=(ImageButton)findViewById(R.id.my_pic108);
        my_pic109=(ImageButton)findViewById(R.id.my_pic109);


        my_pic101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department11.this,medical1_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department11.this,medical2_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department11.this,medical3_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department11.this,medical4_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department11.this,medical5_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department11.this,medical6_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department11.this,medical7_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department11.this,medical8_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department11.this,medical9_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
