package com.example.casper.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import cz.mendelu.busItWeek.library.StoryLine;
import cz.mendelu.busItWeek.library.Task;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";

    private StoryLine storyLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyLine = StoryLine.open(this,MyDemoStoryLineDBHelper.class);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startTheGame(View view) {
       // Toast.makeText(this,"start",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"User clicked the start button");
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
//        Intent intent = new Intent(this, ChallengeActivity.class);
//        intent.putExtra("text", "Get to the BLACKSMITH safdsaf");
//        intent.putExtra("image", "challenge_blacksmith");
//        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Task task = storyLine.currentTask();
        if (task == null){
            //no more tasks. User is finished
        }
    }
}
