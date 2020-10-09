package com.example.tempest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BookActivity extends AppCompatActivity {

    PDFView bookview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book);

        bookview=(PDFView) findViewById(R.id.pdf1);
        bookview.fromAsset("TEMPEST.pdf").load();
    }
}