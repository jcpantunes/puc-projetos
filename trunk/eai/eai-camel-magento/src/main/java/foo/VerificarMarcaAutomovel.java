package foo;

public class VerificarMarcaAutomovel {
	
	private final String PIPE = "\\|";
	
	private final String[] MARCAS = {"fiat", "ford", "honda", "pegeout", "chevrolet"}; 
	
	public boolean isAutomovelFiat(String body) {
		return verificarMarca (body, MARCAS[0]);
	}
	
	public boolean isAutomovelFord(String body) {
		return verificarMarca (body, MARCAS[1]);
	}
	
	public boolean isAutomovelHonda(String body) {
		return verificarMarca (body, MARCAS[2]);
	}
	
	public boolean isAutomovelPegeout(String body) {
		return verificarMarca (body, MARCAS[3]);
	}
	
	public boolean isAutomovelChevrolet(String body) {
		return verificarMarca (body, MARCAS[4]);
	}
	
	private boolean verificarMarca (String body, String marcaModelo) {
		String[] automovel = body.split(PIPE);
		if (automovel.length > 1) {
			String marca = automovel[1]; 
			if (marca.equalsIgnoreCase(marcaModelo)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isAutomovelOutro(String body) {
		String[] automovel = body.split(PIPE);
		if (automovel.length > 1) {
			for (String marca : MARCAS) {
				if (automovel[1].equalsIgnoreCase(marca)) {
					return false;
				}
			}
		}
		return true;
	}
	
//	public static void main(String[] args) {
//		String teste = "0001|Fiat|Fiat Palio 1.6 16V SPORTING";
//		VerificarMarcaAutomovel bean = new VerificarMarcaAutomovel();
//		System.out.println(bean.isAutomovelFiat(teste));
//	}

}
