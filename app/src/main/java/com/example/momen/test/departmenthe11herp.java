package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class departmenthe11herp extends AppCompatActivity {
    ImageButton my_pic51,my_pic52,my_pic53,my_pic54,my_pic55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departmenthe11herp);


        my_pic51=(ImageButton)findViewById(R.id.my_pic51);
        my_pic52=(ImageButton)findViewById(R.id.my_pic52);
        my_pic53=(ImageButton)findViewById(R.id.my_pic53);
        my_pic54=(ImageButton)findViewById(R.id.my_pic54);
        my_pic55=(ImageButton)findViewById(R.id.my_pic55);



        my_pic51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(departmenthe11herp.this,herp1_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(departmenthe11herp.this,herp2_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(departmenthe11herp.this,herp3_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(departmenthe11herp.this,herp4_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(departmenthe11herp.this,herp5_dep11.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
