package com.example.momen.test;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;
    Button _btnLogin;
    EditText _txtEmail, _txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        openHelper=new DatabaseHelper(this);
        _txtEmail=(EditText)findViewById(R.id.txtEmail);
        _txtPass=(EditText)findViewById(R.id.txtPass);
        _btnLogin=(Button)findViewById(R.id.btnLogin);
        final Intent intent =new Intent(this,Main4Activity.class);


        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db = openHelper.getReadableDatabase();
                String email = _txtEmail.getText().toString();
                String pass = _txtPass.getText().toString();
                if (email.equals("")|| pass.equals("")){
                    Toast.makeText(Main2Activity.this,"من فضلك تاكد من كتابه البريد الإلكترونى وكلمه المرور.!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "مرحبا بك", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }




            }
        });

    }


    public void Butt_reg(View view){
        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
    }
    public void visitor(View view){
        Intent intent=new Intent(Main2Activity.this,visit1.class);
        startActivity(intent);
    }
}
