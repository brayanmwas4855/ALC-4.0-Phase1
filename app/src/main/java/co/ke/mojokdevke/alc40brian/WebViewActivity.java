package co.ke.mojokdevke.alc40brian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebViewActivity extends AppCompatActivity {

    public WebView web;
    String myurl = "www.google.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

//        String myurl = getIntent().getExtras().getString("myurl");


        web = findViewById(R.id.webs);
        web.getSettings().setJavaScriptEnabled(true);


        web.loadUrl(myurl);

//        new Thread(new
//        Runnable() {
//            @Override
//            public void run() {
//
//                web = findViewById(R.id.webs);
//                web.getSettings().setJavaScriptEnabled(true);
//
//
//                web.loadUrl(myurl);
//                System.out.println("-------------------" + web.getSettings().getJavaScriptEnabled());
//                web.setWebViewClient(new WebViewClient() {
//                    @SuppressWarnings("deprecation")
//                    @Override
//                    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                        System.out.println("Toast -------------------");
//                        Toast.makeText(WebViewActivity.this, description, Toast.LENGTH_SHORT).show();
//                    }
//
//                    @TargetApi(Build.VERSION_CODES.M)
//                    @Override
//                    public void onReceivedError(WebView view, WebResourceRequest req, WebResourceError rerr) {
//// Redirect to deprecated method, so you can use it in all SDK versions
//                        onReceivedError(view, rerr.getErrorCode(), rerr.getDescription().toString(), req.getUrl().toString());
//                        System.out.println(" onReceivedError -------------------");
//                        view.loadUrl(myurl);
//
//                    }
//                });
//

//                web.loadUrl(myurl);
//            }
//        }).start();


    }
}
