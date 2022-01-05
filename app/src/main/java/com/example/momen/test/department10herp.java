package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department10herp extends AppCompatActivity {
    ImageButton my_pic46,my_pic47,my_pic48,my_pic49,my_pic50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department10herp);

        my_pic46=(ImageButton)findViewById(R.id.my_pic46);
        my_pic47=(ImageButton)findViewById(R.id.my_pic47);
        my_pic48=(ImageButton)findViewById(R.id.my_pic48);
        my_pic49=(ImageButton)findViewById(R.id.my_pic49);
        my_pic50=(ImageButton)findViewById(R.id.my_pic50);



        my_pic46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10herp.this,herp1_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10herp.this,herp2_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10herp.this,herp3_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10herp.this,herp4_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department10herp.this,herp5_dep10.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
