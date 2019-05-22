package com.starting.amazingsylhet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class ScrollTestActivity extends AppCompatActivity {


    ImageButton myimgbtn,myimgbtn2,myimgbtn3,myimgbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_test);

        myimgbtn = (ImageButton) findViewById(R.id.imabtn1);
        myimgbtn2 = (ImageButton) findViewById(R.id.imabtn2);
        myimgbtn3 = (ImageButton) findViewById(R.id.imabtn3);
        myimgbtn4 = (ImageButton) findViewById(R.id.imabtn4);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        myimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hungrynaki.com/restaurant/46136/panshi-food/menu"));
                startActivity(browser1);
            }
        });

        myimgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.foodpanda.com.bd/restaurant/s7nl/bhujon-bari"));
                startActivity(browser2);
            }
        });

        myimgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.foodpanda.com.bd/restaurant/s9vb/mughal-masala"));
                startActivity(browser3);
            }
        });

        myimgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.foodpanda.com.bd/restaurant/s9wp/eatopia"));
                startActivity(browser4);
            }
        });


    }
}
