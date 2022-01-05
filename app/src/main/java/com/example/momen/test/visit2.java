package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class visit2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit2);
    }
    public void Butt_herp(View view){
        Intent intent=new Intent(this,visit3.class);
        startActivity(intent);

    }
    public void Butt_medical(View view){
        Intent intent=new Intent(this,visit4.class);
        startActivity(intent);

    }
}
