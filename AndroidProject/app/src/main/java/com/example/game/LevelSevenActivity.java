package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class LevelSevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_seven);

        //Find All Buttons
        Button plus_oneBTN = findViewById(R.id.plus_oneBTN);
        Button minus_oneBTN = findViewById(R.id.minus_oneBTN);
        Button mult_oneBTN = findViewById(R.id.mult_oneBTN);
        Button div_oneBTN = findViewById(R.id.div_oneBTN);
        Button plus_twoBTN = findViewById(R.id.plus_twoBTN);
        Button minus_twoBTN = findViewById(R.id.minus_twoBTN);
        Button mult_twoBTN = findViewById(R.id.mult_twoBTN);
        Button div_twoBTN = findViewById(R.id.div_twoBTN);
        Button sqrt_wholeBTN = findViewById(R.id.sqrt_wholeBTN);
        Button factorial_whole = findViewById(R.id.factorial_wholeBTN);
        Button sqrt_oneBTN = findViewById(R.id.sqrt_oneBTN);
        Button factorial_oneBTN = findViewById(R.id.factorial_oneBTN);
        Button sqrt_twoBTN = findViewById(R.id.sqrt_twoBTN);
        Button factorial_twoBTN = findViewById(R.id.factorial_twoBTN);
        Button sqrt_threeBTN = findViewById(R.id.sqrt_threeBTN);
        Button factorial_threeBTN = findViewById(R.id.factorial_threeBTN);
        Button submitBTN = findViewById(R.id.submitBTN);

        //Selection Buttons
        plus_oneBTN.setOnClickListener(v -> plus_oneBTN.setEnabled(false));
        minus_oneBTN.setOnClickListener(v -> minus_oneBTN.setEnabled(false));
        mult_oneBTN.setOnClickListener(v -> mult_oneBTN.setEnabled(false));
        div_oneBTN.setOnClickListener(v -> div_oneBTN.setEnabled(false));
        plus_twoBTN.setOnClickListener(v -> plus_twoBTN.setEnabled(false));
        minus_twoBTN.setOnClickListener(v -> minus_twoBTN.setEnabled(false));
        mult_twoBTN.setOnClickListener(v -> mult_twoBTN.setEnabled(false));
        div_twoBTN.setOnClickListener(v -> div_twoBTN.setEnabled(false));
        sqrt_wholeBTN.setOnClickListener(v -> sqrt_wholeBTN.setEnabled(false));
        factorial_whole.setOnClickListener(v -> factorial_whole.setEnabled(false));
        sqrt_oneBTN.setOnClickListener(v -> sqrt_oneBTN.setEnabled(false));
        factorial_oneBTN.setOnClickListener(v -> factorial_oneBTN.setEnabled(false));
        sqrt_twoBTN.setOnClickListener(v -> sqrt_twoBTN.setEnabled(false));
        factorial_twoBTN.setOnClickListener(v -> factorial_twoBTN.setEnabled(false));
        sqrt_threeBTN.setOnClickListener(v -> sqrt_threeBTN.setEnabled(false));
        factorial_threeBTN.setOnClickListener(v -> factorial_threeBTN.setEnabled(false));

        //Submit Button
        submitBTN.setOnClickListener(v -> {
            submitBTN.setEnabled(false);
            if(!(plus_oneBTN.isEnabled() && minus_twoBTN.isEnabled())){
                Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, LevelEightActivity.class);
                startActivity(intent);
                finish();
            }
            else{
                Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_LONG).show();
                plus_oneBTN.setEnabled(true);
                minus_oneBTN.setEnabled(true);
                mult_oneBTN.setEnabled(true);
                div_oneBTN.setEnabled(true);
                plus_twoBTN.setEnabled(true);
                minus_twoBTN.setEnabled(true);
                mult_twoBTN.setEnabled(true);
                div_twoBTN.setEnabled(true);
                sqrt_wholeBTN.setEnabled(true);
                factorial_whole.setEnabled(true);
                sqrt_oneBTN.setEnabled(true);
                factorial_oneBTN.setEnabled(true);
                sqrt_twoBTN.setEnabled(true);
                factorial_twoBTN.setEnabled(true);
                sqrt_threeBTN.setEnabled(true);
                factorial_threeBTN.setEnabled(true);
                submitBTN.setEnabled(true);
            }
        });
    }
}