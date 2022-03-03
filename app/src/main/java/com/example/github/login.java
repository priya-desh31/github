package com.example.github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        WebView mywebview = (WebView) findViewById(R.id.webview);
        mywebview.loadUrl("https://github.com/trending");
    }
}