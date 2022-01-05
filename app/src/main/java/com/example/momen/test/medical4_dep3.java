package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical4_dep3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical4_dep3);
    }

    public void btn_map87(View view){
        Intent intent=new Intent(medical4_dep3.this,supprot.class);
        startActivity(intent);
    }
}
