package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndScreen extends AppCompatActivity {

    Button mainMenuEndBTN;
    TextView endGameTV;
    TextView timeTakenTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);
        if(savedInstanceState == null){
            mainMenuEndBTN = findViewById(R.id.mainMenuEndBTN);
            endGameTV = findViewById(R.id.endGameTV);
            timeTakenTV = findViewById(R.id.timeTakenTV);
        }
        mainMenuEndBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    //End Game Screen when player beats the game will be here
    //Will show how long user took to beat the game(will only run when the user is playing a level)
}