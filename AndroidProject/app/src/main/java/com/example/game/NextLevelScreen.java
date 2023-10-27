package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextLevelScreen extends AppCompatActivity {

    Button nextLevelBTN;
    TextView levelCompleteTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_level_screen);
        if(savedInstanceState == null){
            nextLevelBTN = findViewById(R.id.nextLevelBTN);
            levelCompleteTV = findViewById(R.id.levelCompleteTV);
        }
        nextLevelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelScreen.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    //Screen that will take player to the next level
    //Must know the current level in order to display correct next level
    //If seamless transitions are possible, this activity may be removed
}