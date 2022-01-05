package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical8_dep6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical8_dep6);
    }
    public void btn_map18(View view){
        Intent intent=new Intent(medical8_dep6.this,supprot.class);
        startActivity(intent);
    }
}
