package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department3 extends AppCompatActivity {
    ImageButton my_pic21,my_pic22,my_pic23,my_pic24,my_pic25,my_pic26,my_pic27,my_pic28,my_pic29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department3);

        my_pic21=(ImageButton)findViewById(R.id.my_pic21);
        my_pic22=(ImageButton)findViewById(R.id.my_pic22);
        my_pic23=(ImageButton)findViewById(R.id.my_pic23);
        my_pic24=(ImageButton)findViewById(R.id.my_pic24);
        my_pic25=(ImageButton)findViewById(R.id.my_pic25);
        my_pic26=(ImageButton)findViewById(R.id.my_pic26);
        my_pic27=(ImageButton)findViewById(R.id.my_pic27);
        my_pic28=(ImageButton)findViewById(R.id.my_pic28);
        my_pic29=(ImageButton)findViewById(R.id.my_pic29);

        my_pic21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3.this,medical1_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3.this,medical2_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3.this,medical3_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3.this,medical4_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3.this,medical5_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3.this,medical6_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3.this,medical7_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3.this,medical8_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3.this,medical9_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });



    }
}
