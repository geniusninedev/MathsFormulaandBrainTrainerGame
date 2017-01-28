package com.geniusnine.android.mathsformulaandbraintrainergame.formula.equations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.derivative.CallDerivativeDetails;

public class CallEquationsDetails extends AppCompatActivity {
WebView EquationsDetailswebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_equations_details);
        EquationsDetailswebView = (WebView) findViewById(R.id.callEquationsDetailsWebView);

        WebSettings webSetting = EquationsDetailswebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        EquationsDetailswebView.setWebViewClient(new CallEquationsDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            EquationsDetailswebView.loadUrl("file:///android_res/raw/ach.html");
        } else if (position == 1) {
            EquationsDetailswebView.loadUrl("file:///android_res/raw/aj.html");
        } else if (position == 2) {
            EquationsDetailswebView.loadUrl("file:///android_res/raw/an.html");
        } else if (position == 3) {
            EquationsDetailswebView.loadUrl("file:///android_res/raw/anil.html");
        } else if (position == 4) {
            EquationsDetailswebView.loadUrl("file:///android_res/raw/as.html");

        } else if (position == 5) {
            EquationsDetailswebView.loadUrl("file:///android_res/raw/azim.html");
        } else if (position == 6) {
            EquationsDetailswebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
