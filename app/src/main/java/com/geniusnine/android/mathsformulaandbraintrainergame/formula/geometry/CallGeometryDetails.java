package com.geniusnine.android.mathsformulaandbraintrainergame.formula.geometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class CallGeometryDetails extends AppCompatActivity {

    WebView geometryDetailsWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_call_geometry_details);

        geometryDetailsWebView = (WebView) findViewById(R.id.callGeometryDetailsWebView);

        WebSettings webSetting = geometryDetailsWebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        geometryDetailsWebView.setWebViewClient(new CallGeometryDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/triangle.html");
        } else if (position == 1) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/righttri.html");
        } else if (position == 2) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/square.html");
        } else if (position == 3) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/rectangle.html");
        } else if (position == 4) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/parallelogram.html");

        } else if (position == 5) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/lozenge.html");
        } else if (position == 6) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }
}