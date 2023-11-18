package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PauseScreen extends AppCompatActivity {

    Button mainMenuBTN;
    Button resumeBTN;
    TextView pausedTV;
    TextView currentLevelTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause_screen);
        if(savedInstanceState == null){
            mainMenuBTN = findViewById(R.id.mainMenuBTN);
            resumeBTN = findViewById(R.id.resumeBTN);
            pausedTV = findViewById(R.id.pausedTV);
            currentLevelTV = findViewById(R.id.currentLevelTV);
        }
        mainMenuBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), MainScreen.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
            v.getContext().startActivity(intent);
        });
        resumeBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LevelScreen.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
            v.getContext().startActivity(intent);
        });
    }

    //Pause Screen to go back to main menu or resume the game will be here
}