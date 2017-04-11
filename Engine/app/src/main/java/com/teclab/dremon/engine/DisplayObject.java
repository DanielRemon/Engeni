package com.teclab.dremon.engine;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;

/**
 * Created by Heat on 01/11/2016.
 */


public class DisplayObject extends EventDispatcher
{

    public int x, y;
    public DisplayObject parent;
    public Resources resources;

    public DisplayObject() {
        this.resources = resources;
    }

    public void onDraw(Canvas canvas) {
        this.update();
    }

    public void update() {

    }

    public void onTouchEvent(MotionEvent event) {

    }

    public void dispatchEvent(Event e) {
    }

    public void dispatchEvent(String type) {
    }

    public void dispose() {
    }

    public void globalToLocal(Point p) {
    }

    public void localToGlobal(Point p) {
    }

    public void onDraw() {
    }

    public void primaryOperations() {
    }

    public void touchDown(Point p, int index) {
    }

    public void touchMove(Point p, int index) {
    }

    public void touchUp(Point p, int index) {
    }


}





