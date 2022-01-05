package com.example.momen.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class supprot extends AppCompatActivity {
    String s;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_supprot);

        SmileRating smileRating=(SmileRating)findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {
                switch (smiley) {
                    case SmileRating.BAD:
                        Toast.makeText(supprot.this, "BAD", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(supprot.this, "GOOD", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(supprot.this, "GREAT", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(supprot.this, "OKAY", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.TERRIBLE:
                        Toast.makeText(supprot.this, "TERRIBLE", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
            @Override
            public void onRatingSelected(int level, boolean reselected) {
                Toast.makeText(supprot.this, "Selected rating"+level, Toast.LENGTH_SHORT).show();

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



    String lang="30.363580",mag="31.483675";
    String lang1="30.3687682",mag1="31.4948956";
    String lang2="30.270744",mag2="31.480911";
    String lang3="30.421731",mag3="31.560658";
    String lang4="30.400619",mag4="31.552677";
    String lang5="30.363580",mag5="31.483675";
    String lang6="30.363580",mag6="31.483675";
    String lang7="30.363580",mag7="31.483675";
    String lang8="30.363580",mag8="31.483675";
    String lang9="30.363580",mag9="31.483675";
    String lang10="30.363580",mag10="31.483675";
    public void go(View view){
        uri = Uri.parse("google.navigation:q="+lang4+","+mag4);
        final Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}
