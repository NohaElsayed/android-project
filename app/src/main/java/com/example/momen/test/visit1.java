package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class visit1 extends AppCompatActivity {
    Spinner spinner,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_visit1);
        spinner=(Spinner)findViewById(R.id.spinner);
        spinner2=(Spinner)findViewById(R.id.spinner2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String name= spinner.getSelectedItem().toString();
                int idSpinner=getResources().getIdentifier(name,"array",visit1.this.getPackageName());
                ArrayAdapter<String> spinnerArrayAdapter=new ArrayAdapter<String>(visit1.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(idSpinner));
                spinner2.setAdapter(spinnerArrayAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void visit1(View view){
        Intent intent=new Intent(this,visit2.class);
        startActivity(intent);

    }

}
