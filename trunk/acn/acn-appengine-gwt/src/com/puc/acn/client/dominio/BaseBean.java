package com.puc.acn.client.dominio;

import java.io.Serializable;

public class BaseBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	public BaseBean() {
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
