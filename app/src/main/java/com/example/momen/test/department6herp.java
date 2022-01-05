package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department6herp extends AppCompatActivity {
    ImageButton my_pic26,my_pic27,my_pic28,my_pic29,my_pic30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department6herp);


        my_pic26=(ImageButton)findViewById(R.id.my_pic26);
        my_pic27=(ImageButton)findViewById(R.id.my_pic27);
        my_pic28=(ImageButton)findViewById(R.id.my_pic28);
        my_pic29=(ImageButton)findViewById(R.id.my_pic29);
        my_pic30=(ImageButton)findViewById(R.id.my_pic30);



        my_pic26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6herp.this,herp1_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6herp.this,herp2_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6herp.this,herp3_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6herp.this,herp4_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department6herp.this,herp5_dep6.class);
                startActivity(intentLoadNewActivity);
            }

        });


    }
}
