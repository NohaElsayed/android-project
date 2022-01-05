package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department4herp extends AppCompatActivity {
    ImageButton my_pic16,my_pic17,my_pic18,my_pic19,my_pic20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department4herp);


        my_pic16=(ImageButton)findViewById(R.id.my_pic16);
        my_pic17=(ImageButton)findViewById(R.id.my_pic17);
        my_pic18=(ImageButton)findViewById(R.id.my_pic18);
        my_pic19=(ImageButton)findViewById(R.id.my_pic19);
        my_pic20=(ImageButton)findViewById(R.id.my_pic20);



        my_pic16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4herp.this,herp1_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4herp.this,herp2_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4herp.this,herp3_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4herp.this,herp4_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department4herp.this,herp5_dep4.class);
                startActivity(intentLoadNewActivity);
            }

        });
    }
}
