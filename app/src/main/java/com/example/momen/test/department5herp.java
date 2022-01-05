package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department5herp extends AppCompatActivity {
    ImageButton my_pic21,my_pic22,my_pic23,my_pic24,my_pic25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department5herp);


        my_pic21=(ImageButton)findViewById(R.id.my_pic21);
        my_pic22=(ImageButton)findViewById(R.id.my_pic22);
        my_pic23=(ImageButton)findViewById(R.id.my_pic23);
        my_pic24=(ImageButton)findViewById(R.id.my_pic24);
        my_pic25=(ImageButton)findViewById(R.id.my_pic25);



        my_pic21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5herp.this,herp1_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5herp.this,herp2_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5herp.this,herp3_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5herp.this,herp4_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department5herp.this,herp5_dep5.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
