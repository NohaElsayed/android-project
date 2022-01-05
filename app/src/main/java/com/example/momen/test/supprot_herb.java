package com.example.momen.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class supprot_herb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_supprot_herb);

        SmileRating smileRating=(SmileRating)findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {
                switch (smiley) {
                    case SmileRating.BAD:
                        Toast.makeText(supprot_herb.this, "BAD", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(supprot_herb.this, "GOOD", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(supprot_herb.this, "GREAT", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(supprot_herb.this, "OKAY", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.TERRIBLE:
                        Toast.makeText(supprot_herb.this, "TERRIBLE", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
            @Override
            public void onRatingSelected(int level, boolean reselected) {
                Toast.makeText(supprot_herb.this, "Selected rating"+level, Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void gorate(View view){
        String phonenum="01008258938";
        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(" tel:"+ phonenum));
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    public void web(View view){
        Intent website=new Intent(Intent.ACTION_VIEW);
        website.setData(Uri.parse("https://www.facebook.com/MemoOo.mo7med"));
        if (website.resolveActivity(getPackageManager()) !=null ){
            startActivity(website);
        }
    }


}

