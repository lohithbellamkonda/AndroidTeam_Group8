package com.example.game;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class LevelScreen extends AppCompatActivity implements CommunicationInterface{

    Button pauseBTN;
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
    int level;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_screen);
        if(savedInstanceState == null){
            pauseBTN = findViewById(R.id.pauseBTN);
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
        pauseBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), PauseScreen.class);
            v.getContext().startActivity(intent);
        });

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            if(bundle.containsKey("levelOne")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");

                if(getPlusOne && getPlusTwo && getFactorialOne && getFactorialTwo && getFactorialThree){
                    level = 2;
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
            if(bundle.containsKey("levelTwo")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");

                if(getPlusOne && getPlusTwo && getFactorialOne && getFactorialTwo && getFactorialThree){
                    level = 3;
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
            if(bundle.containsKey("levelThree")) {
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivTwo = bundle.getBoolean("divTwo");

                if(getMultOne && getDivTwo){
                    level = 4;
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
            if(bundle.containsKey("levelFour")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");

                if(getPlusOne && getMinusTwo){
                    level = 5;
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
            if(bundle.containsKey("levelFive")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");

                if(getPlusOne && getPlusTwo && getSqrtOne && getSqrtTwo && getSqrtThree){
                    level = 6;
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
            if(bundle.containsKey("levelSix")) {
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");

                if(getDivOne && getPlusTwo){
                    level = 7;
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
            if(bundle.containsKey("levelSeven")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");

                if(getPlusOne && getMinusTwo){
                    level = 8;
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
            if(bundle.containsKey("levelEight")) {
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");

                if(getDivOne && getMinusTwo){
                    level = 9;
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
            if(bundle.containsKey("levelNine")) {
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");

                if(getDivOne && getPlusTwo && getSqrtOne && getFactorialThree){
                    level = 10;
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
            if(bundle.containsKey("levelTen")) {
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");

                if(getMultOne && getMinusTwo && getSqrtOne && getSqrtTwo && getSqrtThree){
                    onSuccess();
                }
                else{
                    onFailure();
                }
            }
        }
    }

    public void onSuccess(){
        Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_LONG).show();
        if(level == 2){
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragTwo);
            trans.commit();
        }
        if(level == 3){
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragThree);
            trans.commit();
        }
        if(level == 4){
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragFour);
            trans.commit();
        }
        if(level == 5){
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragFive);
            trans.commit();
        }
        if(level == 6){
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragSix);
            trans.commit();
        }
        if(level == 7){
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragSeven);
            trans.commit();
        }
        if(level == 8){
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragEight);
            trans.commit();
        }
        if(level == 9){
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragNine);
            trans.commit();
        }
        if(level == 10){
            FragmentManager mgr = getSupportFragmentManager();
            FragmentTransaction trans = mgr.beginTransaction();
            trans.replace(R.id.fragmentContainerView, fragTen);
            trans.commit();
        }
    }

    public void onFailure(){
        Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_LONG).show();
        Bundle bundle = new Bundle();
        bundle.putString("result", "Incorrect");
        fragOne.setArguments(bundle);
    }
}