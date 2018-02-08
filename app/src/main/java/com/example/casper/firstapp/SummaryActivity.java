package com.example.casper.firstapp;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SummaryActivity extends AppCompatActivity {
    private static final String TAG ="SummaryActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
    }
    public void startTheGame(View view) {
        // Toast.makeText(this,"start",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"User clicked the continue button");
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }
}
