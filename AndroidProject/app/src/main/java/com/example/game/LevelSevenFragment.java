package com.example.game;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LevelSevenFragment extends Fragment {

    public LevelSevenFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Button plus_oneBTN = requireView().findViewById(R.id.plus_oneBTN);
        Button minus_oneBTN = requireView().findViewById(R.id.minus_oneBTN);
        Button mult_oneBTN = requireView().findViewById(R.id.mult_oneBTN);
        Button div_oneBTN = requireView().findViewById(R.id.div_oneBTN);
        Button plus_twoBTN = requireView().findViewById(R.id.plus_twoBTN);
        Button minus_twoBTN = requireView().findViewById(R.id.minus_twoBTN);
        Button mult_twoBTN = requireView().findViewById(R.id.mult_twoBTN);
        Button div_twoBTN = requireView().findViewById(R.id.div_twoBTN);
        Button sqrt_oneBTN = requireView().findViewById(R.id.sqrt_oneBTN);
        Button factorial_oneBTN = requireView().findViewById(R.id.factorial_oneBTN);
        Button sqrt_twoBTN = requireView().findViewById(R.id.sqrt_twoBTN);
        Button factorial_twoBTN = requireView().findViewById(R.id.factorial_twoBTN);
        Button sqrt_threeBTN = requireView().findViewById(R.id.sqrt_threeBTN);
        Button factorial_threeBTN = requireView().findViewById(R.id.factorial_threeBTN);
        Button submitBTN = requireView().findViewById(R.id.submitBTN);
        plus_oneBTN.setOnClickListener(v -> plus_oneBTN.setEnabled(false));
        minus_oneBTN.setOnClickListener(v -> minus_oneBTN.setEnabled(false));
        mult_oneBTN.setOnClickListener(v -> mult_oneBTN.setEnabled(false));
        div_oneBTN.setOnClickListener(v -> div_oneBTN.setEnabled(false));
        plus_twoBTN.setOnClickListener(v -> plus_twoBTN.setEnabled(false));
        minus_twoBTN.setOnClickListener(v -> minus_twoBTN.setEnabled(false));
        mult_twoBTN.setOnClickListener(v -> mult_twoBTN.setEnabled(false));
        div_twoBTN.setOnClickListener(v -> div_twoBTN.setEnabled(false));
        sqrt_oneBTN.setOnClickListener(v -> sqrt_oneBTN.setEnabled(false));
        factorial_oneBTN.setOnClickListener(v -> factorial_oneBTN.setEnabled(false));
        sqrt_twoBTN.setOnClickListener(v -> sqrt_twoBTN.setEnabled(false));
        factorial_twoBTN.setOnClickListener(v -> factorial_twoBTN.setEnabled(false));
        sqrt_threeBTN.setOnClickListener(v -> sqrt_threeBTN.setEnabled(false));
        factorial_threeBTN.setOnClickListener(v -> factorial_threeBTN.setEnabled(false));
        submitBTN.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), LevelScreen.class);
            if(!plus_oneBTN.isEnabled()){
                intent.putExtra("plusOne", true);
            }
            if(!minus_oneBTN.isEnabled()){
                intent.putExtra("minusOne", true);
            }
            if(!mult_oneBTN.isEnabled()){
                intent.putExtra("multOne", true);
            }
            if(!div_oneBTN.isEnabled()){
                intent.putExtra("divOne", true);
            }
            if(!plus_twoBTN.isEnabled()){
                intent.putExtra("plusTwo", true);
            }
            if(!minus_twoBTN.isEnabled()){
                intent.putExtra("minusTwo", true);
            }
            if(!mult_twoBTN.isEnabled()){
                intent.putExtra("multTwo", true);
            }
            if(!div_twoBTN.isEnabled()){
                intent.putExtra("divTwo", true);
            }
            if(!sqrt_oneBTN.isEnabled()){
                intent.putExtra("sqrtOne", true);
            }
            if(!factorial_oneBTN.isEnabled()){
                intent.putExtra("factorialOne", true);
            }
            if(!sqrt_twoBTN.isEnabled()){
                intent.putExtra("sqrtTwo", true);
            }
            if(!factorial_twoBTN.isEnabled()){
                intent.putExtra("factorialTwo", true);
            }
            if(!sqrt_threeBTN.isEnabled()){
                intent.putExtra("sqrtThree", true);
            }
            if(!factorial_threeBTN.isEnabled()){
                intent.putExtra("factorialThree", true);
            }
            intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
            startActivity(intent);
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_level_seven, container, false);
    }
}