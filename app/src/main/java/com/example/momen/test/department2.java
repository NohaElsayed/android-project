package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department2 extends AppCompatActivity {
    ImageButton my_pic11,my_pic12,my_pic13,my_pic14,my_pic15,my_pic16,my_pic17,my_pic18,my_pic19,my_pic20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department2);
        my_pic11=(ImageButton)findViewById(R.id.my_pic11);
        my_pic12=(ImageButton)findViewById(R.id.my_pic12);
        my_pic13=(ImageButton)findViewById(R.id.my_pic13);
        my_pic14=(ImageButton)findViewById(R.id.my_pic14);
        my_pic15=(ImageButton)findViewById(R.id.my_pic15);
        my_pic16=(ImageButton)findViewById(R.id.my_pic16);
        my_pic17=(ImageButton)findViewById(R.id.my_pic17);
        my_pic18=(ImageButton)findViewById(R.id.my_pic18);
        my_pic19=(ImageButton)findViewById(R.id.my_pic19);
        my_pic20=(ImageButton)findViewById(R.id.my_pic20);

        my_pic11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical1_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical2_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical3_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical4_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical5_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical6_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical7_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical8_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical9_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2.this,medical10_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });
}


}
