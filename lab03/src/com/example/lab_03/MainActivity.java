package com.example.lab_03;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText text = (EditText) findViewById(R.id.editText1);
		
		((Button) findViewById(R.id.button1)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("1");
				
			}
		});
		
		((Button) findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("2");
				
			}
		});
		
		((Button) findViewById(R.id.button3)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("3");
				
			}
		});
		
		((Button) findViewById(R.id.button4)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("4");
				
			}
		});
		
		((Button) findViewById(R.id.button5)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("5");
				
			}
		});
		
		((Button) findViewById(R.id.button6)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("6");
				
			}
		});
		
		((Button) findViewById(R.id.button7)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("7");
				
			}
		});
		
		((Button) findViewById(R.id.button8)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("8");
				
			}
		});
		
		((Button) findViewById(R.id.button9)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("9");
				
			}
		});
		
		((Button) findViewById(R.id.button10)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.setText("Gata, sef! Am sunat!");
				
			}
		});
		
		((Button) findViewById(R.id.button12)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.setText("");
				
			}
		});
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
}
