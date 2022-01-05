package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main5);
       }

    public void Butt_herp(View view){
        Intent intent=new Intent(this,DepartmentOfHerps.class);
        startActivity(intent);

    }
    public void Butt_medical(View view){
        Intent intent=new Intent(this,department.class);
        startActivity(intent);

    }

}
