package com.example.androidjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Jokes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        Intent intent = getIntent();

        TextView joke_tv = (TextView) findViewById(R.id.joke_id);
        joke_tv.setText(intent.getStringExtra("joke"));
    }
}
