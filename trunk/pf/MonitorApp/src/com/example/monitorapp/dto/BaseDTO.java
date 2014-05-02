package com.example.monitorapp.dto;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
     * Retorna uma String no formato dd/MM/yyyy HH:mm:ss, considerando um Date como parametro.
     * 
     * @param data
     *            Data a ser convertida
     * @return String convertida
     */
    public static String retornaDataString(Date data) {
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR"));
        return sdf.format(data);
    }
    
    public static Date retornaDataDate(String data) {
    	try {
    		return DateFormat.getInstance().parse(data);
    	} catch (ParseException e) {
    		return Calendar.getInstance().getTime();
    	}
    }

}
