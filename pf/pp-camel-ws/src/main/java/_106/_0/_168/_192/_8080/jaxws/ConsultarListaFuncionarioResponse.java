
package _106._0._168._192._8080.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _106._0._168._192._8080.jaxws.dominio.funcionario.Funcionario;


/**
 * <p>Java class for consultarListaFuncionarioResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarListaFuncionarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://192.168.0.106:8080/jaxws/dominio/funcionario}ListaFuncionario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarListaFuncionarioResponse", propOrder = {
    "listaFuncionario"
})
public class ConsultarListaFuncionarioResponse {

    @XmlElement(name = "ListaFuncionario", namespace = "http://192.168.0.106:8080/jaxws/dominio/funcionario")
    protected List<Funcionario> listaFuncionario;

    /**
     * Gets the value of the listaFuncionario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaFuncionario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaFuncionario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Funcionario }
     * 
     * 
     */
    public List<Funcionario> getListaFuncionario() {
        if (listaFuncionario == null) {
            listaFuncionario = new ArrayList<Funcionario>();
        }
        return this.listaFuncionario;
    }

}
