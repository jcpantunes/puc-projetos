package com.example.monitorapp.dto;

import java.util.Date;

public class ExcecaoCapturada
    extends BaseBeanDTO
{

    protected String tipoExcecao;
    protected String stacktrace;
    protected String ticket;
    protected Date dataExcecao;

    /**
     * Gets the value of the tipoExcecao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoExcecao() {
        return tipoExcecao;
    }

    /**
     * Sets the value of the tipoExcecao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoExcecao(String value) {
        this.tipoExcecao = value;
    }

    /**
     * Gets the value of the stacktrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStacktrace() {
        return stacktrace;
    }

    /**
     * Sets the value of the stacktrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStacktrace(String value) {
        this.stacktrace = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the dataExcecao property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDataExcecao() {
        return dataExcecao;
    }

    /**
     * Sets the value of the dataExcecao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDataExcecao(Date value) {
        this.dataExcecao = value;
    }

}
