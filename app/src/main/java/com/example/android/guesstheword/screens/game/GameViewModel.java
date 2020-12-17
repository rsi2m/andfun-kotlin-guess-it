package com.example.android.guesstheword.screens.game;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class GameViewModel extends ViewModel {

    static {
        Log.i("GameViewModel", "Init block");
    }

    @Override
    protected void onCleared() {
        Log.i("GameViewModel", "OnCleared called!");
        super.onCleared();
    }
}
