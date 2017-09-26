package com.sgaikar1.gesturesattender;

import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by itrs-676 on 06/09/17.
 */

public class GestureListener extends GestureDetector.SimpleOnGestureListener
{

    static String currentGestureDetected;
    private final OnSwipeListener listener;

    public GestureListener(OnSwipeListener listener) {
        this.listener = listener;
    }

    // Override s all the callback methods of GestureDetector.SimpleOnGestureListener
    @Override
    public boolean onSingleTapUp(MotionEvent ev) {
        currentGestureDetected=ev.toString();
        listener.onSingleTapDetected(ev);
        return true;
    }
    @Override
    public void onShowPress(MotionEvent ev) {
        currentGestureDetected=ev.toString();

        listener.onShowPressDetected(ev);
    }
    @Override
    public void onLongPress(MotionEvent ev) {
        currentGestureDetected=ev.toString();
        listener.onLongPressDetected(ev);
    }
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        currentGestureDetected=e1.toString()+ "  "+e2.toString();
        listener.onScrollGestureDetected(e1,e2,distanceX,distanceY);
        return true;
    }
    @Override
    public boolean onDown(MotionEvent ev) {
        currentGestureDetected=ev.toString();
        listener.onDownClickDetected(ev);
        return true;
    }
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        currentGestureDetected = e1.toString() + "  " + e2.toString();
        float dX = e1.getX() - e2.getX();
        float dY = e1.getY() - e2.getY();
        if (Math.abs(dX) < Math.abs(dY)) {
            if (dY > 0) {
                listener.onUpSwipeDetected(e1,e2,velocityX,velocityY);
                return true;
            }else{
                listener.onDownSwipeDetected(e1,e2,velocityX,velocityY);
                return true;
            }
        } else {
            if (dX > 0) {
                listener.onLeftSwipeDetected(e1, e2, velocityX, velocityY);
                return true;
            } else {
                listener.onRightSwipeDetected(e1, e2, velocityX, velocityY);
                return true;
            }
        }
    }
}


