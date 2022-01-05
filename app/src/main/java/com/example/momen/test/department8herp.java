package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class  department8herp extends AppCompatActivity {
    ImageButton my_pic36,my_pic37,my_pic38,my_pic39,my_pic40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department8herp);

        my_pic36=(ImageButton)findViewById(R.id.my_pic36);
        my_pic37=(ImageButton)findViewById(R.id.my_pic37);
        my_pic38=(ImageButton)findViewById(R.id.my_pic38);
        my_pic39=(ImageButton)findViewById(R.id.my_pic39);
        my_pic40=(ImageButton)findViewById(R.id.my_pic40);



        my_pic36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8herp.this,herp1_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8herp.this,herp2_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8herp.this,herp3_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });

        my_pic39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8herp.this,herp4_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });
        my_pic40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(department8herp.this,herp5_dep8.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
