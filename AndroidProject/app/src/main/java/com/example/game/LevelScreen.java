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
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
            if(bundle.containsKey("levelTwo")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
            if(bundle.containsKey("levelThree")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
            if(bundle.containsKey("levelFour")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
            if(bundle.containsKey("levelFive")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
            if(bundle.containsKey("levelSix")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
            if(bundle.containsKey("levelSeven")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
            if(bundle.containsKey("levelEight")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
            if(bundle.containsKey("levelNine")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
            if(bundle.containsKey("levelTen")) {
                Boolean getPlusOne = bundle.getBoolean("plusOne");
                Boolean getMinusOne = bundle.getBoolean("minusOne");
                Boolean getMultOne = bundle.getBoolean("multOne");
                Boolean getDivOne = bundle.getBoolean("divOne");
                Boolean getPlusTwo = bundle.getBoolean("plusTwo");
                Boolean getMinusTwo = bundle.getBoolean("minusTwo");
                Boolean getMultTwo = bundle.getBoolean("multTwo");
                Boolean getDivTwo = bundle.getBoolean("divTwo");
                Boolean getSqrtOne = bundle.getBoolean("sqrtOne");
                Boolean getFactorialOne = bundle.getBoolean("factorialOne");
                Boolean getSqrtTwo = bundle.getBoolean("sqrtTwo");
                Boolean getFactorialTwo = bundle.getBoolean("factorialTwo");
                Boolean getSqrtThree = bundle.getBoolean("sqrtThree");
                Boolean getFactorialThree = bundle.getBoolean("factorialThree");
            }
        }
    }

    public void onSuccess(){
        Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_LONG).show();
        FragmentManager mgr = getSupportFragmentManager();
        FragmentTransaction trans = mgr.beginTransaction();
        trans.replace(R.id.fragmentContainerView, fragTwo);
        trans.commit();
    }

    public void onFailure(){
        Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_LONG).show();
    }
}