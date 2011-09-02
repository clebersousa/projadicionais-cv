package br.edu.ufcg.srh.adicionais.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SrhPlace extends Place {

	private String token;
	
	public SrhPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<SrhPlace> {

		@Override
		public SrhPlace getPlace(String token) {
			return new SrhPlace(token);
		}

		@Override
		public String getToken(SrhPlace place) {
			return place.getToken();
		}
	}
}
