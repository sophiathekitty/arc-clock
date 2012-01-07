package com.sophiadaniels.arcclock;

import java.util.Date;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.AnalogClock;

public class WidgetClock extends AnalogClock {

	public WidgetClock(Context context, AttributeSet attrs) {
		super(context, attrs);
		/*
		float ii = (float) 1;
		for(int i = 0; i < colors.length; i++){
			colors[i] = Color.rgb((int) Math.round(Math.random()*255),(int) Math.round(Math.random()*255),(int) Math.round(Math.random()*255));
			if(i < widths.length){
				widths[i] += Math.round(Math.random()*2)-1;
				radious[i] += Math.round(Math.random()*2)-1;
				tails[i] = (int) Math.round(Math.random() * 270);
				ii -= 0.2;
				if(Math.random() > ii){
					rings[i] = true;
					arms[i] = false;
				} else {
					rings[i] = false;
					arms[i] = true;
				}
			}
		}
		*/
	}
	/*
	public int colors[]  = {0,1,2,3,4,0,1,2,3,4,0,1,2,3,4};
	public int radious[]  = {95,85,65,40,20};
	public int widths[]  = {28,14,7,12,6};
	public boolean starts[] = {true,true,true,true,true};
	public boolean rings[] = {false,true,true,true,true};
	public int tails[] = {90,90,45,1,1};
	public boolean arms[] = {true,false,false,false,false};
	public boolean txts[] = {true,true,true,true,true};
	*/
    @Override
	protected void onDraw(Canvas c){
	    super.onDraw(c);
	    /*
	    Paint paint = new Paint();
	    Paint paint2 = new Paint();
		paint.setStyle(Paint.Style.STROKE);  
		paint2.setStyle(Paint.Style.FILL);
		paint2.setColor(Color.BLACK);
		paint.setStrokeJoin(Paint.Join.ROUND);  
		paint.setStrokeCap(Paint.Cap.ROUND);  
	    paint.setAntiAlias(true);
	    //List times;
	    Date date = new Date();
	    int times[] = {0,1,2,3,4};
	    times[0] = 360/60*date.getSeconds();
	    times[1] = 360/60*date.getMinutes();
	    times[2] = 360/24*date.getHours();
	    times[3] = 360/30*date.getDate();
	    times[4] = 360/12*date.getMonth();	    
	    Integer time_s[] = {0,1,2,3,4};
	    time_s[0] = date.getSeconds();
	    time_s[1] = date.getMinutes();
	    time_s[2] = date.getHours();
	    time_s[3] = date.getDate();
	    time_s[4] = date.getMonth();	    
	    
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
	    for(int i = 1; i < 5; i++){
		    paint.setColor(colors[i]);
			paint.setStrokeWidth(s/widths[i]-2);  
		    r = s/100*radious[i]+10;
		    oval.set(w-r, h-r, w+r, h+r);
		    if(arms[i]){
		    	paint.setColor(colors[i+10]);
		    	paint.setStrokeWidth(s/widths[i]);
		    	c.drawArc(oval, -89+times[i], 1, true, paint);
		    }
		    r = s/100*radious[i];
		    oval.set(w-r, h-r, w+r, h+r);
		    if(rings[i])
		    	c.drawArc(oval, -90, times[i], false, paint);
		    if(tails[i] > 0){
		    	paint.setColor(colors[i+5]);
		    	paint.setStrokeWidth(s/widths[i]+2);
		    	c.drawArc(oval, -89+times[i], -tails[i], false, paint);
		    }
		    if(starts[i]){
		    	paint.setColor(colors[i+10]);
		    	paint.setStrokeWidth(s/widths[i]+10);
		    	c.drawArc(oval, -91, 1, false, paint);
		    }
		    if(txts[i]){
		    	String st = time_s[i].toString();
		    	if(i == 2){
		    		if(time_s[i] > 12){
		    			time_s[i]-=12;
		    			st = time_s[i].toString() + "pm";
		    		} else {
		    			st = time_s[i].toString() + "am";
		    		}
		    	}
		    	if(i == 4){
		    		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		    		st = months[time_s[i]];
		    	} 
		    	c.drawText(st, w-(st.length()*4), h-r+2, paint2);
		    }
	    }
	    */
    }
}
