package br.edu.ufcg.srh.adicionais.client;

import br.edu.ufcg.srh.adicionais.client.view.CentroView;
import br.edu.ufcg.srh.adicionais.client.view.LoginView;
import br.edu.ufcg.srh.adicionais.client.view.SrhView;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;

public interface ClientFactory {
	public EventBus getEventBus();
	public PlaceController getPlaceController();
	public LoginView getLoginView();
	public CentroView getCentroView();
	public SrhView getSrhView();
}
