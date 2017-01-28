package com.geniusnine.android.mathsformulaandbraintrainergame.formula.unitConversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.trignometry.CallTrigonometryDetails;

public class CallUnitConversionDetails extends AppCompatActivity {
WebView UnitConersionDetailsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_unit_conversion_details);
        UnitConersionDetailsWebView = (WebView) findViewById(R.id.callUnitConversionDetailsWebView);

        WebSettings webSetting = UnitConersionDetailsWebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        UnitConersionDetailsWebView.setWebViewClient(new CallUnitConversionDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            UnitConersionDetailsWebView.loadUrl("file:///android_res/raw/ach.html");
        } else if (position == 1) {
            UnitConersionDetailsWebView.loadUrl("file:///android_res/raw/aj.html");
        } else if (position == 2) {
            UnitConersionDetailsWebView.loadUrl("file:///android_res/raw/an.html");
        } else if (position == 3) {
            UnitConersionDetailsWebView.loadUrl("file:///android_res/raw/anil.html");
        } else if (position == 4) {
            UnitConersionDetailsWebView.loadUrl("file:///android_res/raw/as.html");

        } else if (position == 5) {
            UnitConersionDetailsWebView.loadUrl("file:///android_res/raw/azim.html");
        } else if (position == 6) {
            UnitConersionDetailsWebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
