package com.example.game;
// project
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartScreen extends AppCompatActivity {

    Button startBTN;
    TextView accountTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        if(savedInstanceState == null){
            startBTN = findViewById(R.id.startBTN);
            accountTV = findViewById(R.id.accountTV);
        }
        startBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    //Start button and Player account will be here
}