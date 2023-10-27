package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelSelectScreen extends AppCompatActivity {

    Button levelOneBTN;
    Button levelTwoBTN;
    Button levelThreeBTN;
    Button levelFourBTN;
    Button levelFiveBTN;
    Button levelSixBTN;
    Button levelSevenBTN;
    Button levelEightBTN;
    Button levelNineBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select_screen);
        if(savedInstanceState == null){
            levelOneBTN = findViewById(R.id.levelOneBTN);
            levelTwoBTN = findViewById(R.id.levelTwoBTN);
            levelThreeBTN = findViewById(R.id.levelThreeBTN);
            levelFourBTN = findViewById(R.id.levelFourBTN);
            levelFiveBTN = findViewById(R.id.levelFiveBTN);
            levelSixBTN = findViewById(R.id.levelSixBTN);
            levelSevenBTN = findViewById(R.id.levelSevenBTN);
            levelEightBTN = findViewById(R.id.levelEightBTN);
            levelNineBTN = findViewById(R.id.levelNineBTN);
        }
        levelOneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        levelTwoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        levelThreeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        levelFourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        levelFiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        levelSixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        levelSevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        levelEightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        levelNineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    //Will add a number of buttons to the layout, in which number will be determined later
}