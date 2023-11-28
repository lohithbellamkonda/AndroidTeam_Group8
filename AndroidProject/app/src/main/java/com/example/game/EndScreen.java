package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class EndScreen extends AppCompatActivity {

    Button mainMenuEndBTN;
    TextView endGameTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);
        if(savedInstanceState == null){
            mainMenuEndBTN = findViewById(R.id.mainMenuEndBTN);
            endGameTV = findViewById(R.id.endGameTV);

            mainMenuEndBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, MainScreen.class);
                startActivity(intent);
            });
        }
    }
}