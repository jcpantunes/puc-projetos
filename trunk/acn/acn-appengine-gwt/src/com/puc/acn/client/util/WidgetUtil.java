package com.puc.acn.client.util;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;

public class WidgetUtil {
	
	public static HorizontalPanel criarPainelHorizontal(Widget... widgets) {
		HorizontalPanel painel = new HorizontalPanel();
		for(Widget widget : widgets) {
			painel.add(widget);
		}
		painel.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		return painel;
	}

}
