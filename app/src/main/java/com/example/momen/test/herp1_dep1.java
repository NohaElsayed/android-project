package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class herp1_dep1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_herp1_dep1);
    }
    public void but_1(View view){
        Intent intent=new Intent(this,supprot_herb.class);
        startActivity(intent);
        }
   }
