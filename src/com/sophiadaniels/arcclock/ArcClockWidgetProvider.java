package com.sophiadaniels.arcclock;

import java.util.Date;

import com.sophiadaniels.arcclock.R;

import android.appwidget.AppWidgetProvider;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.widget.AnalogClock;
import android.widget.RemoteViews;
/**
 * @author Sophia
 *
 */
public class ArcClockWidgetProvider extends AppWidgetProvider {

	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        final int N = appWidgetIds.length;
        // Perform this loop procedure for each App Widget that belongs to this provider
        for (int i=0; i<N; i++) {
            int appWidgetId = appWidgetIds[i];

            // Create an Intent to launch ExampleActivity
            //Intent intent = new Intent(context, ArcClockActivity.class);
            //PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

            // Get the layout for the App Widget and attach an on-click listener
            // to the button
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
            //Bitmap bitmap = Bitmap.createBitmap(300, 300, Config.ARGB_8888);
            //Canvas canvas = new Canvas(bitmap);
            
            //draw(canvas);
            //views.setImageViewBitmap(R.id.imageView1, bitmap);     
            appWidgetManager.updateAppWidget(appWidgetId, views);        
        }
    }
	private void draw(Canvas canvas){
	    Paint paint = new Paint();
		paint.setStyle(Paint.Style.STROKE);  
		paint.setStrokeJoin(Paint.Join.ROUND);  
		paint.setStrokeCap(Paint.Cap.ROUND);  
		paint.setStrokeWidth(15);  
	    paint.setAntiAlias(true);

	    RectF oval = new RectF();
	    
	    int h = canvas.getHeight() / 2;
	    int w = canvas.getWidth() / 2;
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
		//canvas.drawArc(oval, -90, 360/60*date.getSeconds(), false, paint);
	    // hour
	    paint.setColor(Color.rgb(34, 102, 218));
	    r = s/100*120;
		paint.setStrokeWidth(s/14);  
	    oval.set(w-r, h-r, w+r, h+r);
		canvas.drawArc(oval, -90, 360/60*date.getMinutes(), false, paint);
	    
		// day
		paint.setColor(Color.rgb(55, 120, 180));
	    r = s/100*90;
		paint.setStrokeWidth(s/7);  
	    oval.set(w-r, h-r, w+r, h+r);
		canvas.drawArc(oval, -90, 360/24*date.getHours(), false, paint);

		// month
		paint.setColor(Color.rgb(155, 12, 180));
	    r = s/100*60;
		paint.setStrokeWidth(s/10);  
	    oval.set(w-r, h-r, w+r, h+r);
		canvas.drawArc(oval, -90, 360/30*date.getDate(), false, paint);
		// year
		paint.setColor(Color.rgb(255, 12, 180));
	    r = s/100*30;
		paint.setStrokeWidth(s/5);  
	    oval.set(w-r, h-r, w+r, h+r);
		canvas.drawArc(oval, -90, 360/12*date.getMonth(), false, paint);
	}
}
