package com.alexlabs.bonumcibum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * В классе Lasagna содержится рецепт лазаньи
 */
public class Lasagna extends AppCompatActivity {

    /**
     * Переменная типа PDFView для хранения файла рецепта
     */
    PDFView pdf_Lasagna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lasagna);

        /**
         * Метод закрепления режима экрана (Горизонтальный)
         */
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        /**
         * Определение id переменной pdf_Lasagna
         */
        pdf_Lasagna = findViewById(R.id.pdf_Lasagna);

        /**
         * Загрузка файла на экран
         */
        pdf_Lasagna.fromAsset("lazagna.pdf").load();

    }
}