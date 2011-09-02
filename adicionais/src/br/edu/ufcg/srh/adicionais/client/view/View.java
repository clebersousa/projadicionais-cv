package br.edu.ufcg.srh.adicionais.client.view;

import br.edu.ufcg.srh.adicionais.client.activity.Presenter;

import com.google.gwt.user.client.ui.Widget;

public interface View {	
	public Presenter getPresenter();
	public void setPresenter(Presenter presenter);
	public Widget asWidget();
}
