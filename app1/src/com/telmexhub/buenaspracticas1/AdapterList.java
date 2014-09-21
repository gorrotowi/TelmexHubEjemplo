package com.telmexhub.buenaspracticas1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterList extends BaseAdapter {

	private Context context;
	int layout;
	ArrayList<item_lista> data = new ArrayList<item_lista>();

	public AdapterList(Context context, int layout, ArrayList<item_lista> data) {
		super();
		this.context = context;
		this.layout = layout;
		this.data = data;
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}
	
	public class HolderView{
		TextView texto;
	}

	@Override
	public View getView(int position, View parentView, ViewGroup group) {
		// TODO Auto-generated method stub
		View fila = parentView;
		HolderView holder = null;
		if (fila == null) {
			LayoutInflater inflater = ((Activity)context).getLayoutInflater();
			fila = inflater.inflate(layout, group,false);
			holder = new HolderView();
			holder.texto = (TextView) fila.findViewById(R.id.txtItem);
			fila.setTag(holder);
		}
		else{
			holder = (HolderView) fila.getTag();
		}
		
		item_lista item = (item_lista) data.get(position);
		holder.texto.setText(item.getTextoItem());
		return fila;
	}

}
