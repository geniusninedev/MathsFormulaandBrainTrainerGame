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
            geometryDetailsWebView.loadUrl("file:///android_res/raw/trepezoid.html");
        }else if (position == 7) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/quadri.html");
        } else if (position == 8) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/circle.html");
        } else if (position == 9) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/segment.html");
        } else if (position == 10) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/sector.html");

        } else if (position == 11) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/regularpolygon.html");
        } else if (position == 12) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/hexagon.html");
        } else if (position == 13) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/sphere.html");
        } else if (position == 14) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/sphericalcap.html");
        } else if (position == 15) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/sphericalsphere.html");
        } else if (position == 16) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/sphericalsector.html");
        }
        else if (position == 17) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/torus.html");
        } else if (position == 18) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/cylinder.html");
        } else if (position == 19) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/cone.html");
        } else if (position == 20) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/frustum.html");

        } else if (position == 21) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/pyramid.html");
        } else if (position == 22) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/cuboid.html");
        }else if (position == 23) {
            geometryDetailsWebView.loadUrl("file:///android_res/raw/triprism.html");
        }
    }
    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }
}