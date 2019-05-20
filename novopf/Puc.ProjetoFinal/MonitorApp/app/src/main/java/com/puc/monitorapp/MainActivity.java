package com.puc.monitorapp;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.JsonReader;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.puc.monitorapp.adapter.ListItemAdapter;
import com.puc.monitorapp.model.InformacaoResumida;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String URL_WS_API = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new
                    StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        List<InformacaoResumida> lista = recuperarListaInformacao();
        atualizarListView(lista);

        Button btnAtualizar = findViewById(R.id.listarErroBtnAtualizar);
        btnAtualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<InformacaoResumida> lista = recuperarListaInformacao();
                atualizarListView(lista);
            }
        });

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

    private void atualizarListView(List<InformacaoResumida> lista)
    {
        ListView listView = (ListView) findViewById(R.id.listInfo);

        ListItemAdapter adapter = new ListItemAdapter(lista, this);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(getApplicationContext(),
                        "Clicou no item " + position + "(" + id + ")", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<InformacaoResumida> recuperarListaInformacao() {

        List<InformacaoResumida> lista = new ArrayList<InformacaoResumida>();

        URL_WS_API = "http://192.168.0.160:5000/api/cadinformacao/consultarrecentes/10";
        // URL_WS_API = "https://localhost:5001/api/cadinformacao/consultarrecentes/10";

        /*AsyncTask.execute(new Runnable() {

            @Override
            public void run() {
            }

        });*/

        try {
            // Create URL
            URL githubEndpoint = new URL(URL_WS_API);

            // Create connection
            HttpURLConnection myConnection = (HttpURLConnection) githubEndpoint.openConnection();

            myConnection.setRequestProperty("User-Agent", "monitorApp");

            myConnection.setRequestProperty("Accept", "application/vnd.github.v3+json");

            myConnection.setRequestProperty("Contact-Me", "jcpantunes@gmail.com");

            if (myConnection.getResponseCode() == 200) {

                InputStream responseBody = myConnection.getInputStream();

                InputStreamReader responseBodyReader = new InputStreamReader(responseBody, "UTF-8");

                JsonReader jsonReader = new JsonReader(responseBodyReader);

                jsonReader.beginObject();

                while (jsonReader.hasNext()) {

                    String key = jsonReader.nextName();

                    if (key.equals("listaInformacao")) {

                        jsonReader.hasNext();
                        jsonReader.beginArray();

                        InformacaoResumida informacao = new InformacaoResumida();

                        boolean inicioObjeto = true;
                        while (jsonReader.hasNext()) {

                            if (inicioObjeto) {
                                jsonReader.beginObject();
                                jsonReader.hasNext();
                                inicioObjeto = false;
                                informacao = new InformacaoResumida();
                            }
                            else {
                                String keyInfo = jsonReader.nextName();

                                switch (keyInfo) {

                                    case "idInformacao":
                                        informacao.setIdInformacao(jsonReader.nextInt());
                                        break;

                                    case "nomeSistema":
                                        informacao.setNomeSistema(jsonReader.nextString());
                                        break;

                                    case "tipoInformacao":
                                        informacao.setTipoInformacao(jsonReader.nextString());
                                        break;

                                    case "ticket":
                                        informacao.setTicket(jsonReader.nextString());
                                        break;

                                    case "descricao":
                                        informacao.setDescricao(jsonReader.nextString());
                                        break;

                                    case "dtInformacao":
                                        informacao.setData(jsonReader.nextString());
                                        break;

                                    case "hash":
                                        informacao.setHash(jsonReader.nextString());
                                        break;

                                }

                                if (keyInfo.equals("hash")) {
                                    lista.add(informacao);
                                    jsonReader.endObject();
                                    inicioObjeto = true;
                                }
                            }
                        }
                    }
                    else
                    {
                        jsonReader.skipValue();
                    }
                }

                jsonReader.close();

                myConnection.disconnect();

            }
            else
            {
                // Error handling code goes here
            }


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return lista;
    }
}
