package br.edu.ufcg.srh.adicionais.client.mapper;

import br.edu.ufcg.srh.adicionais.client.place.CentroPlace;
import br.edu.ufcg.srh.adicionais.client.place.LoginPlace;
import br.edu.ufcg.srh.adicionais.client.place.SrhPlace;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({
	LoginPlace.Tokenizer.class,
	CentroPlace.Tokenizer.class,
	SrhPlace.Tokenizer.class})
public interface AdicionaisPlaceHistoryMapper extends PlaceHistoryMapper {}
