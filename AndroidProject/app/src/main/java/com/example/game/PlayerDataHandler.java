package com.example.game;

import android.content.Context;
import android.content.SharedPreferences;

public class PlayerDataHandler {

    private static final String PREFS_NAME = "PlayerPrefs";
    private static final String KEY_PLAYER_NAME = "playerName";
    private static final String KEY_PLAYER_SCORE = "playerScore";

    public static void savePlayerData(Context context, String playerName, int playerScore) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(KEY_PLAYER_NAME, playerName);
        editor.putInt(KEY_PLAYER_SCORE, playerScore);

        editor.apply();
    }

    public static String getPlayerName(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(KEY_PLAYER_NAME, "");
    }

    public static int getPlayerScore(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(KEY_PLAYER_SCORE, 0);
    }
}

