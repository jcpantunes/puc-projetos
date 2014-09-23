package puc.pf.portal.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import puc.pf.portal.domain.ExcecaoCapturada;
import puc.pf.portal.util.PortalConstantes;

@XmlRootElement(name=PortalConstantes.LISTA_EXCECAO, namespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_LISTA_EXCECAO)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=PortalConstantes.LISTA_EXCECAO, namespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_LISTA_EXCECAO)
public class ListaExcecaoDTO extends BaseBeanDTO {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="ListaExcecao", required=true, nillable=true)
	private List<ExcecaoDTO> listaExcecaoDTO;
	
	public ListaExcecaoDTO() {
		super();
	}
	
	public ListaExcecaoDTO(List<ExcecaoDTO> listaExcecaoDTO) {
		this.listaExcecaoDTO = listaExcecaoDTO;
	}
	
	public List<ExcecaoDTO> getListaExcecaoDTO() {
		return listaExcecaoDTO;
	}
	
	public void setListaExcecaoDTO(List<ExcecaoDTO> listaExcecaoDTO) {
		this.listaExcecaoDTO = listaExcecaoDTO;
	}
	
	public static ListaExcecaoDTO parserFromExcecao(List<ExcecaoCapturada> lista) {
		List<ExcecaoDTO> listaExcecaoDTO = new ArrayList<ExcecaoDTO>();
		if (lista != null && lista.size() > 0) {
			for (ExcecaoCapturada objeto : lista) {
				ExcecaoDTO dto = new ExcecaoDTO();
				dto.setId(objeto.getId());
				dto.setTipoExcecao(objeto.getTipoExcecao());
				dto.setStacktrace(objeto.getStacktrace());
				dto.setTicket(objeto.getTicket());
				dto.setDataExcecao(objeto.getDataExcecao());
				
				listaExcecaoDTO.add(dto);
			}
		}
		ListaExcecaoDTO listaDTO = new ListaExcecaoDTO(listaExcecaoDTO);
		return listaDTO;
	}
	
}
