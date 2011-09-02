package br.edu.ufcg.srh.adicionais.client.activity;

import br.edu.ufcg.srh.adicionais.client.view.View;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public abstract class ParentActivity extends AbstractActivity implements Presenter {

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		this.getView().setPresenter(this);
		panel.setWidget(this.getView().asWidget());
	}

	@Override
	public void goTo(Place place) {
		this.getView().getPresenter().goTo(place);
	}
	
	protected abstract View getView();
}
