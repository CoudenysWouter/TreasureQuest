package com.example.casper.firstapp;

import cz.mendelu.busItWeek.library.StoryLineDatabaseHelper;
import cz.mendelu.busItWeek.library.builder.StoryLineBuilder;

/**
 * Created by Casper on 2/6/2018.
 */

public class MyDemoStoryLineDBHelper extends StoryLineDatabaseHelper {

    public MyDemoStoryLineDBHelper() {
        super(19);
    }

    @Override
    protected void onCreate(StoryLineBuilder builder) {
        builder.addGPSTask("1")
                .radius(1000)
                .location(49.209543, 16.614235)
                .victoryPoints(5)
                .simplePuzzle()
                .question("What is the answe to life and everything?")
                .answer("42")
                .hint("hitchhikers guide...")
                .puzzleTime(30000)
                .puzzleDone()
                .taskDone();
        builder.addBeaconTask("2")
                .location(49.210451, 16.614749)
                .beacon(5635,2481)
                .choicePuzzle()
                .question("What is the best city in the world?")
                .addChoice("Brussels",false)
                .addChoice("Brno",true)
                .addChoice("Paris",false)
                .addChoice("London",false)
                .puzzleDone()
                .taskDone();

        builder.addGPSTask("3")
                .location(49.210451, 16.614749)
                .radius(50000)
                .imageSelectPuzzle()
                .question("Select image?")
                .addImage(R.drawable.foxes_1, false)
                .addImage(R.drawable.foxes_2, false)
                .addImage(R.drawable.foxes_3, false)
                .addImage(R.drawable.foxes_4, true)
                .puzzleDone()
                .taskDone();
        builder.addCodeTask("4")
                .qr("QRcode1")
                .location(48.210451, 20.614749)
                .simplePuzzle()
                .question("Who am I?")
                .answer("Casper")
                .puzzleDone()
                .taskDone();

    }
}
