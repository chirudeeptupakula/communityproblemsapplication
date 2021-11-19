package com.example.splashdemojava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=5000;
    //Hooks
    View first,second,third,fourth,fifth,sixth,seventh;
    TextView cpa,compa;
//Animations
    Animation topAnimation,middleAnimation,bottomAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        middleAnimation=AnimationUtils.loadAnimation(this,R.anim.middle_animation);
        bottomAnimation=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
   //hooks
        first=findViewById(R.id.whiteline);
        second=findViewById(R.id.redline);
        third=findViewById(R.id.greenline);
        fourth=findViewById(R.id.whiteline2);
        fifth=findViewById(R.id.redline2);
        sixth=findViewById(R.id.greenline2);
        seventh=findViewById(R.id.whiteline3);
        cpa=findViewById(R.id.cpa);
        compa=findViewById(R.id.compa);


    //set animation
    first.setAnimation(topAnimation);
    second.setAnimation(topAnimation);
    third.setAnimation(topAnimation);
    fourth.setAnimation(topAnimation);
    fifth.setAnimation(topAnimation);
    sixth.setAnimation(topAnimation);
    seventh.setAnimation(topAnimation);

    cpa.setAnimation(middleAnimation);
    compa.setAnimation(bottomAnimation);

        //splashscreen
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent =new Intent(MainActivity.this,loginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

}