package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical9_dep2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical9_dep2);
    }

    public void btn_map82(View view){
        Intent intent=new Intent(medical9_dep2.this,supprot.class);
        startActivity(intent);
    }
}
