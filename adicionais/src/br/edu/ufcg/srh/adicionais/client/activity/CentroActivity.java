package br.edu.ufcg.srh.adicionais.client.activity;

import br.edu.ufcg.srh.adicionais.client.ClientFactory;
import br.edu.ufcg.srh.adicionais.client.view.CentroView;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;


public class CentroActivity extends AbstractActivity implements Presenter {

	private ClientFactory clientFactory;

	public CentroActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void goTo(Place place) {
		this.clientFactory.getPlaceController().goTo(place);
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		CentroView centroView = this.clientFactory.getCentroView();
		centroView.setPresenter(this);
		panel.setWidget(centroView.asWidget());
	}
}
