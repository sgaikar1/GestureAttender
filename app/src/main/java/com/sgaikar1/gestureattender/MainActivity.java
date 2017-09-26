package com.sgaikar1.gestureattender;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.sgaikar1.gesturesattender.GestureListener;
import com.sgaikar1.gesturesattender.OnSwipeListener;

public class MainActivity extends AppCompatActivity implements  OnSwipeListener {

    private FrameLayout frame;
    private GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       frame = (FrameLayout) findViewById(R.id.fl_parent);

        frame.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return mGestureDetector.onTouchEvent(event);
            }
        });

        mGestureDetector = new GestureDetector(this, new GestureListener(this));



    }



    @Override
    public void onLeftSwipeDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.e("SWIPE ","Left");
    }

    @Override
    public void onRightSwipeDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.e("SWIPE ","Right");
    }

    @Override
    public void onUpSwipeDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.e("SWIPE ","Up");
    }

    @Override
    public void onDownSwipeDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.e("SWIPE ","Down");
    }

    @Override
    public void onScrollGestureDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.e("SWIPE ","Scroll");
    }

    @Override
    public void onLongPressDetected(MotionEvent ev) {
        Log.e("SWIPE ","Long Press");
    }

    @Override
    public void onSingleTapDetected(MotionEvent ev) {
        Log.e("SWIPE ","Single Tap");
    }

    @Override
    public void onShowPressDetected(MotionEvent ev) {
        Log.e("SWIPE ","Show Press");
    }

    @Override
    public void onDownClickDetected(MotionEvent ev) {
        Log.e("SWIPE ","Down key");
    }


}
