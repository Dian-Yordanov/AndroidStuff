package com.example.y2;

import java.lang.reflect.Array;
import java.util.ArrayList;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends Activity implements SeekBar.OnSeekBarChangeListener, OnItemSelectedListener {
	Button activitySwitcher;
	TextView textView2;
	SeekBar seekBar1;
	public static final int MAX_VALUE = 104;
	public static final int MIN_VALUE = 4;
	int value;
	int progress;
	WebView webView;
	String choosedColor;
	Spinner spinner1;
	TextView textView6;  
	View view1;
	Uri uri = Uri.parse("http://reddit.com");
	ArrayList<String> arrayList = new ArrayList<String>();
	AdapterView adapterView;
	ArrayAdapter<CharSequence> adapter;
	public static String finalStringToPass;
	EditText editText4;
	RadioButton radioButton1;
	RadioButton radioButton2;
	RadioButton radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activitySwitcher = (Button)findViewById(R.id.button1);
        seekBar1 = (SeekBar)findViewById(R.id.seekBar1);
        textView2 = (TextView) findViewById(R.id.textView2);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        textView6 = (TextView) findViewById(R.id.textView6);
        editText4 = (EditText) findViewById(R.id.editText4);
        
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        
        //view1 = (View) findViewById(R.id.view1);
        //webView = (WebView)findViewById(R.id.webView1); 
        seekBar1.setMax(MAX_VALUE);
        seekBar1.setOnSeekBarChangeListener(this);
        progress = seekBar1.getProgress();
        textView2.setText("4");
        
        adapter = ArrayAdapter.createFromResource(this, R.array.colorNamesArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);
        
        
        
        //adapterView.addView(spinner1);
        //adapterView.getOnItemSelectedListener();
      
       //spinner1.setAdapter(adapterView);
        
       
        
        //imageView1.setColorFilter((Integer) spinner1.getSelectedItem());
        //view1.setBackgroundColor(spinner1.getSelectedItem())
        
        //webView1(webView);
        //webView.loadData("<html><body>http://reddit.com<html><body>", "text/html", null);
        //webView.loadUrl("http://youtube.com");
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void activitySwitcher(View view){
	String gender = " ";
	if(radioButton1.isChecked()){gender = "Male";}
	if(radioButton2.isChecked()){gender = "Female";}
	if(radioButton3.isChecked()){gender = "Unknown";}
	
	finalStringToPass = "Name: " + editText4.getText() + " | Gender: " + gender + " | age: " + value + " | favourite colour: " + choosedColor;	
	Intent i = new Intent(MainActivity.this, Class2.class);
    startActivity(i);	
    }


	@Override
	public void onProgressChanged(SeekBar seekBar1, int progress, boolean fromUser) {
		// TODO Auto-generated method stub
		if(fromUser){
		value = seekBar1.getProgress();		
		textView2.setText(Integer.toString(value));
		if(Integer.parseInt((String) textView2.getText())<MIN_VALUE){
			textView2.setText(Integer.toString(MIN_VALUE));
			}
		seekBar1.setProgress(value);
		}
		
			
	}


	@Override
	public void onStartTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStopTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}
	//public void AdapterView.OnItemSelectedListener(){}
	
	//public void webView1(WebView webView){
	//	Uri uri = Uri.parse("http://reddit.com");
	//	Intent intent = new Intent((Intent.ACTION_VIEW),uri);
	//	startActivity(intent);	
	//}   
	public void choosenElementConcoleDisplay(View view){
	choosedColor = spinner1.getSelectedItem().toString();
    arrayList.add(choosedColor);
	 Log.v(arrayList.toString(), arrayList.toString());	
	}


	@Override
	public void onItemSelected(AdapterView<?> adapter, View view, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		Log.v("something", "something");
		choosedColor = spinner1.getSelectedItem().toString();
	    arrayList.add(choosedColor);
	    Log.v(arrayList.toString(), arrayList.toString());	
	    
	    
	    //view1.setBackgroundColor(0xff0000ff);
	    if(choosedColor.equals("Blue")){
	    	textView6.setBackgroundColor(0xff0000ff);
	    	}
	    if(choosedColor.equals("Black")){
		    textView6.setBackgroundColor(0xff000000);
		    }
	    if(choosedColor.equals("White")){
		    textView6.setBackgroundColor(0xffffffff);
		    }
	    if(choosedColor.equals("Gray")){
		    textView6.setBackgroundColor(0xff888888);
		    }
	    if(choosedColor.equals("Red")){
		    textView6.setBackgroundColor(0xffff0000);
		    }
	    if(choosedColor.equals("Green")){
		    textView6.setBackgroundColor(0xff00ff00);
		    }
	    if(choosedColor.equals("Purple")){
		    textView6.setBackgroundColor(0xffff00ff);
		    }
	    if(choosedColor.equals("Orange")){
		    textView6.setBackgroundColor(0xffffff66);
		    }
	    if(choosedColor.equals("Yellow")){
		    textView6.setBackgroundColor(0xffffff00);
		    }
	    
	}


	@Override
	public void onNothingSelected(AdapterView<?> adapter) {
		// TODO Auto-generated method stub
		textView6.setBackgroundColor(0xff000000);
	}
	
	//public static void OnItemSelectedListener(){
	//	
	//}

	
}
