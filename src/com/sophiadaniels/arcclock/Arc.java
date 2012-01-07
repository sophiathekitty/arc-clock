/**
 * 
 */
package com.sophiadaniels.arcclock;

import android.graphics.Paint;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/**
 * @author Sophia
 *
 */
public class Arc {
	/**
	 *  paint: stroke settings
	 *  
	 */
	private Paint paint;
	private float x;
	private float y;
	private float radius;
	public Arc(float x,float y,float radius) {
		super(); // do something with eventually maybe? if i decide this should extend something....
		this.x = x;
		this.y = y;
		this.radius = radius;
		paint = new Paint();
		paint.setDither(true);
		paint.setColor(Color.MAGENTA);
		paint.setStyle(Paint.Style.STROKE);  
		paint.setStrokeJoin(Paint.Join.ROUND);  
		paint.setStrokeCap(Paint.Cap.ROUND);  
		paint.setStrokeWidth(5);  
	}
	public void draw(Canvas canvas, float startAngle, float sweepAngle){
		Path path = new Path();
		RectF oval = new RectF();
		oval.set(x-radius, y-radius, x+radius, y-radius);
		path.addArc(oval, startAngle, sweepAngle);
//		canvas.drawArc(oval, startAngle, sweepAngle, true, paint);
		canvas.drawPath(path, paint);
	}
}
