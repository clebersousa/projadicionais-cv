package br.edu.ufcg.srh.adicionais.client;

import br.edu.ufcg.srh.adicionais.client.view.CentroView;
import br.edu.ufcg.srh.adicionais.client.view.CentroViewImpl;
import br.edu.ufcg.srh.adicionais.client.view.LoginView;
import br.edu.ufcg.srh.adicionais.client.view.LoginViewImpl;
import br.edu.ufcg.srh.adicionais.client.view.SrhView;
import br.edu.ufcg.srh.adicionais.client.view.SrhViewImpl;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;

public class ClientFactoryImpl implements ClientFactory {

	private final EventBus eventBus = new SimpleEventBus();
	private final PlaceController placeController = new PlaceController(this.eventBus);
	private final LoginView loginView = new LoginViewImpl();
	private final CentroView centroView = new CentroViewImpl();
	private final SrhView srhView = new SrhViewImpl();

	@Override
	public EventBus getEventBus() {
		return this.eventBus;
	}
	
	@Override
	public PlaceController getPlaceController() {
		return this.placeController;
	}
	
	@Override
	public LoginView getLoginView() {
		return this.loginView;
	}
	
	@Override
	public CentroView getCentroView() {
		return this.centroView;
	}

	@Override
	public SrhView getSrhView() {
		return this.srhView;
	}
}
