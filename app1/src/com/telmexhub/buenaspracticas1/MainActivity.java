package com.telmexhub.buenaspracticas1;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView lista;
	AdapterList adaptador;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lista = (ListView) findViewById(R.id.lista);
		adaptador = new AdapterList(MainActivity.this, R.layout.item_lista,
				getData());
		lista.setAdapter(adaptador);
	}

	private ArrayList<item_lista> getData() {
		final ArrayList<item_lista> item = new ArrayList<item_lista>();
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		item.add(new item_lista("Este es un texto de mi lista"));
		return item;
	}
}
