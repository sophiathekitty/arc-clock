package com.sophiadaniels.arcclock;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ArcClockActivity extends Activity {
	
	public String clockTheme;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Draw2d d = new Draw2d(this);
        //setContentView(d);
        setContentView(R.layout.main);
		SharedPreferences settings = getPreferences(0);
		clockTheme = settings.getString("theme", clockTheme);
    }
    @Override
    public void onStart(){
    	super.onStart();
        //Draw2d d = new Draw2d(this);
        //setContentView(d);
		SharedPreferences settings = getPreferences(0);
    }/*
    @Override
    protected void onStop(){
       super.onStop();

      // We need an Editor object to make preference changes.
      // All objects are from android.context.Context
      SharedPreferences settings = getPreferences(0);
      SharedPreferences.Editor editor = settings.edit();
      
      editor.putString("theme", clockTheme);

      // Commit the edits!
      editor.commit();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);
        if(clockTheme == "arcclock"){
	        menu.getItem(0).getSubMenu().getItem(0).setChecked(true);
	        menu.getItem(0).getSubMenu().getItem(1).setChecked(false);
        } else {
	        menu.getItem(0).getSubMenu().getItem(0).setChecked(false);
	        menu.getItem(0).getSubMenu().getItem(1).setChecked(true);
        }
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        SharedPreferences settings = getPreferences(0);
        SharedPreferences.Editor editor = settings.edit();
        switch (item.getItemId()) {
        case R.id.theme1:
            clockTheme = "arcclock";
            
            editor.putString("theme", clockTheme);

            // Commit the edits!
            editor.commit();
            return true;
        case R.id.theme2:
            clockTheme = "standard";
            
            editor.putString("theme", clockTheme);

            // Commit the edits!
            editor.commit();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }*/
}
