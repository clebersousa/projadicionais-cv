package br.edu.ufcg.srh.adicionais.client.view;

import br.edu.ufcg.srh.adicionais.client.activity.Presenter;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CentroViewImpl extends Composite implements CentroView {

	private Label title;
	private Presenter presenter;

	public CentroViewImpl() {
		VerticalPanel vp = new VerticalPanel();
		this.initWidget(vp);
		title = new Label("Centro");
		vp.add(title);
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Presenter getPresenter() {
		return this.presenter;
	}
}
