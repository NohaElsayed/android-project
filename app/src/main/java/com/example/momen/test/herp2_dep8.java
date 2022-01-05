package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class herp2_dep8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herp2_dep8);
    }
    public void but_37(View view){
        Intent intent=new Intent(herp2_dep8.this,supprot_herb.class);
        startActivity(intent);
    }
}
