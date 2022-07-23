package com.alexlabs.bonumcibum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * В классе Soba содержится рецепт лапши Вок-Якисоба
 */

public class Soba extends AppCompatActivity {
    /**
     * Переменная типа PDFView для хранения файла рецепта
     */
    PDFView pdf_Soba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soba);

        /**
         * Метод закрепления режима экрана (Горизонтальный)
         */
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        /**
         * Определение id переменной pdf_TomYum
         */
        pdf_Soba = findViewById(R.id.pdf_Soba);

        /**
         * Загрузка файла на экран
         */
        pdf_Soba.fromAsset("Wok-Yakisoba.pdf").load();
    }
}