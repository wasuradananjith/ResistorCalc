package com.example.wasuradananjith.resistorcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next4Bands(View v){
        Intent bands4 = new Intent(MainActivity.this,Bands4.class);
        startActivity(bands4);
        finish();
    }

    public void exit(View v) {
        finish();
    }
}
