package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    TextView levelSelectTV;

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
            levelSelectTV = findViewById(R.id.levelSelectTV);
        }
        levelOneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
        levelTwoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
        levelThreeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
        levelFourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
        levelFiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
        levelSixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
        levelSevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
        levelEightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
        levelNineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    //Will add a number of buttons to the layout, in which number will be determined later
}