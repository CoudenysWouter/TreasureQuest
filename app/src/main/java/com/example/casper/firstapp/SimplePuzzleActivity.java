package com.example.casper.firstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import cz.mendelu.busItWeek.library.Puzzle;
import cz.mendelu.busItWeek.library.SimplePuzzle;
import cz.mendelu.busItWeek.library.StoryLine;
import cz.mendelu.busItWeek.library.Task;

public class SimplePuzzleActivity extends AppCompatActivity {
    private EditText answer;
    private TextView question;
    private ImageView image;

    private StoryLine storyLine;
    private Task currentTask;
    private SimplePuzzle puzzle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_puzzle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        answer = findViewById(R.id.answer);
        question = findViewById(R.id.question);
        image = findViewById(R.id.image);
        question.setText("Something");



        storyLine = StoryLine.open(this,MyDemoStoryLineDBHelper.class);
        currentTask = storyLine.currentTask();
        puzzle = (SimplePuzzle) currentTask.getPuzzle();

//        String hint = puzzle.getHint();
//        String hint = getResources().getIdentifier(hint, "drawable", this.getPackageName());

        Integer id = Integer.parseInt(String.valueOf(puzzle.getId()));

        switch ( id ) {
            case 1:
                image.setImageResource(R.drawable.sword);
                break;
        }

        Log.i("HELLO AAAAAAAAAAAAAAAA", "BBBBBBBBBBBBBBBBBBBBBBBBB " + id);

        question.setText(puzzle.getQuestion());
        image.setImageResource(R.drawable.sword);
        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

    }
    public void answerQuestion(View view){
        String userAnswer = answer.getText().toString();
        String correctAnswer = puzzle.getAnswer();
        if (userAnswer.equalsIgnoreCase(correctAnswer)){
            //correct answer
            storyLine.currentTask().finish(true);
            finish();
        } else {
            //wrong answer
            Toast.makeText(this,"Wrong answer",Toast.LENGTH_SHORT).show();
        }

    }


}
