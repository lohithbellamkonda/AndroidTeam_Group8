package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        if(savedInstanceState == null){
            Button newGameBTN = findViewById(R.id.newGameBTN);
            Button levelSelectBTN = findViewById(R.id.levelSelectBTN);

            newGameBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelOneActivity.class);
                startActivity(intent);
            });
            levelSelectBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, LevelSelectScreen.class);
                startActivity(intent);
                finish();
            });
        }
    }
}