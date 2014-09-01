package com.example.monitorapp.dto;

import java.util.ArrayList;
import java.util.List;


public class ConsultarListaExcecaoResponse {

    protected List<ExcecaoCapturada> listaExcecaoCapturada;

    /**
     * Gets the value of the listaExcecaoCapturada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaExcecaoCapturada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaExcecaoCapturada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExcecaoCapturada }
     * 
     * 
     */
    public List<ExcecaoCapturada> getListaExcecaoCapturada() {
        if (listaExcecaoCapturada == null) {
            listaExcecaoCapturada = new ArrayList<ExcecaoCapturada>();
        }
        return this.listaExcecaoCapturada;
    }

}
