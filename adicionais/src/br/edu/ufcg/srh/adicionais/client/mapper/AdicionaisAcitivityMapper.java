package br.edu.ufcg.srh.adicionais.client.mapper;

import br.edu.ufcg.srh.adicionais.client.ClientFactory;
import br.edu.ufcg.srh.adicionais.client.activity.CentroActivity;
import br.edu.ufcg.srh.adicionais.client.activity.LoginActivity;
import br.edu.ufcg.srh.adicionais.client.activity.SrhActivity;
import br.edu.ufcg.srh.adicionais.client.place.CentroPlace;
import br.edu.ufcg.srh.adicionais.client.place.LoginPlace;
import br.edu.ufcg.srh.adicionais.client.place.SrhPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AdicionaisAcitivityMapper implements ActivityMapper {

	private ClientFactory clientFactory;

	public AdicionaisAcitivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof LoginPlace) {
			return new LoginActivity(this.clientFactory);
		}
		if (place instanceof CentroPlace) {
			return new CentroActivity(this.clientFactory);
		}
		if (place instanceof SrhPlace) {
			return new SrhActivity(this.clientFactory);
		}
		return null;
	}
}
