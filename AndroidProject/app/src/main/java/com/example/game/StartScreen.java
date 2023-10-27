package com.example.game;
// project
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                Intent intent = new Intent(v.getContext(), MainScreen.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    //Start button and Player account will be here
}