package com.example.game;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LevelSelectScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select_screen);
        if(savedInstanceState == null){
            Button levelOneBTN = findViewById(R.id.levelOneBTN);
            Button levelTwoBTN = findViewById(R.id.levelTwoBTN);
            Button levelThreeBTN = findViewById(R.id.levelThreeBTN);
            Button levelFourBTN = findViewById(R.id.levelFourBTN);
            Button levelFiveBTN = findViewById(R.id.levelFiveBTN);
            Button levelSixBTN = findViewById(R.id.levelSixBTN);
            Button levelSevenBTN = findViewById(R.id.levelSevenBTN);
            Button levelEightBTN = findViewById(R.id.levelEightBTN);
            Button levelNineBTN = findViewById(R.id.levelNineBTN);
            Button levelTenBTN = findViewById(R.id.levelTenBTN);

            levelOneBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelOneActivity.class);
                startActivity(intent);
                finish();

            });
            levelTwoBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelTwoActivity.class);
                startActivity(intent);
                finish();
            });
            levelThreeBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelThreeActivity.class);
                startActivity(intent);
                finish();
            });
            levelFourBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelFourActivity.class);
                startActivity(intent);
                finish();
            });
            levelFiveBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelFiveActivity.class);
                startActivity(intent);
                finish();
            });
            levelSixBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelSixActivity.class);
                startActivity(intent);
                finish();
            });
            levelSevenBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelSevenActivity.class);
                startActivity(intent);
                finish();
            });
            levelEightBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelEightActivity.class);
                startActivity(intent);
                finish();
            });
            levelNineBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelNineActivity.class);
                startActivity(intent);
                finish();
            });
            levelTenBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelTenActivity.class);
                startActivity(intent);
                finish();
            });
        }
    }
}