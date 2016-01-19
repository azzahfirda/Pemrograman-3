package com.example.activitylogin;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	  String pasw ;
      String nama;
      String username ="Azzah";
      String password ="4513210010";
      EditText name;
      EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            name = (EditText)findViewById(R.id.txtusername);
            pass = (EditText)findViewById(R.id.txtpassword);
            Button submit = (Button)findViewById(R.id.btnLogin);
            submit.setOnClickListener(new click());
            }
            @SuppressLint("ShowToast")
            class click implements Button.OnClickListener{
            @SuppressLint("ShowToast")
            public void onClick(View v){
            nama = name.getText().toString();
            pasw = pass.getText().toString();
            if((pasw.equals(password))&&(nama.equals(username))){
                   Toast.makeText(getApplicationContext(),"Berhasil Login" ,31).show();
                   Intent i = new Intent(MainActivity.this, Main2Activity.class);
                   startActivity(i);
            }else
                   Toast.makeText(getApplicationContext(),"Username atau password salah",23).show();
                   name.setText("");
                   pass.setText("");
            }
            }
    
}
