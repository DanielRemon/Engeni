package com.teclab.dremon.engine;

import android.graphics.Bitmap;
import android.graphics.Canvas;


public class Image extends DisplayObject {

       String Key;


       public Image(String _key, String _tag, int source, Resources _resources) {
            this.Key = _key;
           this.resource = _resources;
           this.resources.loadTexture(this.Key, souce);



       }

        public void onDraw()
        {
            Paint p = new Paint();
            drawBitmap();


        }
 

       public void onDraw(Canvas canvas) {
              super.onDraw(canvas);
              canvas.drawBitmap(bmp, x, y, null);

       }


}