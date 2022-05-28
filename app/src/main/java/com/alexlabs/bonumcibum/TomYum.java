package com.alexlabs.bonumcibum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
/**
 * В классе TomYum содержится рецепт супа Том Ям
 */

public class TomYum extends AppCompatActivity {
    /**
     * Переменная типа PDFView для хранения файла рецепта
     */
    PDFView pdf_TomYum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tom_yum);

        /**
         * Метод закрепления режима экрана (Горизонтальный)
         */
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        /**
         * Определение id переменной pdf_TomYum
         */
        pdf_TomYum = findViewById(R.id.pdf_TomYum);

        /**
         * Загрузка файла на экран
         */
        pdf_TomYum.fromAsset("tom_yam.pdf").load();
    }
}