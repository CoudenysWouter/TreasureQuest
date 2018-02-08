package com.example.casper.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChallengeActivity extends AppCompatActivity {

    private TextView description;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

        description = findViewById(R.id.description);
        image = findViewById(R.id.image);

        description.setText("i am from a far land");

        String text = getIntent().getStringExtra("text");
        String imageName = getIntent().getStringExtra("image");

        int imageResourceId = getResources().getIdentifier(imageName, "drawable", this.getPackageName());

        description.setText(text);
        image.setImageResource(imageResourceId);

//        check for null

    }

    public void showMap(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
