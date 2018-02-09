package com.example.casper.firstapp;

import cz.mendelu.busItWeek.library.StoryLineDatabaseHelper;
import cz.mendelu.busItWeek.library.builder.StoryLineBuilder;

/**
 * Created by Casper on 2/6/2018.
 */

public class MyDemoStoryLineDBHelper extends StoryLineDatabaseHelper {

    public MyDemoStoryLineDBHelper() {


       super(62);

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
        builder.addGPSTask("MUSHROOM")
                .radius(10)
                .location(49.210158, 16.614592)
                .imageSelectPuzzle()
                .question("Which mushroom is the poisonous one?")
                .hint("An old lady is making soup.:old_lady")
                .addImage(R.drawable.mushroom_black, false)
                .addImage(R.drawable.mushroom_amanita, true)
                .addImage(R.drawable.mushroom_boletus, false)
                .addImage(R.drawable.mushroom_white, false)
                .puzzleDone()
                .taskDone();

        builder.addGPSTask("SWORDS")
                .radius(10)
                .location(49.209871, 16.614903)
                .simplePuzzle()
                .question("How many swords do you see?")
                .hint("You arrived at the blacksmith and he is mad:blacksmith")
                .answer("33")
                .puzzleDone()
                .taskDone();

        builder.addGPSTask("Market")
                .radius(10)
                .location(49.210374, 16.613165)
                .imageSelectPuzzle()
                .question("Choose good food.")
                .hint("Hello you are at the market, please help yourself:market")
                .addImage(R.drawable.food_1, true)
                .addImage(R.drawable.food_2, false)
                .addImage(R.drawable.food_3, false)
                .addImage(R.drawable.food_4, false)
                .puzzleDone()
                .taskDone();

        builder.addGPSTask("TAVERN")
                .radius(10)
                .location(49.211057, 16.617499)
                .imageSelectPuzzle()
                .question("What is the most common beverage?")
                .hint("Hello you arrived at the tavern. The people are really drunk. You are thirsty as well. But first you need to talk to the people and make them like you.:tavern")
                .addImage(R.drawable.tavern_beer, false)
                .addImage(R.drawable.tavern_wine, false)
                .addImage(R.drawable.tavern_water, true)
                .addImage(R.drawable.tavern_milk, false)
                .puzzleDone()
                .taskDone();

    }
}
