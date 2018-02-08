package com.example.casper.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by jan on 8/02/18.
 */

public class ForestActivity extends AppCompatActivity {
    private static final String TAG ="ForestActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest);
    }
    public void startTheGame(View view) {
        // Toast.makeText(this,"start",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"User clicked the continue button");
// change to the exact location where to go
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }
}
