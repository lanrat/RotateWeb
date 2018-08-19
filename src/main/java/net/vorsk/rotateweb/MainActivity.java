package net.vorsk.rotateweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView browser = findViewById(R.id.web);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl("https://xkcd.com/");
    }

    public void testButton(View v) {
        // rotate here....
        WebView browser = findViewById(R.id.web);
        float rot = browser.getRotation();
        browser.setRotation(rot+90);
    }
}
