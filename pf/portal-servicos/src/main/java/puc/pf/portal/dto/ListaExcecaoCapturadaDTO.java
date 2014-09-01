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

@XmlRootElement(name=PortalConstantes.LISTA_EXCECAO_CAPTURADA, namespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_LISTA_EXCECAO_CAPTURADA)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=PortalConstantes.LISTA_EXCECAO_CAPTURADA, namespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_LISTA_EXCECAO_CAPTURADA)
public class ListaExcecaoCapturadaDTO extends BaseBeanDTO {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="ListaExcecao", required=true, nillable=true)
	private List<ExcecaoCapturadaDTO> listaExcecaoDTO;
	
	public ListaExcecaoCapturadaDTO() {
		super();
	}
	
	public ListaExcecaoCapturadaDTO(List<ExcecaoCapturadaDTO> listaExcecaoDTO) {
		this.listaExcecaoDTO = listaExcecaoDTO;
	}
	
	public List<ExcecaoCapturadaDTO> getListaExcecaoDTO() {
		return listaExcecaoDTO;
	}
	
	public void setListaExcecaoDTO(List<ExcecaoCapturadaDTO> listaExcecaoDTO) {
		this.listaExcecaoDTO = listaExcecaoDTO;
	}
	
	public static ListaExcecaoCapturadaDTO parserFromExcecao(List<ExcecaoCapturada> lista) {
		List<ExcecaoCapturadaDTO> listaExcecaoDTO = new ArrayList<ExcecaoCapturadaDTO>();
		if (lista != null && lista.size() > 0) {
			for (ExcecaoCapturada objeto : lista) {
				ExcecaoCapturadaDTO dto = new ExcecaoCapturadaDTO();
				dto.setId(objeto.getId());
				dto.setTipoExcecao(objeto.getTipoExcecao());
				dto.setStacktrace(objeto.getStacktrace());
				dto.setTicket(objeto.getTicket());
				dto.setDataExcecao(objeto.getDataExcecao());
				
				listaExcecaoDTO.add(dto);
			}
		}
		ListaExcecaoCapturadaDTO listaDTO = new ListaExcecaoCapturadaDTO(listaExcecaoDTO);
		return listaDTO;
	}
	
}
