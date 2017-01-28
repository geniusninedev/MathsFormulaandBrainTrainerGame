package com.geniusnine.android.mathsformulaandbraintrainergame.formula.trignometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.statistics.CallStatisticsDetails;

public class CallTrigonometryDetails extends AppCompatActivity {
WebView TrigonometryDetailswebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_trigonometry_details);
        TrigonometryDetailswebView = (WebView) findViewById(R.id.callTrigonometryDetailsWebView);

        WebSettings webSetting = TrigonometryDetailswebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        TrigonometryDetailswebView.setWebViewClient(new CallTrigonometryDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            TrigonometryDetailswebView.loadUrl("file:///android_res/raw/ach.html");
        } else if (position == 1) {
            TrigonometryDetailswebView.loadUrl("file:///android_res/raw/aj.html");
        } else if (position == 2) {
            TrigonometryDetailswebView.loadUrl("file:///android_res/raw/an.html");
        } else if (position == 3) {
            TrigonometryDetailswebView.loadUrl("file:///android_res/raw/anil.html");
        } else if (position == 4) {
            TrigonometryDetailswebView.loadUrl("file:///android_res/raw/as.html");

        } else if (position == 5) {
            TrigonometryDetailswebView.loadUrl("file:///android_res/raw/azim.html");
        } else if (position == 6) {
            TrigonometryDetailswebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
