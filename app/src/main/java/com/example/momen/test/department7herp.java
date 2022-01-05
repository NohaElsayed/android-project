package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department7herp extends AppCompatActivity {
    ImageButton my_pic31,my_pic32,my_pic33,my_pic34,my_pic35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department7herp);

        my_pic31=(ImageButton)findViewById(R.id.my_pic31);
        my_pic32=(ImageButton)findViewById(R.id.my_pic32);
        my_pic33=(ImageButton)findViewById(R.id.my_pic33);
        my_pic34=(ImageButton)findViewById(R.id.my_pic34);
        my_pic35=(ImageButton)findViewById(R.id.my_pic35);



        my_pic31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7herp.this,herp1_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7herp.this,herp2_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7herp.this,herp3_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7herp.this,herp4_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department7herp.this,herp5_dep7.class);
                startActivity(intentLoadNewActivity);
            }

        });


    }
}
