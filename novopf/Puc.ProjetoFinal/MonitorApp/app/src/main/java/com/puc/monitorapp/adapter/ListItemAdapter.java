package com.puc.monitorapp.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.puc.monitorapp.R;
import com.puc.monitorapp.model.InformacaoResumida;

import java.util.List;

public class ListItemAdapter extends BaseAdapter
{

    private List<InformacaoResumida> lista = null;

    private Activity act = null;

    public ListItemAdapter(List<InformacaoResumida> _lista, Activity act) {
        this.lista = _lista;
        this.act = act;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.get(position).getIdInformacao();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = act.getLayoutInflater().inflate(R.layout.list_item_layout, parent, false);

        InformacaoResumida info = lista.get(position);

        TextView nomeSistema = (TextView) view.findViewById(R.id.txtSistema);
        nomeSistema.setText(info.getNomeSistema());

        TextView data = (TextView) view.findViewById(R.id.txtData);
        data.setText(info.getData());

        TextView ticket = (TextView) view.findViewById(R.id.txtTicket);
        ticket.setText(info.getTicket());

        TextView tipo = (TextView) view.findViewById(R.id.txtTipo);
        tipo.setText(info.getTipoInformacao());

        return view;
    }

}
