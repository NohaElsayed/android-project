package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class herp2_dep5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herp2_dep5);
    }
    public void but_22(View view){
        Intent intent=new Intent(herp2_dep5.this,supprot_herb.class);
        startActivity(intent);
    }
}
