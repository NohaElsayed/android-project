package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department9herp extends AppCompatActivity {
    ImageButton my_pic41,my_pic42,my_pic43,my_pic44,my_pic45;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department9herp);

        my_pic41=(ImageButton)findViewById(R.id.my_pic41);
        my_pic42=(ImageButton)findViewById(R.id.my_pic42);
        my_pic43=(ImageButton)findViewById(R.id.my_pic43);
        my_pic44=(ImageButton)findViewById(R.id.my_pic44);
        my_pic45=(ImageButton)findViewById(R.id.my_pic45);



        my_pic41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9herp.this,herp1_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9herp.this,herp2_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9herp.this,herp3_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9herp.this,herp4_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department9herp.this,herp5_dep9.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
