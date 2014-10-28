package com.example.ejercicio01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Pantalla1  extends Activity implements OnClickListener {
	Button boton1, boton2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantalla01);
		boton1 = (Button) findViewById(R.id.btnBoton1);
		boton2 = (Button) findViewById(R.id.btnBoton2);
		
		boton1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.equals(boton1)){
			String texto ="PR_UEBA";
			Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_SHORT).show();
		} else if(v.equals(boton2)){
			
		}
	}

}
