package com.muiz.onlinebill;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class OnlineBillCheck extends AppCompatActivity {

    WebView myWebView;
    String url;
    String title;



    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_online_bill_check );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
     // working   setTitle( "Hello" );
        Bundle extrass = getIntent().getExtras();
        if(extrass == null){
            title = null;
        }else{
            title = extrass.getString( "title" );
        }
        setTitle( title );


        Bundle extras = getIntent().getExtras();
        if(extras == null){
            url = null;
        }else{
            url = extras.getString( "url" );
        }

        myWebView = (WebView) findViewById( R.id.webview );
        myWebView.getSettings().setJavaScriptEnabled( true );
        myWebView.getSettings().setLoadWithOverviewMode( true );
        myWebView.getSettings().setUseWideViewPort( true );
        myWebView.getSettings().setBuiltInZoomControls( true );
        myWebView.getSettings().setPluginState( WebSettings.PluginState.ON );
        myWebView.setWebViewClient( new HelloWebViewClient() );
        myWebView.loadUrl( url );
    }


}

