package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department1herp extends AppCompatActivity {
    ImageButton my_pic1,my_pic2,my_pic3,my_pic4,my_pic5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department1herp);

        my_pic1=(ImageButton)findViewById(R.id.my_pic1);
        my_pic2=(ImageButton)findViewById(R.id.my_pic2);
        my_pic3=(ImageButton)findViewById(R.id.my_pic3);
        my_pic4=(ImageButton)findViewById(R.id.my_pic4);
        my_pic5=(ImageButton)findViewById(R.id.my_pic5);

        my_pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1herp.this,herp1_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1herp.this,herp2_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1herp.this,herp3_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1herp.this,herp4_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1herp.this,herp5_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
