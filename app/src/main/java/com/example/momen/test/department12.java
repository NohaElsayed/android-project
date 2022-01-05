package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department12 extends AppCompatActivity {
    ImageButton my_pic111,my_pic112,my_pic113,my_pic114,my_pic115,my_pic116,my_pic117,my_pic118,my_pic119;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department12);

        my_pic111=(ImageButton)findViewById(R.id.my_pic111);
        my_pic112=(ImageButton)findViewById(R.id.my_pic112);
        my_pic113=(ImageButton)findViewById(R.id.my_pic113);
        my_pic114=(ImageButton)findViewById(R.id.my_pic114);
        my_pic115=(ImageButton)findViewById(R.id.my_pic115);
        my_pic116=(ImageButton)findViewById(R.id.my_pic116);
        my_pic117=(ImageButton)findViewById(R.id.my_pic117);
        my_pic118=(ImageButton)findViewById(R.id.my_pic118);
        my_pic119=(ImageButton)findViewById(R.id.my_pic119);


        my_pic111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12.this,medical1_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12.this,medical2_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12.this,medical3_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12.this,medical4_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12.this,medical5_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12.this,medical6_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12.this,medical7_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12.this,medical8_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12.this,medical9_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });


    }
}
