package com.example.casper.firstapp;

import cz.mendelu.busItWeek.library.StoryLineDatabaseHelper;
import cz.mendelu.busItWeek.library.builder.StoryLineBuilder;

/**
 * Created by Casper on 2/6/2018.
 */

public class MyDemoStoryLineDBHelper extends StoryLineDatabaseHelper {

    public MyDemoStoryLineDBHelper() {
        super(32);
    }

    @Override
    protected void onCreate(StoryLineBuilder builder) {
//        builder.addGPSTask("Mushrooms")
//                .radius(10)
//                .location(49.210346, 16.616325)
//                .victoryPoints(5)
//                .choicePuzzle()
//                .question("Which musroom is poisonous?")
//                .addChoice("Brussels",false)
//                .addChoice("Brno",true)
//                .addChoice("Paris",false)
//                .addChoice("London",false)
//                .puzzleDone()
//                .taskDone();
////        builder.addBeaconTask("2")
////                .location(49.210451, 16.614749)
////                .beacon(5635,2481)
////                .choicePuzzle()
////                .question("What is the best city in the world?")
////                .addChoice("Brussels",false)
////                .addChoice("Brno",true)
////                .addChoice("Paris",false)
////                .addChoice("London",false)
////                .puzzleDone()
////                .taskDone();
////

        builder.addGPSTask("SWORDS")
                .radius(500)
                .location(49.209871, 16.614903)
                .simplePuzzle()
                .question("How many swords do you see?")
                .answer("33")
                .puzzleDone()
                .taskDone();

        builder.addGPSTask("MUSHROOM")
                .radius(15)
                .location(49.210158, 16.614592)
                .imageSelectPuzzle()
                .question("Which mushroom is the poisonous one?")
                .addImage(R.drawable.mushroom_black, false)
                .addImage(R.drawable.mushroom_amanita, true)
                .addImage(R.drawable.mushroom_boletus, false)
                .addImage(R.drawable.mushroom_white, false)
                .puzzleDone()
                .taskDone();

    }
}
