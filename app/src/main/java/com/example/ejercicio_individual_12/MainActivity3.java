package com.example.ejercicio_individual_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ejercicio_individual_12.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding cbinding;
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cbinding= ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(cbinding.getRoot());


        webview = cbinding.webView2;
        webview.setWebViewClient(new WebViewClient());
        WebSettings websettings = webview.getSettings();
        websettings.setJavaScriptEnabled(true);
        webview.loadUrl("https://goo.gl/maps/uQtcEEtk1UhrFnq97");


        cbinding.botonvolver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(inten);
            }
        });


        cbinding.botonsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        Log.d("Prueba3", "la app funciona");
    }
}