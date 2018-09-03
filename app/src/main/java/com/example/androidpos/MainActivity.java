package com.example.androidpos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.assemblypayments.spi.Spi;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Spi spi = new Spi("androidpos", "127.0.0.1", null);
        } catch (Spi.CompatibilityException e) {
            Log.e(TAG, "Initializing SPI failed", e);
        }
    }
}
