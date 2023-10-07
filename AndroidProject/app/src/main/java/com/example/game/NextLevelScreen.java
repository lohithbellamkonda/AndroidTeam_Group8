package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NextLevelScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_level_screen);
    }

    //Screen that will take player to the next level
    //Must know the current level in order to display correct next level
    //If seamless transitions are possible, this activity may be removed
}