package com.alexlabs.bonumcibum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class TomYum extends AppCompatActivity {

    PDFView pdf_TomYum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tom_yum);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        pdf_TomYum = findViewById(R.id.pdf_TomYum);
        pdf_TomYum.fromAsset("Tom_Yam.pdf").load();
    }
}