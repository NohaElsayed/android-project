package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical3_dep10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical3_dep10);
    }
    public void btn_map50(View view){
        Intent intent=new Intent(medical3_dep10.this,supprot.class);
        startActivity(intent);
    }
}
