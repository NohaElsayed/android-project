package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class herp5_dep6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herp5_dep6);
    }
    public void but_30(View view){
        Intent intent=new Intent(herp5_dep6.this,supprot_herb.class);
        startActivity(intent);
    }
}
