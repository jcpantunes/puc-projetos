package puc.pf.portal.dto;

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
    private Long id;
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

}
