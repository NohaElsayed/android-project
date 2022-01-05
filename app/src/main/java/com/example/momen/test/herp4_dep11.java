package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class herp4_dep11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herp4_dep11);
    }
    public void but_54(View view){
        Intent intent=new Intent(herp4_dep11.this,supprot_herb.class);
        startActivity(intent);
    }
}
