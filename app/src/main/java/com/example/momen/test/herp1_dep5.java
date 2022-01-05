package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class herp1_dep5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herp1_dep5);
    }
    public void but_21(View view){
        Intent intent=new Intent(herp1_dep5.this,supprot_herb.class);
        startActivity(intent);
    }
}
