package com.geniusnine.android.mathsformulaandbraintrainergame.formula.matrices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.integration.CallIntegrationDetails;

public class CallMatricesDetails extends AppCompatActivity {
WebView MatricesdetailswebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_matrices_details);
        MatricesdetailswebView = (WebView) findViewById(R.id.callMatricesDetailsWebView);

        WebSettings webSetting = MatricesdetailswebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        MatricesdetailswebView.setWebViewClient(new CallMatricesDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            MatricesdetailswebView.loadUrl("file:///android_res/raw/ach.html");
        } else if (position == 1) {
            MatricesdetailswebView.loadUrl("file:///android_res/raw/aj.html");
        } else if (position == 2) {
            MatricesdetailswebView.loadUrl("file:///android_res/raw/an.html");
        } else if (position == 3) {
            MatricesdetailswebView.loadUrl("file:///android_res/raw/anil.html");
        } else if (position == 4) {
            MatricesdetailswebView.loadUrl("file:///android_res/raw/as.html");

        } else if (position == 5) {
            MatricesdetailswebView.loadUrl("file:///android_res/raw/azim.html");
        } else if (position == 6) {
            MatricesdetailswebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
