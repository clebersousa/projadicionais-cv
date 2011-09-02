package br.edu.ufcg.srh.adicionais.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class CentroPlace extends Place {

	private String token;
	
	public CentroPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<CentroPlace> {

		@Override
		public CentroPlace getPlace(String token) {
			return new CentroPlace(token);
		}

		@Override
		public String getToken(CentroPlace place) {
			return place.getToken();
		}
	}
}
