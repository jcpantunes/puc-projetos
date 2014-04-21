package com.puc.acn.client.main;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.puc.acn.client.AcnService;
import com.puc.acn.client.AcnServiceAsync;
import com.puc.acn.client.util.FieldVerifier;
import com.puc.acn.client.util.WidgetUtil;

public class PainelOrdenaSequencia extends VerticalPanel {
	
	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final AcnServiceAsync acnService = GWT.create(AcnService.class);
	
	public PainelOrdenaSequencia() {
		prepararWidget();
	}
	
	private void prepararWidget() {
		
		final Label lbl1 = new Label("Inicio");
		final TextBox txtInicio = new TextBox();
		
		final Label lbl2 = new Label("Final");
		final TextBox txtFinal = new TextBox();
		
		final Button btnProcessar = new Button("Processar");
		btnProcessar.addStyleName("sendButton");
		
		MyHandler handler = new MyHandler(btnProcessar, txtInicio, txtFinal);
		btnProcessar.addClickHandler(handler);
		txtFinal.addKeyUpHandler(handler);
		
		final Label lblErro = new Label();
	
		this.add(WidgetUtil.criarPainelHorizontal(lbl1, txtInicio));
		this.add(WidgetUtil.criarPainelHorizontal(lbl2, txtFinal));
		this.add(WidgetUtil.criarPainelHorizontal(btnProcessar));
		this.add(WidgetUtil.criarPainelHorizontal(lblErro));
	
		txtInicio.setFocus(true);
		txtInicio.selectAll();
	}
	
	class MyHandler implements ClickHandler, KeyUpHandler {
		
		private Button sendButton = null;
		private TextBox txt1 = null;
		private TextBox txt2 = null;
		
		public MyHandler(Button sendButton, TextBox txt1, TextBox txt2) {
			this.sendButton = sendButton;
			this.txt1 = txt1;
			this.txt2 = txt2;
		}
		
		@Override
		public void onClick(ClickEvent event) {
			processarInformacao();
		}
		
		@Override
		public void onKeyUp(KeyUpEvent event) {
			if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
				processarInformacao();
			}
		}
		
		private void processarInformacao() {
			final long tempoInicio = System.currentTimeMillis();
			
			if (txt1.getText().isEmpty() || txt2.getText().isEmpty()) {
				ModalPanel modal = new ModalPanel(sendButton, "Ordenar Sequencia de " + txt1.getText() +
						" a " + txt2.getText(), "Os campos devem estar preenchidos");
				modal.center();
			} else if (!FieldVerifier.isDigit(txt1.getText()) || !FieldVerifier.isDigit(txt2.getText())) {
				ModalPanel modal = new ModalPanel(sendButton, "Ordenar Sequencia de " + txt1.getText() +
						" a " + txt2.getText(), "Os valores digitados devem ser numeros");
				modal.center();
			}
			
			final Integer num1 = Integer.parseInt(txt1.getText());
			final Integer num2 = Integer.parseInt(txt2.getText());
			
			try {
				
				acnService.ordernarSequencia(num1, num2, 
						new AsyncCallback<Integer[]>() {
							public void onFailure(Throwable caught) {
								ModalPanel modal = new ModalPanel(sendButton, "Ordenar Sequencia de " + num1 + " a " + num2, caught.getMessage());
								modal.center();
							}
	
							public void onSuccess(Integer[] result) {
								String resultado = "";
								for (int i = 0 ; i < result.length ; i++) {
									resultado+=result[i] + " ";
								}
								System.out.println();
									
								long tempoFinal = System.currentTimeMillis() - tempoInicio;
										
								ModalPanel modal = new ModalPanel(sendButton, "Ordenar Sequencia de " + num1 + " a " + num2, resultado, tempoFinal);
								modal.center();
							}
						});
				
			} catch (Exception e) {
				ModalPanel modal = new ModalPanel(sendButton, "Ordenar Sequencia de " + num1 + " a " + num2, e.getMessage());
				modal.center();
			}
		}
	}
}
