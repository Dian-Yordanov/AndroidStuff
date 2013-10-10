package com.example.y1;

import com.example.y1.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b0;
	Button bc;
	Button bminus;
	static boolean bminusIsPressed = false;
	Button bplus;
	static boolean bplusIsPressed = false;
	EditText editText;
	Button bequals;
	int value=0;
	int value1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText1);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        b0 = (Button)findViewById(R.id.b0);
        bc = (Button)findViewById(R.id.bc);
        bminus = (Button)findViewById(R.id.bminus);
        bplus = (Button)findViewById(R.id.bplus);
        bequals = (Button)findViewById(R.id.bequals);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void displayValue(){
 	   editText.setText(Integer.toString(value));
    } 
    public void b1(View view){
    	value=Integer.parseInt(editText.getText().toString()+"1");
    	displayValue();
    	}    
    public void b2(View view){
    	value=Integer.parseInt(editText.getText().toString()+"2");
    	displayValue();
        }    
    public void b3(View view){
    	value=Integer.parseInt(editText.getText().toString()+"3");
    	displayValue();
        }    
    public void b4(View view){
    	value=Integer.parseInt(editText.getText().toString()+"4");
    	displayValue();
        }    
    public void b5(View view){
    	value=Integer.parseInt(editText.getText().toString()+"5");
    	displayValue();
        }    
    public void b6(View view){
    	value=Integer.parseInt(editText.getText().toString()+"6");
    	displayValue();
        }    
    public void b7(View view){
    	value=Integer.parseInt(editText.getText().toString()+"7");
    	displayValue();
        }    
    public void b8(View view){
    	value=Integer.parseInt(editText.getText().toString()+"8");
    	displayValue();
        }    
    public void b9(View view){
    	value=Integer.parseInt(editText.getText().toString()+"9");
    	displayValue();
        }    
    public void b0(View view){
    	value=Integer.parseInt(editText.getText().toString()+"0");
    	displayValue();
        }    
    public void bminus(View view){
    	bminusIsPressed = true;
    	value1=Integer.parseInt(editText.getText().toString());
    	editText.setText(Integer.toString(0));   	
        }    
    public void bplus(View view){
    	bplusIsPressed = true; 
    	value1=Integer.parseInt(editText.getText().toString());
    	editText.setText(Integer.toString(0)); 
        }    
    public void bc(View view){
    	value=0;
    	displayValue();
        }    
    public void bequals(View view){
    	if(bminusIsPressed == true){
    	value = value1 - value;	
    	}
    	if(bplusIsPressed == true){
		value = value1 + value;		
    	}
    	displayValue();
    	bminusIsPressed = false;
    	bplusIsPressed = false;
    }
         
}
