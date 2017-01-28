package com.geniusnine.android.mathsformulaandbraintrainergame.formula.integration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.equations.CallEquationsDetails;

public class CallIntegrationDetails extends AppCompatActivity {
WebView IntegrationDetailsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_integration_details);
        IntegrationDetailsWebView = (WebView) findViewById(R.id.callEquationsDetailsWebView);

        WebSettings webSetting = IntegrationDetailsWebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        IntegrationDetailsWebView.setWebViewClient(new CallIntegrationDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            IntegrationDetailsWebView.loadUrl("file:///android_res/raw/ach.html");
        } else if (position == 1) {
            IntegrationDetailsWebView.loadUrl("file:///android_res/raw/aj.html");
        } else if (position == 2) {
            IntegrationDetailsWebView.loadUrl("file:///android_res/raw/an.html");
        } else if (position == 3) {
            IntegrationDetailsWebView.loadUrl("file:///android_res/raw/anil.html");
        } else if (position == 4) {
            IntegrationDetailsWebView.loadUrl("file:///android_res/raw/as.html");

        } else if (position == 5) {
            IntegrationDetailsWebView.loadUrl("file:///android_res/raw/azim.html");
        } else if (position == 6) {
            IntegrationDetailsWebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}

