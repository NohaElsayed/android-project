package com.example.momen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main4Activity extends AppCompatActivity {
    Spinner spinner,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main4);
        spinner=(Spinner)findViewById(R.id.spinner);
        spinner2=(Spinner)findViewById(R.id.spinner2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String name= spinner.getSelectedItem().toString();
                int idSpinner=getResources().getIdentifier(name,"array",Main4Activity.this.getPackageName());
                ArrayAdapter<String> spinnerArrayAdapter=new ArrayAdapter<String>(Main4Activity.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(idSpinner));
                spinner2.setAdapter(spinnerArrayAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void Butt_next(View view){
        Intent intent=new Intent(this,Main5Activity.class);
        startActivity(intent);

    }

    }

