package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department12herp extends AppCompatActivity {
    ImageButton my_pic56,my_pic57,my_pic58,my_pic59,my_pic60;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department12herp);


        my_pic56=(ImageButton)findViewById(R.id.my_pic56);
        my_pic57=(ImageButton)findViewById(R.id.my_pic57);
        my_pic58=(ImageButton)findViewById(R.id.my_pic58);
        my_pic59=(ImageButton)findViewById(R.id.my_pic59);
        my_pic60=(ImageButton)findViewById(R.id.my_pic60);



        my_pic56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12herp.this,herp1_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12herp.this,herp2_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12herp.this,herp3_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12herp.this,herp4_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department12herp.this,herp5_dep12.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
