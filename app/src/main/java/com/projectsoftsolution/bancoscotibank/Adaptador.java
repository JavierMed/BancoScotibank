package com.projectsoftsolution.bancoscotibank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context context;
    private ArrayList<Entidad> listItems;

    public  Adaptador(Context context, ArrayList<Entidad> listItems){
        this.context=context;
        this.listItems=listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        Entidad Item =(Entidad) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.element_list, null);
        TextView txtnameTarjeta = (TextView) convertView.findViewById(R.id.txt_name_tarjeta);
        TextView txtnumTarjeta = (TextView) convertView.findViewById(R.id.txt_number_tarjeta);
        TextView txtlineCredit = (TextView) convertView.findViewById(R.id.txt_line_credit);

        txtnameTarjeta.setText(Item.getNameTarjeta());
        txtnumTarjeta.setText((Integer) Item.getNumTarjeta());
        txtlineCredit.setText((Integer) Item.getLineCredit());

        return convertView;
    }
}
