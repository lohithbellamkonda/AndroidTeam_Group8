package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LevelScreen extends AppCompatActivity {

    Button pauseBTN;
    TextView levelTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_screen);
        if(savedInstanceState == null){
            pauseBTN = findViewById(R.id.pauseBTN);
            levelTV = findViewById(R.id.levelTV);
        }
        pauseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PauseScreen.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    //Where the level will be shown
}