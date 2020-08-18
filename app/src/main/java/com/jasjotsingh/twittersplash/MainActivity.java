package com.jasjotsingh.twittersplash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowId;

public class MainActivity extends AppCompatActivity implements MotionLayout.TransitionListener {
    MotionLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullScreen();
        init();
        listener();
    }

    private void listener() {
        layout.setTransitionListener(this);


    }

    private void init() {
        layout = findViewById(R.id.motionLayout);
    }

    private void fullScreen() {
        Window window = getWindow();
        window.addFlags(View.SYSTEM_UI_FLAG_FULLSCREEN);

        View decor = window.getDecorView();
        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    @Override
    public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {

    }

    @Override
    public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {

    }

    @Override
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
//        Intent intent =new Intent(this,SecondActivity.class);
//        startActivity(intent);
        setContentView(R.layout.activity_second);
        //finish();
    }

    @Override
    public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {

    }
}