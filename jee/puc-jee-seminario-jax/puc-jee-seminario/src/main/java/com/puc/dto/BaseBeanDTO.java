package com.puc.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="BaseBean", namespace="http://localhost:8080/dominio/basebean")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseBeanDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="ID", required=true, nillable=true)
    private Integer id;
    
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

}
