package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class department extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.department);
    }
    public void buttn1 (View view) {
        Intent intent = new Intent(department.this, department1.class);
        startActivity(intent);
    }
    public void buttn2 (View view) {
        Intent intent = new Intent(department.this, department2.class);
        startActivity(intent);
    }
    public void buttn3 (View view) {
        Intent intent = new Intent(department.this, department3.class);
        startActivity(intent);
    }
    public void buttn4 (View view) {
        Intent intent = new Intent(department.this, department4.class);
        startActivity(intent);
    }
    public void buttn5 (View view) {
        Intent intent = new Intent(department.this, department5.class);
        startActivity(intent);
    }
    public void buttn6 (View view) {
        Intent intent = new Intent(department.this, department6.class);
        startActivity(intent);
    }
    public void buttn7 (View view) {
        Intent intent = new Intent(department.this, department7.class);
        startActivity(intent);
    }
    public void buttn8 (View view) {
        Intent intent = new Intent(department.this, department8.class);
        startActivity(intent);
    }
    public void buttn9 (View view) {
        Intent intent = new Intent(department.this, department9.class);
        startActivity(intent);
    }
    public void buttn10 (View view) {
        Intent intent = new Intent(department.this, department10.class);
        startActivity(intent);
    }
    public void buttn11 (View view) {
        Intent intent = new Intent(department.this, department11.class);
        startActivity(intent);
    }
      public void buttn12 (View view) {
          Intent intent = new Intent(department.this, department12.class);
          startActivity(intent);
      }

}
