/**
 * 
 */
package com.sophiadaniels.arcclock;

import java.util.Date;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * @author Sophia
 *
 */
public class ArcClock implements clock {

	/* (non-Javadoc)
	 * @see com.sophiadaniels.arcclock.clock#Draw(android.graphics.Bitmap)
	 */
	public void Draw(Bitmap canvas) {
		// TODO Auto-generated method stub
		Canvas c = new Canvas(canvas);
	    Paint paint = new Paint();
	    Paint paint2 = new Paint();
	    paint.setStyle(Paint.Style.FILL);
	    paint2.setStyle(Paint.Style.FILL);
	    paint2.setColor(Color.BLACK);

	    // make the entire canvas white
	    //paint.setColor(Color.WHITE);
	    //c.drawPaint(paint);
		paint.setStyle(Paint.Style.STROKE);  
		paint.setStrokeJoin(Paint.Join.ROUND);  
		paint.setStrokeCap(Paint.Cap.ROUND);  
		paint.setStrokeWidth(15);  
	    
	    paint.setAntiAlias(true);
	    //c.drawCircle(80, 20, 15, paint);
	    RectF oval = new RectF();
	    
	    int h = c.getHeight() / 2;
	    int w = c.getWidth() / 2;
	    int s;
	    if(h > w){
	    	s = w;
	    } else {
	    	s = h;
	    }
	    int r;
	    Date date = new Date();
	    // minute
	    paint.setColor(Color.rgb(134, 102, 218));
	    r = s/100*95;
		paint.setStrokeWidth(s/28);  
	    oval.set(w-r, h-r, w+r, h+r);
		c.drawArc(oval, -90, 360/60*date.getSeconds(), false, paint);
	    // hour
	    paint.setColor(Color.rgb(34, 102, 218));
	    r = s/100*85;
		paint.setStrokeWidth(s/14);  
	    oval.set(w-r, h-r, w+r, h+r);
		c.drawArc(oval, -90, 360/60*date.getMinutes(), false, paint);
	    
		// day
		paint.setColor(Color.rgb(55, 120, 180));
	    r = s/100*65;
		paint.setStrokeWidth(s/7);  
	    oval.set(w-r, h-r, w+r, h+r);
		c.drawArc(oval, -90, 360/24*date.getHours(), false, paint);

		// month
		paint.setColor(Color.rgb(155, 12, 180));
	    r = s/100*40;
		paint.setStrokeWidth(s/10);  
	    oval.set(w-r, h-r, w+r, h+r);
		c.drawArc(oval, -90, 360/30*date.getDate(), false, paint);
		// year
		paint.setColor(Color.rgb(255, 12, 180));
	    r = s/100*20;
		paint.setStrokeWidth(s/5);  
	    oval.set(w-r, h-r, w+r, h+r);
		c.drawArc(oval, -90, 360/12*date.getMonth(), false, paint);

	}

}
