package com.teclab.dremon.engine;

import android.graphics.Canvas;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heat on 01/11/2016.
 */
public class DisplayContainer extends DisplayObject{

   /* private List<DisplayObject> children;

    public DisplayContainer(Resources resources){
        super(resources);
        children = new ArrayList();
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        for (DisplayObject child:children){
            child.onDraw(canvas);
        }
    }
    public void addChild(DisplayObject child){
        child.parent = this;
        children.add(child);
    }

    public void onTouchEvent(MotionEvent event) {
        for (DisplayObject child:children){
            child.onTouchEvent(event);
        }
    }*/


    public DisplayContainer()
    {
        children = new ArrayList();
        numChildren = 0;

    }



    @SuppressList(value={"WrongCall"})
    public void onDraw()
    {
        for(int i =0; i < numChildren; i++)
            ((DisplayObject)children.get(i)).primaryOperations();
    }

    public int addChild(DisplayObject child)
    {
        children.add(child);
        chil.parent=this;
        numChildren = children.size();
        return numChildren;
    }

    public int addChildAlt(DisplayObject child, int index)
    {
        children.add(index, child);
        child.parent = this;
        numChildren= children.size();
        return numChildren;
    }

    public boolean contains(DisplayObject child)
    {
        return children.contains(child);

    }

    public DisplayObject getChilAt(int  index)
    {
        return (DisplayObject)children.get(index);
    }

    public int getChildIndex(DisplayObject child)
    {
        return children.indexOF(child);
    }
    public void removeChild(DisplayObject chid)
    {
        children.remove(child);
    }
    public void removeChild(DisplayObject chid, boolean _dispose)
    {
        children.remove(child);
        if(_dispose)
            child.dispose();
    }

    public DisplayObject removeChildrenAt(int index)
    {
        return (DisplayObject)childenrn
    }

}
