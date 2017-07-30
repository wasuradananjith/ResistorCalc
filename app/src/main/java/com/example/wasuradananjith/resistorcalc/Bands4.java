package com.example.wasuradananjith.resistorcalc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static java.security.AccessController.getContext;

public class Bands4 extends AppCompatActivity {
    int val1,val2=0;
    float val3 = 0;
    String val4 = "0";
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bands4);

        Spinner dropdown1 = (Spinner)findViewById(R.id.spinner1);
        Spinner dropdown2 = (Spinner)findViewById(R.id.spinner2);
        Spinner dropdown3 = (Spinner)findViewById(R.id.spinner3);
        Spinner dropdown4 = (Spinner)findViewById(R.id.spinner4);

        dropdown1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s= parent.getSelectedItem().toString();
                Button b1 =(Button)(findViewById(R.id.btn1));
                selectChoice(b1,s);
                calculate1(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dropdown2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s= parent.getSelectedItem().toString();
                Button b2 =(Button)(findViewById(R.id.btn2));
                selectChoice(b2,s);
                calculate2(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dropdown3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s= parent.getSelectedItem().toString();
                Button b3 =(Button)(findViewById(R.id.btn3));
                selectChoice(b3,s);
                calculate3(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dropdown4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s= parent.getSelectedItem().toString();
                Button b4 =(Button)(findViewById(R.id.btn4));
                selectChoice(b4,s);
                calculate4(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    public void goBack(View v){
        Intent home = new Intent(Bands4.this,MainActivity.class);
        startActivity(home);
        finish();
    }

    private void calculate4(String s) {
        switch (s){
            case "Select Colour":{
                val4="0";
                break;
            }
            case "Brown":{
                val4="1%";
                break;
            }
            case "Red":{
                val4="2%";
                break;
            }
            case "Green":{
                val4="0.5%";
                break;
            }
            case "Blue":{
                val4="0.25%";
                break;
            }
            case "Violet":{
                val4="0.10%";
                break;
            }
            case "Gray":{
                val4="0.05%";
                break;
            }
            case "Gold":{
                val4="5%";
                break;
            }
            case "Silver":{
                val4="10%";
            }
        }
    }

    private void calculate3(String s) {
        switch (s){
            case "Select Colour":{
                val3=1;
                break;
            }
            case "Brown":{
                val3=10;
                break;
            }
            case "Red":{
                val3=100;
                break;
            }
            case "Orange":{
                val3=1000;
                break;
            }
            case "Yellow":{
                val3=10000;
                break;
            }
            case "Green":{
                val3=100000;
                break;
            }
            case "Blue":{
                val3=1000000;
                break;
            }
            case "Violet": {
                val3 = 10000000;
                break;
            }
            case "Gold":{
                val3 = 0.1f;
                break;
            }
            case "Silver":{
                val3 = 0.01f;
                break;
            }
        }
    }

    private void calculate2(String s) {
        switch (s){
            case "Select Colour":{
                val2=0;
                break;
            }
            case "Brown":{
                val2=1;
                break;
            }
            case "Red":{
                val2=2;
                break;
            }
            case "Orange":{
                val2=3;
                break;
            }
            case "Yellow":{
                val2=4;
                break;
            }
            case "Green":{
                val2=5;
                break;
            }
            case "Blue":{
                val1=6;
                break;
            }
            case "Violet":{
                val2=7;
                break;
            }
            case "Gray":{
                val2=8;
                break;
            }
            case "White":{
                val2=9;
                break;
            }
        }
    }

    private void calculate1(String s) {
        switch (s){
            case "Select Colour":{
                val1=0;
                break;
            }
            case "Brown":{
                val1=1;
                break;
            }
            case "Red":{
                val1=2;
                break;
            }
            case "Orange":{
                val1=3;
                break;
            }
            case "Yellow":{
                val1=4;
                break;
            }
            case "Green":{
                val1=5;
                break;
            }
            case "Blue":{
                val1=6;
                break;
            }
            case "Violet":{
                val1=7;
                break;
            }
            case "Gray":{
                val1=8;
                break;
            }
            case "White":{
                val1=9;
                break;
            }
        }
    }

    private void selectChoice(Button b,String s) {
        switch(s){
            case "Select Colour":{
                b.setBackgroundColor(Color.TRANSPARENT);
                break;
            }
            case "Brown":{
                b.setBackgroundColor(ContextCompat.getColor(Bands4.this, R.color.colorBrown));
                break;
            }
            case "Red":{
                b.setBackgroundColor(Color.RED);
                break;
            }
            case "Orange":{
                b.setBackgroundColor(ContextCompat.getColor(Bands4.this, R.color.colorOrange));
                break;
            }
            case "Yellow":{
                b.setBackgroundColor(Color.YELLOW);
                break;
            }
            case "Green":{
                b.setBackgroundColor(Color.GREEN);
                break;
            }
            case "Blue":{
                b.setBackgroundColor(Color.BLUE);
                break;
            }
            case "Violet":{
                b.setBackgroundColor(ContextCompat.getColor(Bands4.this, R.color.colorViolet));
                break;
            }
            case "Gray":{
                b.setBackgroundColor(Color.GRAY);
                break;
            }
            case "White":{
                b.setBackgroundColor(Color.WHITE);
                break;
            }
            case "Gold":{
                b.setBackgroundColor(ContextCompat.getColor(Bands4.this, R.color.colorGold));
                break;
            }
            case "Silver":{
                b.setBackgroundColor(ContextCompat.getColor(Bands4.this, R.color.colorSilver));
                break;
            }
        }

    }

    public void calTotal(View v){
        float total = (val1*100+val2*10)*val3;

        String str = Float.toString(total);
        BigDecimal bd = new BigDecimal(str);
        bd = bd.round(new MathContext(4, RoundingMode.HALF_UP));

        alertDialog = new AlertDialog.Builder(Bands4.this).create();
        alertDialog.setTitle("Resistance");
        alertDialog.setIcon(R.drawable.notificationicon);
        alertDialog.setMessage(bd.toPlainString()+" Ohms "+val4);
        alertDialog.show();
    }

    public void exit(View v){
        finish();
    }

}
