package com.example.activitylogin;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends Activity {
	Button btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		  addListenerOnButton();
	}
	public void addListenerOnButton(){
    	final Context context = this;
    	btnLogin = (Button) findViewById(R.id.btnLogin);
    	btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(context,MainActivity.class);
				startActivity(i);
			}
		});
    }
	
}