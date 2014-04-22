package org.apache.camel.example.cxf;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class XmlUtil {
	
	@SuppressWarnings("unchecked")
	public static List<String[]> recuperarValor(String xml) {
		List<String[]> lista = new ArrayList<String[]>();
    	try {
    		SAXBuilder sb = new SAXBuilder();        
	        Document d = sb.build(new ByteArrayInputStream(xml.getBytes()));            
	        Element mural = d.getRootElement();               
	        List<Element> elementos = (List<Element>) mural.getChildren();

	        for (Element elem : elementos) {    
	           List<Element> valores =  elem.getContent();
	           
	           String[] resultado = new String[valores.size()];
	           for ( int i=0 ; i < valores.size() ; i++ ) {
	        	   resultado[i] = valores.get(i).getValue();
	           }
	           lista.add(resultado);
	        }
        } catch(Exception e) {
        	e.printStackTrace();
        }
    	return lista;
    }

}
