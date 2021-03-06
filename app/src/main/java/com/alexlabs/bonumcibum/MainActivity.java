package com.alexlabs.bonumcibum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;

/**
 * MainActivity приложения
 * @author AlexLabs
 * Это загрузочный экран, который видит пользователь
 */
public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Метод закрепления режима экрана (Вертикальный)
         */
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // Orientation

        /**
         * Переход с экрана MainActivity на экран HomeActivity
         */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}