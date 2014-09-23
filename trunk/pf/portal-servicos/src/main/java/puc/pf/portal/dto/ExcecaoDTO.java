package puc.pf.portal.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import puc.pf.portal.domain.ExcecaoCapturada;
import puc.pf.portal.util.PortalConstantes;

// @XmlRootElement(name = "ExcecaoCapturada", namespace = "http://localhost:8080/jaxws/dominio/ExcecaoCapturada")
@XmlRootElement(name=PortalConstantes.EXCECAO, namespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_EXCECAO)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=PortalConstantes.EXCECAO, namespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_EXCECAO)
public class ExcecaoDTO extends BaseBeanDTO {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="TipoExcecao", required=true, nillable=true)
	private String tipoExcecao;
	
	@XmlElement(name="Stacktrace", required=true, nillable=true)
	private String stacktrace;
	
	@XmlElement(name="Ticket", required=true, nillable=true)
	private String ticket;
	
	@XmlElement(name="DataExcecao", required=true, nillable=true)
    protected Date dataExcecao;
	
	public ExcecaoDTO() {
		super();
	}
	
	public ExcecaoDTO(Long id, String tipoExcecao, String stacktrace, String ticket, Date dataExcecao) {
		this.setId(id);
		this.tipoExcecao = tipoExcecao;
		this.stacktrace = stacktrace;
		this.ticket = ticket;
		this.dataExcecao = dataExcecao; 
	}
	
	public String getTipoExcecao() {
		return tipoExcecao;
	}
	
	public void setTipoExcecao(String tipoExcecao) {
		this.tipoExcecao = tipoExcecao;
	}
	
	public String getStacktrace() {
		return stacktrace;
	}
	
	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
		if (stacktrace.length() > 2000) {
			this.stacktrace = this.stacktrace.substring(0, 2000);
		}
	}
	
	public String getTicket() {
		return ticket;
	}
	
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	public Date getDataExcecao() {
		return dataExcecao;
	}
	
	public void setDataExcecao(Date dataExcecao) {
		this.dataExcecao = dataExcecao;
	}
	
	public static ExcecaoDTO parserFromExcecao(ExcecaoCapturada objeto) {
		ExcecaoDTO dto = new ExcecaoDTO();
		if (objeto != null) {
			dto.setId(objeto.getId());
			dto.tipoExcecao = objeto.getTipoExcecao();
			dto.stacktrace = objeto.getStacktrace();
			dto.ticket = objeto.getTicket();
			dto.dataExcecao = objeto.getDataExcecao();
		}
		return dto;
	}
	
	public static List<ExcecaoDTO> parserFromExcecao(List<ExcecaoCapturada> lista) {
		List<ExcecaoDTO> listaRetorno = new ArrayList<ExcecaoDTO>();
		for (ExcecaoCapturada objeto : lista) {
			listaRetorno.add(parserFromExcecao(objeto));
		}
		return listaRetorno;
	}
}
