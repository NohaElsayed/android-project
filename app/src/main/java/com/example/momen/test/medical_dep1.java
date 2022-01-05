package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical_dep1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_dep1);
    }
    public void btn_map2(View view){
        Intent intent=new Intent(medical_dep1.this,supprot.class);
        intent.putExtra("pharma","dip");
        startActivity(intent);
    }
}
