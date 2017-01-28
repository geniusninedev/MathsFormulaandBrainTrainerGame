package com.geniusnine.android.mathsformulaandbraintrainergame.formula.analyticGeometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.algebra.CallAlgebraDetails;

public class CallAnalyticGeometryDetails extends AppCompatActivity {
WebView AnalyticGeometryDetailsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_analytic_geometry_details);
        AnalyticGeometryDetailsWebView = (WebView) findViewById(R.id.callAnalyticGeometryDetailsWebView);

        WebSettings webSetting = AnalyticGeometryDetailsWebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        AnalyticGeometryDetailsWebView.setWebViewClient(new CallAnalyticGeometryDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            AnalyticGeometryDetailsWebView.loadUrl("file:///android_res/raw/ach.html");
        } else if (position == 1) {
            AnalyticGeometryDetailsWebView.loadUrl("file:///android_res/raw/aj.html");
        } else if (position == 2) {
            AnalyticGeometryDetailsWebView.loadUrl("file:///android_res/raw/an.html");
        } else if (position == 3) {
            AnalyticGeometryDetailsWebView.loadUrl("file:///android_res/raw/anil.html");
        } else if (position == 4) {
            AnalyticGeometryDetailsWebView.loadUrl("file:///android_res/raw/as.html");

        } else if (position == 5) {
            AnalyticGeometryDetailsWebView.loadUrl("file:///android_res/raw/azim.html");
        } else if (position == 6) {
            AnalyticGeometryDetailsWebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }
}

