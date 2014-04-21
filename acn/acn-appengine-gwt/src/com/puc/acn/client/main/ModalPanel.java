package com.puc.acn.client.main;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ModalPanel extends DialogBox {
	
	public ModalPanel(final Button sendButton, final String entrada, final String saida) {
		renderizarWidget(sendButton, entrada, saida, 0);
	}
	
	public ModalPanel(final Button sendButton, final String entrada, final String saida, long tempoExecucao) {
		renderizarWidget(sendButton, entrada, saida, tempoExecucao);
	}
	
	private void renderizarWidget(final Button sendButton, final String entrada, final String saida, long tempoExecucao) {
	
		this.setText("Remote Procedure Call");
		this.setAnimationEnabled(true);
		
		final Button closeButton = new Button("Close");
		// We can set the id of a widget by accessing its Element
		closeButton.getElement().setId("closeButton");
		final Label textToServerLabel = new Label(entrada);
		final HTML serverResponseLabel = new HTML(saida);
		
		VerticalPanel dialogVPanel = new VerticalPanel();
		dialogVPanel.addStyleName("dialogVPanel");
		
		dialogVPanel.add(new HTML("<b>Enviando Mensagem para o Servidor:</b>"));
		dialogVPanel.add(textToServerLabel);
		
		dialogVPanel.add(new HTML("<b>Tempo de Processamento:</b> " + tempoExecucao));
		
		dialogVPanel.add(new HTML("<br><b>Resposta do Servidor:</b>"));
		
		ScrollPanel scroll = new ScrollPanel();
		scroll.add(serverResponseLabel);
		scroll.setHeight("400px");
		dialogVPanel.add(scroll);
		
		
		dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
		
		dialogVPanel.add(closeButton);
		
		this.setWidget(dialogVPanel);
	
		// Add a handler to close the DialogBox
		closeButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				fecharModal(sendButton);
			}
		});
	}
	
	private void fecharModal(final Button sendButton) {
		this.hide();
		sendButton.setEnabled(true);
		sendButton.setFocus(true);
	}
}
