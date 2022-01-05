package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DepartmentOfHerps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_department_of_herps);
    }
    public void btn1 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department1herp.class);
        startActivity(intent);
    }
    public void btn2 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department2herp.class);
        startActivity(intent);
    }
    public void btn3 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department3herp.class);
        startActivity(intent);
    }
    public void btn4 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department4herp.class);
        startActivity(intent);
    }
    public void btn5 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department5herp.class);
        startActivity(intent);
    }
    public void btn6 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department6herp.class);
        startActivity(intent);
    }
    public void btn7 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department7herp.class);
        startActivity(intent);
    }
    public void btn8 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department8herp.class);
        startActivity(intent);
    }
    public void btn9 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department9herp.class);
        startActivity(intent);
    }
    public void btn10 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department10herp.class);
        startActivity(intent);
    }
    public void btn11 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, departmenthe11herp.class);
        startActivity(intent);
    }
    public void btn12 (View view) {
        Intent intent = new Intent(DepartmentOfHerps.this, department12herp.class);
        startActivity(intent);
    }

}
