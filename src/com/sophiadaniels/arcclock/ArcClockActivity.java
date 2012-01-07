package com.sophiadaniels.arcclock;

import android.app.Activity;
import android.os.Bundle;

public class ArcClockActivity extends Activity {
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Draw2d d = new Draw2d(this);
        //setContentView(d);
        setContentView(R.layout.main);
    }
    @Override
    public void onStart(){
    	super.onStart();
        //Draw2d d = new Draw2d(this);
        //setContentView(d);
    }
}
