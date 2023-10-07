package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PauseEndScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause_end_screen);
    }

    //Pause Screen to go back to main menu will be here
    //End Game Screen when player beats the game will be here
    //Will show how long user took to beat the game(will only run when the user is playing a level)
    //Previous line may change if it is possible to do a seamless transition between levels
}