package com.example.ex2phairin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class From2 extends Activity{
	
	TextView textView1, textView2;
	EditText editText1;
	Button button1, button2, button3;


protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_from2);
	
	textView1 = (TextView)findViewById(R.id.textView1);
	textView2 = (TextView)findViewById(R.id.textView2);
	editText1 = (EditText)findViewById(R.id.editText1);
	button1 = (Button)findViewById(R.id.button1);
	button2 = (Button)findViewById(R.id.button2);
	button3 = (Button)findViewById(R.id.button3);
	
	Bundle extra = getIntent().getExtras();
	
	String number = extra.getString("number");
	
	textView1.setText(number);
	textView2.setText(" ");
	
	}



public void activity_From2(View v){
	 Intent intent = new Intent(this,From2.class);
	 intent.putExtra("number", textView2.getText().toString());
	 //startActivity(intent);
	 startActivityForResult(intent, 101);
	}


}
