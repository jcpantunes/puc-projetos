package com.puc.monitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.puc.monitorapp.model.InformacaoResumida;
import com.puc.monitorapp.servico.WsApiMonitoracao;

import java.io.IOException;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new
                    StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        Intent it = getIntent();
        int id = it.getIntExtra("ID", 1);
        atualizarView(id);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    private void atualizarView(int id)
    {
        try {
            WsApiMonitoracao api = new WsApiMonitoracao();

            InformacaoResumida informacao = api.recuperarInformacao(id);
            if (informacao != null)
            {
                setCampoTexto(R.id.txtSistema, informacao.getNomeSistema());
                setCampoTexto(R.id.txtTipoInformacao, informacao.getTipoInformacao());
                setCampoTexto(R.id.txtTicket, informacao.getTicket());
                setCampoTexto(R.id.txtData, informacao.getData());
                setCampoTexto(R.id.txtHash, informacao.getHash());
                setCampoTexto(R.id.txtDescricao, informacao.getDescricao());
            }
        }
        catch (IOException ex)
        {
            Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private void setCampoTexto(int textView, String informacao)
    {
        TextView text = (TextView) findViewById(textView);
        text.setText(informacao);
    }

}
