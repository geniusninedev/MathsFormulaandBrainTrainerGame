package com.geniusnine.android.mathsformulaandbraintrainergame.formula.statistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.matrices.CallMatricesDetails;

public class CallStatisticsDetails extends AppCompatActivity {
WebView StatisticsdetailsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_statistics_details);
        StatisticsdetailsWebView = (WebView) findViewById(R.id.callStatisticsDetailsWebView);

        WebSettings webSetting = StatisticsdetailsWebView.getSettings();

        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        StatisticsdetailsWebView.setWebViewClient(new CallStatisticsDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            StatisticsdetailsWebView.loadUrl("file:///android_res/raw/ach.html");
        } else if (position == 1) {
            StatisticsdetailsWebView.loadUrl("file:///android_res/raw/aj.html");
        } else if (position == 2) {
            StatisticsdetailsWebView.loadUrl("file:///android_res/raw/an.html");
        } else if (position == 3) {
            StatisticsdetailsWebView.loadUrl("file:///android_res/raw/anil.html");
        } else if (position == 4) {
            StatisticsdetailsWebView.loadUrl("file:///android_res/raw/as.html");

        } else if (position == 5) {
            StatisticsdetailsWebView.loadUrl("file:///android_res/raw/azim.html");
        } else if (position == 6) {
            StatisticsdetailsWebView.loadUrl("file:///android_res/raw/baba.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
