package com.task.todotasks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
    // action with ID action_refresh was selected
    case R.id.action_refresh:
    	
      Intent intent = new Intent(this, AddNewTaskActivity.class);
      intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
      startActivity(intent);
      return true;
      
    // action with ID action_settings was selected
    case R.id.action_settings:
      Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT)
          .show();
      break;
    default:
      break;
    }

    return true;
  } 

}
