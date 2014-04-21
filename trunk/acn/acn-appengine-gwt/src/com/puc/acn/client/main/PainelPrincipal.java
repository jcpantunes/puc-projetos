package com.puc.acn.client.main;

import com.google.gwt.user.client.ui.TabPanel;

public class PainelPrincipal extends TabPanel {
	
	public PainelPrincipal() {
		criarWidget();
	}
	
	private void criarWidget() {
	
		this.add(new PainelOrdenaSequencia(), "Ordena Sequencia");
		this.add(new PainelOrdenaPessoa(), "Ordena Pessoas");
		
		this.setSize("800px", "600px");
		
	}
	
}
