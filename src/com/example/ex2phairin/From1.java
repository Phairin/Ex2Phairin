package com.example.ex2phairin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class From1 extends Activity {
	
	EditText editText1;
	Button button1;
	
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_from1);
		
		editText1 = (EditText)findViewById(R.id.editText1);
		button1 = (Button)findViewById(R.id.button1);
	}
	public void next1(View v){
		
		Intent intent = new Intent(this,From2.class);
		intent.putExtra("number", editText1.getText().toString());
		
		startActivityForResult(intent, 101);
	}
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		 if(requestCode == 101 && resultCode == RESULT_OK){
			 String returnData = data.getExtras().getString("retrunKey");
			 Toast.makeText(this, "number" +returnData,
					 Toast.LENGTH_SHORT).show();
		 }
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.from1, menu);
		return true;
	}

}
