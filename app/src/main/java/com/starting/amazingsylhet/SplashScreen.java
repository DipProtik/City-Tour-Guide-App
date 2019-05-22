package com.starting.amazingsylhet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private int SLEEP_TIMER = 5;
    ImageView v1,v2;
    Animation frombtm,fromtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        v2 = (ImageView) findViewById(R.id.bottom);
        v1 = (ImageView) findViewById(R.id.top);

        frombtm = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtp = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        LogoLauncher logolauncher = new LogoLauncher();
        logolauncher.start();

    }

    private class LogoLauncher extends Thread{
        public void run(){
            v1.setAnimation(fromtp);
            v2.setAnimation(frombtm);

            try {
                sleep(1000 * SLEEP_TIMER);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent abc = new Intent(SplashScreen.this,MainActivity.class);
            startActivity(abc);
            SplashScreen.this.finish();
        }
    }

}
