package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        if(savedInstanceState == null){
            Button startBTN = findViewById(R.id.startBTN);

            startBTN.setOnClickListener(v -> {
                Intent intent = new Intent(this, MainScreen.class);
                startActivity(intent);
            });
        }
    }
}