package com.example.game;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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
    Button levelTenBTN;
    TextView levelSelectTV;
    LevelOneFragment fragOne;
    LevelTwoFragment fragTwo;
    LevelThreeFragment fragThree;
    LevelFourFragment fragFour;
    LevelFiveFragment fragFive;
    LevelSixFragment fragSix;
    LevelSevenFragment fragSeven;
    LevelEightFragment fragEight;
    LevelNineFragment fragNine;
    LevelTenFragment fragTen;

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
            levelTenBTN = findViewById(R.id.levelTenBTN);
            levelSelectTV = findViewById(R.id.levelSelectTV);
            fragOne = new LevelOneFragment();
            fragTwo = new LevelTwoFragment();
            fragThree = new LevelThreeFragment();
            fragFour = new LevelFourFragment();
            fragFive = new LevelFiveFragment();
            fragSix = new LevelSixFragment();
            fragSeven = new LevelSevenFragment();
            fragEight = new LevelEightFragment();
            fragNine = new LevelNineFragment();
            fragTen = new LevelTenFragment();
        }
        levelOneBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragOne);
            trans.commit();
        });
        levelTwoBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragTwo);
            trans.commit();
        });
        levelThreeBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragThree);
            trans.commit();
        });
        levelFourBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragFour);
            trans.commit();
        });
        levelFiveBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragFive);
            trans.commit();
        });
        levelSixBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragSix);
            trans.commit();
        });
        levelSevenBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragSeven);
            trans.commit();
        });
        levelEightBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragEight);
            trans.commit();
        });
        levelNineBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragNine);
            trans.commit();
        });
        levelTenBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            v.getContext().startActivity(intent);
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragTen);
            trans.commit();
        });
    }
}