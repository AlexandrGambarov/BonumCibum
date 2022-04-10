package com.alexlabs.bonumcibum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * В классе Cocoa содержится рецепт пирожных с какао
 */

public class Cocoa extends AppCompatActivity {
    /**
     * Переменная типа PDFView для хранения файла рецепта
     */
    PDFView pdf_Cocoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocoa);

        /**
         * Метод закрепления режима экрана (Горизонтальный)
         */
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        /**
         * Определение id переменной pdf_TomYum
         */
        pdf_Cocoa = findViewById(R.id.pdf_Cocoa);

        /**
         * Загрузка файла на экран
         */
        pdf_Cocoa.fromAsset("cocoa_cakes.pdf").load();
    }
}