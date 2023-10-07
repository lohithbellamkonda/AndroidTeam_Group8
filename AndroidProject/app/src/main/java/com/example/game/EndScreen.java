package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EndScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);
    }

    //End Game Screen when player beats the game will be here
    //Will show how long user took to beat the game(will only run when the user is playing a level)
}