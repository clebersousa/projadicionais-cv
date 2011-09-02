package br.edu.ufcg.srh.adicionais.client.view;

import br.edu.ufcg.srh.adicionais.client.Adicionais;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainPanel extends DockLayoutPanel {

	private SimplePanel contentArea;

	public MainPanel() {
		super(Unit.PX);

		Image logoUfcg = new Image(Adicionais.RESOURCES.logoUfcg());
		Image logoAdicionais = new Image(Adicionais.RESOURCES.logoAdicionais());
		HorizontalPanel header = new HorizontalPanel();
		header.add(logoUfcg);
		header.setCellVerticalAlignment(logoUfcg, HasVerticalAlignment.ALIGN_MIDDLE);
		header.add(logoAdicionais);
		header.setCellHorizontalAlignment(logoAdicionais, HasHorizontalAlignment.ALIGN_RIGHT);
		header.setWidth("100%");
		header.setStyleName(Adicionais.RESOURCES.css().header());
		this.addNorth(header, 88);

		VerticalPanel footer = new VerticalPanel();
		Label developersLabel = new Label(
				"Desenvolvido por Cleber Gonçalves de Sousa e Vitor Morato Almeida");
		developersLabel.setStyleName(Adicionais.RESOURCES.css().developers());
		footer.add(developersLabel);
		
		this.addSouth(footer, 23);
		footer.setWidth("100%");
		footer.setStyleName(Adicionais.RESOURCES.css().footer());

		this.contentArea = new SimplePanel();
		this.contentArea.setStyleName(Adicionais.RESOURCES.css().content());
		this.add(this.contentArea);
	}

	public SimplePanel getContentArea() {
		return this.contentArea;
	}
}
