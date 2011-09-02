package br.edu.ufcg.srh.adicionais.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class LoginPlace extends Place {

	private String token;

	public LoginPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<LoginPlace> {

		@Override
		public LoginPlace getPlace(String token) {
			return new LoginPlace(token);
		}

		@Override
		public String getToken(LoginPlace place) {
			return place.getToken();
		}
	}
}
