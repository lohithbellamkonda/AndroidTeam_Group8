package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    Button newGameBTN;
    Button levelSelectBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        if(savedInstanceState == null){
            newGameBTN = findViewById(R.id.newGameBTN);
            levelSelectBTN = findViewById(R.id.levelSelectBTN);
        }
        newGameBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
        levelSelectBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelSelectScreen.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    //Level Select button and New Game button will be here
}