package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical1_dep5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical1_dep5);
    }

    public void btn_map102(View view){
        Intent intent=new Intent(medical1_dep5.this,supprot.class);
        startActivity(intent);
    }
}
