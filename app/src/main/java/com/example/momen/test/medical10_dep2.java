package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medical10_dep2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical10_dep2);
    }

    public void btn_map83(View view){
        Intent intent=new Intent(medical10_dep2.this,supprot.class);
        startActivity(intent);
    }
}
