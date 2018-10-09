package com.muiz.onlinebill;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    private AdView maAdView;
    Button mybutton;
    Button buttoniesco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        setTitle( "Check Electricity Bill Online" );

        MobileAds.initialize( this,"ca-app-pub-3940256099942544~3347511713" );
        maAdView = findViewById( R.id.adView_mainActivity1 );
        AdRequest adRequest = new AdRequest.Builder().build();
        maAdView.loadAd(adRequest);

        Button sharebutton;
        sharebutton = findViewById( R.id.share_button );
        sharebutton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(  );
                sendIntent.setAction( Intent.ACTION_SEND );
                sendIntent.putExtra( Intent.EXTRA_TEXT,"I suggest you this app" );
                sendIntent.setType( "text/plain" );
                startActivity( sendIntent );
            }
        } );

        mybutton = findViewById( R.id.pesco_bill_button );
        mybutton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","pecso button clicked");
                Intent intent = new Intent(MainActivity.this,OnlineBillCheck.class);
                intent.putExtra( "url","http://210.56.23.106:888/pescobill/" );
                intent.putExtra( "title","Peshawar Electric" );
                startActivity( intent );
            }
        } );

        buttoniesco = findViewById( R.id.iesco_bill_button );
        buttoniesco.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity","Iesco button pressed" );
                Intent intent = new Intent( MainActivity.this,OnlineBillCheck.class );
                intent.putExtra( "url","http://210.56.23.106:888/iescobill/" );
                intent.putExtra( "title","Islamabad Electric" );
                startActivity( intent );

            }
        } );

        Button buttonlesco;
        buttonlesco = findViewById( R.id.lesco_bill_button );
        buttonlesco.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity","Lesco button pressed" );
                Intent intent = new Intent (MainActivity.this,OnlineBillCheck.class);
                intent.putExtra( "url","http://www.lesco.gov.pk/modules/customerbill/checkbill.asp" );
                intent.putExtra( "title","Lahore Electric" );
                startActivity( intent );
            }
        } );
        Button buttonkelectric;
        buttonkelectric = findViewById( R.id.k_electric_bill_button );
        buttonkelectric.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity","K-electric button pressed" );
                Intent intent = new Intent( MainActivity.this,OnlineBillCheck.class );
                intent.putExtra( "url","https://www.ke.com.pk/customer-services/duplicate-bill/" );
                intent.putExtra( "title","K-Electric" );
                startActivity( intent );
            }
        } );

        Button buttonqesco;
        buttonqesco = findViewById( R.id.qesco_bill_button );
        buttonqesco.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity","Qesco button pressed" );
                Intent intent = new Intent( MainActivity.this,OnlineBillCheck.class );
                intent.putExtra( "url","http://210.56.23.106:888/qescobill/" );
                intent.putExtra( "title","Quetta Electric" );
                startActivity( intent );
            }
        } );

        Button buttonmepco;
        buttonqesco = findViewById( R.id.mepco_bill_button );
        buttonqesco.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity","mepco button pressed" );
                Intent intent = new Intent( MainActivity.this,OnlineBillCheck.class );
                intent.putExtra( "url","http://210.56.23.106:888/mepcobill/" );
                intent.putExtra( "title","Multan Electric" );
                startActivity( intent );

            }
        } );

        Button buttonfesco;
        buttonqesco = findViewById( R.id.fesco_bill_button );
        buttonqesco.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity","Fesco button pressed" );
                Intent intent = new Intent( MainActivity.this,OnlineBillCheck.class );
                intent.putExtra( "url","http://210.56.23.106:888/fescobill/" );
                intent.putExtra( "title","Faisalabad Electric" );
                startActivity( intent );
            }
        } );

        Button buttongepco;
        buttonqesco = findViewById( R.id.gepco_bill_button );
        buttonqesco.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity","Gepco button pressed" );
                Intent intent = new Intent( MainActivity.this,OnlineBillCheck.class );
                intent.putExtra( "url","http://www.gepco.com.pk/GEPCOBill.aspx" );
                intent.putExtra( "title","Gujranwala Electric" );
                startActivity( intent );
            }
        } );

        Button buttontesco;
        buttonqesco = findViewById( R.id.tesco_bill_button );
        buttonqesco.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity","Tesco button pressed" );
                Intent intent = new Intent( MainActivity.this,OnlineBillCheck.class );
                intent.putExtra( "url","http://210.56.23.106:888/tescobill/" );
                intent.putExtra( "title","Tribal Electric" );
                startActivity( intent );
            }
        } );
        Button buttonhesco;
        buttonqesco = findViewById( R.id.hesco_bill_button );
        buttonqesco.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity","Hesco button pressed" );
                Intent intent = new Intent( MainActivity.this,OnlineBillCheck.class );
                intent.putExtra( "url","http://210.56.23.106:888/hescobill/" );
                intent.putExtra( "title","Hyderabad Electric" );
                startActivity( intent );
            }
        } );
    }
}
