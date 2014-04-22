package foo;

import java.util.List;

import magento.CatalogCategoryEntity;
import magento.CatalogCategoryTreeRequestParam;
import magento.CatalogCategoryTreeResponseParam;
import magento.CatalogProductEntity;
import magento.CatalogProductListRequestParam;
import magento.CatalogProductListResponseParam;
import magento.Filters;
import magento.LoginParam;
import magento.LoginResponseParam;
import magento.MageApiModelServerWsiHandlerPortType;
import magento.MagentoService;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


public class ObtemListaProdutosTeste implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		StringBuilder products = new StringBuilder();
		
//		String wsdl = "https://eai2013camel.gostorego.com/api/?wsdl";
//		String wsdl = "https://eai2013camel.gostorego.com/api/v2_soap?wsdl";
//		String wsdl = "https://eai2013camel.gostorego.com/api/wsi_soap/?wsdl";
		
		MagentoService ms = new MagentoService();
		
//		Mage_Api_Model_Server_V2_HandlerPortType client = ms.getMage_Api_Model_Server_V2_HandlerPort();
//		String sessionId = client.login("eai", "integracao");
//
//		CatalogProductEntity[] lista = client.catalogProductList(sessionId, null, null);
//		List<CatalogProductEntity> listaProduto = recuperarListaProduto(lista);
//		
//		CatalogCategoryTree arvore = client.catalogCategoryTree(sessionId, null, null);
//		List<CatalogCategoryEntity> listaCategoria = recuperarListaCategoria(arvore.getChildren());
		
		MageApiModelServerWsiHandlerPortType client = ms.getMageApiModelServerWsiHandlerPort();
		LoginResponseParam param = client.login(recuperarLoginParam());
		String sessionId = param.getResult();
		
		// Obter lista de produtos
		CatalogProductListRequestParam p1 = new CatalogProductListRequestParam();
		p1.setSessionId(sessionId);
		p1.setFilters(new Filters());
		CatalogProductListResponseParam r1 = client.catalogProductList(p1);
		// List<CatalogProductEntity> listaProduto = recuperarListaProduto(r1.getResult());
		List<CatalogProductEntity> listaProduto = r1.getResult().getComplexObjectArray();
		
		// Obter lista de produtos
		CatalogCategoryTreeRequestParam p2 = new CatalogCategoryTreeRequestParam();
		p2.setParentId("1");
		p2.setSessionId(sessionId);
		CatalogCategoryTreeResponseParam r2 = client.catalogCategoryTree(p2);
		// List<CatalogCategoryEntity> listaCategoria = recuperarListaCategoria(r2.getResult().getChildren());
		List<CatalogCategoryEntity> listaCategoria = r2.getResult().getChildren().getComplexObjectArray();
		
		// Converte para texto
		String delimitador = "|";
		String quebraLinha = "\n";
		for (CatalogProductEntity produto : listaProduto) {
			CatalogCategoryEntity categoria = recuperarCategoria(listaCategoria, Integer.parseInt(produto.getCategoryIds().getComplexObjectArray().get(0)));
			String nomeCategoria = categoria != null ? categoria.getName() : "Categoria";
			products.append(produto.getSku()).append(delimitador)
					.append(nomeCategoria).append(delimitador)
					.append(produto.getName()).append(quebraLinha);
		}
		
		System.out.println("Session Id: " + sessionId);
		System.out.println(products.toString());
		
		e.getIn().setBody(products.toString());
	}
	
	private LoginParam recuperarLoginParam() {
		LoginParam loginParam = new LoginParam();
		loginParam.setApiKey("integracao");
		loginParam.setUsername("eai");
		return loginParam;
	}
	
//	private List<CatalogProductEntity> recuperarListaProduto (CatalogProductEntity[] lista) throws Exception {
//		List<CatalogProductEntity> resultado = new ArrayList<CatalogProductEntity>();
//		for (CatalogProductEntity produto : lista) {
//			resultado.add(produto);
//		}
//		return resultado;
//	}
//	
//	private List<CatalogCategoryEntity> recuperarListaCategoria (CatalogCategoryEntity[] lista) throws Exception {
//		List<CatalogCategoryEntity> resultado = new ArrayList<CatalogCategoryEntity>();
//		if (lista.length > 0) {
//			for (CatalogCategoryEntity categoria : lista) {
//				if(categoria != null) {
//					resultado.add(categoria);
//					resultado.addAll(recuperarListaCategoria(categoria.getChildren()));
//				}
//			}
//		}
//		return resultado;
//	}
	
	private CatalogCategoryEntity recuperarCategoria (List<CatalogCategoryEntity> listaCategoria, int id) {
		List<CatalogCategoryEntity> listaTodasCategoria = listaCategoria;
		if(listaCategoria.size() == 1) {
			listaTodasCategoria = listaCategoria.get(0).getChildren().getComplexObjectArray();
		}
		for (CatalogCategoryEntity categoria : listaTodasCategoria) {
			if (categoria.getCategoryId() == id) {
				return categoria;
			}
		}
		return null;
	}

	//	public static void main(String args[]) {
	//	ObtemListaProdutosTeste teste = new ObtemListaProdutosTeste();
	//	try {
	//		teste.process(null);
	//	} catch(Exception e){
	//		e.printStackTrace();
	//	}
	//}


}
