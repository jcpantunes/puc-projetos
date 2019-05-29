package com.puc.monitorapp.servico;

import android.util.JsonReader;
import com.puc.monitorapp.model.InformacaoResumida;
import com.puc.monitorapp.util.Constantes;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WsApiMonitoracao {


    public List<InformacaoResumida> recuperarListaInformacao() throws IOException {

        List<InformacaoResumida> lista = new ArrayList<InformacaoResumida>();

        String url = Constantes.URL_WS_API +  "/consultarrecentes/10";

        /*AsyncTask.execute(new Runnable() {

            @Override
            public void run() {
            }

        });*/

        // Create URL
        URL githubEndpoint = new URL(url);

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

                    lista = criarInformacaoResumida(jsonReader);
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
            throw new IOException("Erro ao acessar a url " + url + ". Tente novamente mais tarde.");
        }

        return lista;
    }

    public InformacaoResumida recuperarInformacao (int id) throws IOException {

        String url = Constantes.URL_WS_API +  "/" + id;

        // Create URL
        URL githubEndpoint = new URL(url);

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

                if (key.equals("informacao")) {

                    //jsonReader.hasNext();
                    //jsonReader.beginArray();

                    return criarInformacaoResumida(jsonReader).get(0);
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
            throw new IOException("Erro ao acessar a url " + url + ". Tente novamente mais tarde.");
        }

        return null;
    }

    private List<InformacaoResumida> criarInformacaoResumida(JsonReader jsonReader) throws IOException
    {
        List<InformacaoResumida> lista = new ArrayList<InformacaoResumida>();

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

        return lista;
    }




}
