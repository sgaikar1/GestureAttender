package com.sgaikar1.gesturesattender;

import android.view.MotionEvent;

/**
 * Created by itrs-676 on 06/09/17.
 */

public interface OnSwipeListener {
    public void onLeftSwipeDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY);
    public void onRightSwipeDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY);
    public void onUpSwipeDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY);
    public void onDownSwipeDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY);
    public void onScrollGestureDetected(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY);
    public void onLongPressDetected(MotionEvent ev);
    public void onSingleTapDetected(MotionEvent ev);
    public void onShowPressDetected(MotionEvent ev);
    public void onDownClickDetected(MotionEvent ev);
}
