package com.alexlabs.bonumcibum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Shaurma extends AppCompatActivity {

    PDFView pdfShaurma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shaurma);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        pdfShaurma = findViewById(R.id.pdf_Shaurma);

        pdfShaurma.fromAsset("Shaurma.pdf").load();
    }
}