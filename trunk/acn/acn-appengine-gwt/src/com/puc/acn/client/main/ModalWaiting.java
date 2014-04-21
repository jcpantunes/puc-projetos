package com.puc.acn.client.main;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ModalWaiting extends DialogBox {
	
	public ModalWaiting() {
		renderizarWidget();
	}

	private void renderizarWidget() {
	
		this.setText("Processamento do Servidor ");
		this.setAnimationEnabled(true);
		
		VerticalPanel dialogVPanel = new VerticalPanel();
		dialogVPanel.addStyleName("dialogVPanel");
		dialogVPanel.add(new HTML("<b> Processando .... </b>"));

		this.setWidget(dialogVPanel);
	}
	
}
