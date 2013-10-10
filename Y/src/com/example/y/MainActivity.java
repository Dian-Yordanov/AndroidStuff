package com.example.y;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity implements SeekBar.OnSeekBarChangeListener{
	int MAX_VALUE=100;
	int value;
	TextView textView;
	SeekBar seekBar;
	Button increaseButton;
	Button decreaseButton;
	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        increaseButton = (Button)findViewById(R.id.increaseButton);
        decreaseButton = (Button)findViewById(R.id.decreaseButton);
        seekBar.setMax(MAX_VALUE);
        displayValue();
        seekBar.setOnSeekBarChangeListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
   public void displayValue(){
	   textView.setText(Integer.toString(value));
	   seekBar.setProgress(value);
   } 
   public void increaseValue(View view){
	   value++;
	   if(value>MAX_VALUE){value=0;}
	   displayValue();
   }
   public void decreaseValue(View view){
	   value--;
	   if(value<0){value=MAX_VALUE;}
	   displayValue();
   }


@Override
public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
	// TODO Auto-generated method stub
	if(fromUser==true){value=progress;displayValue();}
}


@Override
public void onStartTrackingTouch(SeekBar seekBar) {
	// TODO Auto-generated method stub
	
}


@Override
public void onStopTrackingTouch(SeekBar seekBar) {
	// TODO Auto-generated method stub
	
}

}
