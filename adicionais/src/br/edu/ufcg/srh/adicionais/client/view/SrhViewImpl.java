package br.edu.ufcg.srh.adicionais.client.view;

import br.edu.ufcg.srh.adicionais.client.activity.Presenter;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SrhViewImpl extends Composite implements SrhView {

	private Label title;
	private Presenter presenter;

	public SrhViewImpl() {
		VerticalPanel vp = new VerticalPanel();
		this.initWidget(vp);
		title = new Label("SRH");
		vp.add(title);
	}

	@Override
	public Presenter getPresenter() {
		return this.presenter;
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}
}
