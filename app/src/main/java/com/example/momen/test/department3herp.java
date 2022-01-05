package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department3herp extends AppCompatActivity {
    ImageButton my_pic11,my_pic12,my_pic13,my_pic14,my_pic15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department3herp);

        my_pic11=(ImageButton)findViewById(R.id.my_pic11);
        my_pic12=(ImageButton)findViewById(R.id.my_pic12);
        my_pic13=(ImageButton)findViewById(R.id.my_pic13);
        my_pic14=(ImageButton)findViewById(R.id.my_pic14);
        my_pic15=(ImageButton)findViewById(R.id.my_pic15);



        my_pic11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3herp.this,herp1_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3herp.this,herp2_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3herp.this,herp3_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3herp.this,herp4_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department3herp.this,herp5_dep3.class);
                startActivity(intentLoadNewActivity);
            }

        });
    }
}
