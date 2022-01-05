package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class department2herp extends AppCompatActivity {
    ImageButton my_pic7,my_pic8,my_pic9,my_pic10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department2herp);

        my_pic7=(ImageButton)findViewById(R.id.my_pic7);
        my_pic8=(ImageButton)findViewById(R.id.my_pic8);
        my_pic9=(ImageButton)findViewById(R.id.my_pic9);
        my_pic10=(ImageButton)findViewById(R.id.my_pic10);


        my_pic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2herp.this,herp1_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2herp.this,herp2_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2herp.this,herp3_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department2herp.this,herp4_dep2.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
