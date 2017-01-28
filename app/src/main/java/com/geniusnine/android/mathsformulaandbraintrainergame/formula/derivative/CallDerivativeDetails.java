package com.geniusnine.android.mathsformulaandbraintrainergame.formula.derivative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.analyticGeometry.CallAnalyticGeometryDetails;

public class CallDerivativeDetails extends AppCompatActivity {
WebView DerivativeDetailsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_derivative_details);
        DerivativeDetailsWebView = (WebView) findViewById(R.id.callDerivativeDetailsWebView);

        WebSettings webSetting = DerivativeDetailsWebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        DerivativeDetailsWebView.setWebViewClient(new CallDerivativeDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            DerivativeDetailsWebView.loadUrl("file:///android_res/raw/ach.html");
        } else if (position == 1) {
            DerivativeDetailsWebView.loadUrl("file:///android_res/raw/aj.html");
        } else if (position == 2) {
            DerivativeDetailsWebView.loadUrl("file:///android_res/raw/an.html");
        } else if (position == 3) {
            DerivativeDetailsWebView.loadUrl("file:///android_res/raw/anil.html");
        } else if (position == 4) {
            DerivativeDetailsWebView.loadUrl("file:///android_res/raw/as.html");

        } else if (position == 5) {
            DerivativeDetailsWebView.loadUrl("file:///android_res/raw/azim.html");
        } else if (position == 6) {
            DerivativeDetailsWebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
     }
  }
