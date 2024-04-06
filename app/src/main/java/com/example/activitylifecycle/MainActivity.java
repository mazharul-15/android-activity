package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LifeCycle1", "onCreate() method is executed");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("lifecycle1", "onStart() method is executed");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("lifecycle1", "onResume() method is executed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("lifecycle1", "onPause() method is executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle1", "onStop() method is executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("lifecycle1", "onRestart() method is executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("lifecycle1", "onDestroy() method is executed");
    }
}