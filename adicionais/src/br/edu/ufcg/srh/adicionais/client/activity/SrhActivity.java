package br.edu.ufcg.srh.adicionais.client.activity;

import br.edu.ufcg.srh.adicionais.client.ClientFactory;
import br.edu.ufcg.srh.adicionais.client.view.SrhView;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class SrhActivity extends AbstractActivity implements Presenter {

	private ClientFactory clientFactory;

	public SrhActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		SrhView srhView = this.clientFactory.getSrhView();
		srhView.setPresenter(this);
		panel.setWidget(srhView.asWidget());
	}

	@Override
	public void goTo(Place place) {
		this.clientFactory.getPlaceController().goTo(place);
	}
}
