package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    Button newGameBTN;
    Button levelSelectBTN;

    int count1 = 0;
    int count2 = 0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        if(savedInstanceState == null){
            newGameBTN = findViewById(R.id.newGameBTN);
            levelSelectBTN = findViewById(R.id.levelSelectBTN);
        }
        newGameBTN.setOnClickListener(v -> {
            if(count1 == 0){
                intent = new Intent(v.getContext(), LevelScreen.class);
                count1++;
            }
            else{
                intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
            }
            v.getContext().startActivity(intent);
        });
        levelSelectBTN.setOnClickListener(v -> {
            if(count2 == 0){
                intent = new Intent(v.getContext(), LevelSelectScreen.class);
                count2++;
            }
            else{
                intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
            }
            v.getContext().startActivity(intent);
        });
    }

    //Level Select button and New Game button will be here
}