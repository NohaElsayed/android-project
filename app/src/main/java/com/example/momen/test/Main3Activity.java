package com.example.momen.test;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    DatabaseHelper openHelper;
    SQLiteDatabase db;
    Button _btnreg, _btnlogin;
    EditText _txtfanme, _txtlname, _txtpass,_txtpass2, _txtemail, _txtphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);
        openHelper = new DatabaseHelper(this);
        _txtfanme = (EditText)findViewById(R.id.txtfname);
        _txtlname = (EditText)findViewById(R.id.txtlname);
        _txtpass = (EditText)findViewById(R.id.txtpass);
        _txtpass2 = (EditText)findViewById(R.id.txtpass2);
        _txtemail = (EditText)findViewById(R.id.txtemail);
        _txtphone = (EditText)findViewById(R.id.txtphone);
        _btnreg=(Button)findViewById(R.id.btnreg);
        final Intent intent =new Intent(this,Main2Activity.class);



        _btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db=openHelper.getWritableDatabase();
                String fname=_txtfanme.getText().toString();
                String lname=_txtlname.getText().toString();
                String pass=_txtpass.getText().toString();
                String pass2=_txtpass2.getText().toString();
                String email=_txtemail.getText().toString();
                String phone=_txtphone.getText().toString();
                insertdata(fname, lname,pass,email,phone);
                if (fname.equals("") || lname.equals("") || pass.equals("") || pass2.equals("")|| email.equals("") || phone.equals("") ) {
                    Toast.makeText(Main3Activity.this, "من فضلك املىء كل الحقول", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "تم التسجيل بنجاح", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
            }
        });



    }
    public void insertdata(String fname, String lname, String pass, String email, String phone){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COL_2, fname);
        contentValues.put(DatabaseHelper.COL_3, lname);
        contentValues.put(DatabaseHelper.COL_4, pass);
        contentValues.put(DatabaseHelper.COL_5, email);
        contentValues.put(DatabaseHelper.COL_6, phone);
        long id = db.insert(DatabaseHelper.TABLE_NAME, null, contentValues);

    }

}
