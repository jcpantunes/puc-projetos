package com.puc.monitorapp.model;

public class InformacaoResumida
{

    public InformacaoResumida()
    {
    }

    public int idInformacao;

    public String nomeSistema;

    public String tipoInformacao;

    public String ticket;

    public String descricao;

    public String data;

    public String hash;

    public int getIdInformacao() { return idInformacao; }

    public void setIdInformacao(int idInformacao) {
        this.idInformacao = idInformacao;
    }

    public String getNomeSistema() { return nomeSistema; }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public String getTipoInformacao() { return tipoInformacao; }

    public void setTipoInformacao(String tipoInformacao) {
        this.tipoInformacao = tipoInformacao;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHash() { return hash; }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
