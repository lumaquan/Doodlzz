package com.example.luismauricio.doodlzz;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifecycleActivity extends AppCompatActivity {
    public static final String TAG = "DEADPOOL";
    private String name = getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate in Activity: " + name);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "onBackPressed in Activity: " + name);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart in Activity: " + name);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume in Activity: " + name);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause in Activity: " + name);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop in Activity: " + name);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy in Activity: " + name);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart in Activity: " + name);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState in Activity: " + name);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState in Activity: " + name);
    }
}
