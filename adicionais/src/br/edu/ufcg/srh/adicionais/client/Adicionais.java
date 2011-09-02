package br.edu.ufcg.srh.adicionais.client;

import br.edu.ufcg.srh.adicionais.client.mapper.AdicionaisAcitivityMapper;
import br.edu.ufcg.srh.adicionais.client.mapper.AdicionaisPlaceHistoryMapper;
import br.edu.ufcg.srh.adicionais.client.place.LoginPlace;
import br.edu.ufcg.srh.adicionais.client.view.MainPanel;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Entry point classes define {@code onModuleLoad()}.
 */
public class Adicionais implements EntryPoint {

	public static final AdicionaisResources RESOURCES =
		GWT.create(AdicionaisResources.class);

	private Place defaultPlace = new LoginPlace("Login");
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		MainPanel panel = new MainPanel();
		SimplePanel contentArea = panel.getContentArea();

		RESOURCES.css().ensureInjected();

		ClientFactory clientFactory = GWT.create(ClientFactory.class);
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();

		ActivityMapper activityMapper = new AdicionaisAcitivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(contentArea);

		AdicionaisPlaceHistoryMapper historyMapper = GWT.create(AdicionaisPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);

		historyHandler.register(placeController, eventBus, defaultPlace);

		RootLayoutPanel.get().add(panel);
		historyHandler.handleCurrentHistory();
	}
}
