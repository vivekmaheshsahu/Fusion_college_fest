package Fusion.pvpp.event.fusion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import Fusion.pvpp.event.fusion.Registration.Register;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Antakshari extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_antakshari);
        mAdView = (AdView) findViewById(R.id.adView_ANT);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void register(View view)
    {
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }
}