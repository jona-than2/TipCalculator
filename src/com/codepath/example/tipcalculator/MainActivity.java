package com.codepath.example.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	public EditText etAmount;
	public TextView tvTips;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAmount = (EditText) findViewById(R.id.etAmount);
        tvTips = (TextView) findViewById(R.id.tvTips);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onSub10p(View v) {
    	String inValue = etAmount.getText().toString();
    	Double fieldValue = ( Double.parseDouble(inValue.trim()) ) * .10;
    	//catch(NumberFormatException nfe);
    	// Fire when button is pushed
    	Toast.makeText(this,Double.toString(fieldValue), Toast.LENGTH_SHORT).show();
    	tvTips.setText(Double.toString(fieldValue));
    
    }
    public void onSub15p(View v) {
    	String inValue = etAmount.getText().toString();
    	Double fieldValue = ( Double.parseDouble(inValue.trim()) ) * .15;
    	// Fire when button is pushed
    	Toast.makeText(this,Double.toString(fieldValue), Toast.LENGTH_SHORT).show();
    	tvTips.setText(Double.toString(fieldValue));
    
    }
    public void onSub20p(View v) {
    	String inValue = etAmount.getText().toString();
    	Double fieldValue = ( Double.parseDouble(inValue.trim()) ) * .20;
    	// Fire when button is pushed
    	Toast.makeText(this,Double.toString(fieldValue), Toast.LENGTH_SHORT).show();
    	tvTips.setText(Double.toString(fieldValue));
    
    }

    
}
