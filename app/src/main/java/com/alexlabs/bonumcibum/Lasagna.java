package com.alexlabs.bonumcibum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Lasagna extends AppCompatActivity {

    PDFView pdf_Lasagna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lasagna);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        pdf_Lasagna = findViewById(R.id.pdf_Lasagna);
        pdf_Lasagna.fromAsset("lazagna.pdf").load();

    }
}