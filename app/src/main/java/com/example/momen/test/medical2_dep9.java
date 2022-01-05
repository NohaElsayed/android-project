package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical2_dep9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical2_dep9);
    }
    public void btn_map40(View view){
        Intent intent=new Intent(medical2_dep9.this,supprot.class);
        startActivity(intent);
    }
}
