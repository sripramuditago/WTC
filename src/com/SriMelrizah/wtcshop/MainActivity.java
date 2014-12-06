package com.SriMelrizah.wtcshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void openOtobento(View v){
		Intent otobento = new Intent(getApplicationContext(),OtobentoActivity.class);
		startActivity(otobento);
	}
	public void openShihlin(View v){
		Intent shilin = new Intent(getApplicationContext(),ShihlinActivity.class);
		startActivity(shilin);
	}
	public void openSamwon(View v){
		Intent samwon = new Intent(getApplicationContext(),SamwonActivity.class);
		startActivity(samwon);
	}
}
