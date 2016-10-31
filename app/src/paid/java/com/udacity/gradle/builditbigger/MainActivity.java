package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.wang.avi.AVLoadingIndicatorView;

import comm.EndpointsAsyncTask;

public class MainActivity extends AppCompatActivity {
    private AVLoadingIndicatorView avi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String indicator=getIntent().getStringExtra("indicator");
        avi= (AVLoadingIndicatorView) findViewById(R.id.avi);
        avi.setIndicator(indicator);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    public void tellJoke(View view) {
        startAnim();
        new EndpointsAsyncTask().execute(this);
        stopAnim();
    }



    void startAnim(){
        avi.smoothToShow();

    }

    void stopAnim(){
        avi.smoothToHide();
    }


}

