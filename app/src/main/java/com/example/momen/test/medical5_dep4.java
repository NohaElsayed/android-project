package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical5_dep4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical5_dep4);
    }

    public void btn_map97(View view){
        Intent intent=new Intent(medical5_dep4.this,supprot.class);
        startActivity(intent);
    }
}
