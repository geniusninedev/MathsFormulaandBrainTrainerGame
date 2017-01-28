package com.geniusnine.android.mathsformulaandbraintrainergame.formula.algebra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.geometry.CallGeometryDetails;

public class CallAlgebraDetails extends AppCompatActivity {
WebView AlgebraDetailsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_algebra_details);
        AlgebraDetailsWebView = (WebView) findViewById(R.id.callAlgebraDetailsWebView);

        WebSettings webSetting = AlgebraDetailsWebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        AlgebraDetailsWebView.setWebViewClient(new CallAlgebraDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            AlgebraDetailsWebView.loadUrl("file:///android_res/raw/ach.html");
        } else if (position == 1) {
            AlgebraDetailsWebView.loadUrl("file:///android_res/raw/aj.html");
        } else if (position == 2) {
            AlgebraDetailsWebView.loadUrl("file:///android_res/raw/an.html");
        } else if (position == 3) {
            AlgebraDetailsWebView.loadUrl("file:///android_res/raw/anil.html");
        } else if (position == 4) {
            AlgebraDetailsWebView.loadUrl("file:///android_res/raw/as.html");
        } else if (position == 5) {
            AlgebraDetailsWebView.loadUrl("file:///android_res/raw/azim.html");
        } else if (position == 6) {
            AlgebraDetailsWebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }
}


