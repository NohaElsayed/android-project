package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class department1 extends AppCompatActivity {
    ImageButton my_pic1,my_pic2,my_pic3,my_pic4,my_pic5,my_pic6,my_pic7,my_pic8,my_pic9,my_pic10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department1);

        my_pic1=(ImageButton)findViewById(R.id.my_pic1);
        my_pic2=(ImageButton)findViewById(R.id.my_pic2);
        my_pic3=(ImageButton)findViewById(R.id.my_pic3);
        my_pic4=(ImageButton)findViewById(R.id.my_pic4);
        my_pic5=(ImageButton)findViewById(R.id.my_pic5);
        my_pic6=(ImageButton)findViewById(R.id.my_pic6);
        my_pic7=(ImageButton)findViewById(R.id.my_pic7);
        my_pic8=(ImageButton)findViewById(R.id.my_pic8);
        my_pic9=(ImageButton)findViewById(R.id.my_pic9);
        my_pic10=(ImageButton)findViewById(R.id.my_pic10);



        my_pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical2_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical3_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical4_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical5_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical6_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical7_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical8_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical9_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department1.this,medical10_dep1.class);
                startActivity(intentLoadNewActivity);
            }

        });
    }
}
