package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical6_dep12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical6_dep12);
    }
    public void btn_map71(View view){
        Intent intent=new Intent(medical6_dep12.this,supprot.class);
        startActivity(intent);
    }
}
