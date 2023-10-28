package com.example.game;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

public class PlayerDataHandler {

    private static final String PREFS_NAME = "PlayerPrefs";
    private static final String KEY_PLAYER_NAME = "playerName";
    private static final String KEY_PLAYER_SCORE = "playerScore";
    private static final String KEY_HIGH_SCORE = "highScore";
    private static final String KEY_PLAYER_LEVEL = "playerLevel";

    public static void savePlayerData(@NonNull Context context, String playerName, int playerScore, int highScore, int playerLevel) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(KEY_PLAYER_NAME, playerName);
        editor.putInt(KEY_PLAYER_SCORE, playerScore);
        editor.putInt(KEY_HIGH_SCORE, highScore);
        editor.putInt(KEY_PLAYER_LEVEL, playerLevel);
        editor.apply();
    }

    public static String getPlayerName(@NonNull Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(KEY_PLAYER_NAME, "");
    }

    public static int getPlayerScore(@NonNull Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(KEY_PLAYER_SCORE, 0);
    }

    public static int getHighScore(@NonNull Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(KEY_HIGH_SCORE, 0);
    }

    public static int getPlayerLevel(@NonNull Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(KEY_PLAYER_LEVEL, 1);
    }
}

