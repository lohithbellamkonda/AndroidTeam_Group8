package com.example.game;
// project
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {

    Button startBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        if(savedInstanceState == null){
            startBTN = findViewById(R.id.startBTN);
        }
        startBTN.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), MainScreen.class);
            v.getContext().startActivity(intent);
        });
    }
}