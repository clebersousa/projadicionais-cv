package br.edu.ufcg.srh.adicionais.client.activity;

import br.edu.ufcg.srh.adicionais.client.ClientFactory;
import br.edu.ufcg.srh.adicionais.client.view.LoginView;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

public class LoginActivity extends AbstractActivity implements Presenter {

	private ClientFactory clientFactory;
	private LoginView loginView;

	public LoginActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		this.loginView = this.clientFactory.getLoginView();
		this.loginView.setPresenter(this);
		panel.setWidget(this.loginView.asWidget());
		this.addClickHandlersToViewButtons(this.loginView);
	}

	private void addClickHandlersToViewButtons(LoginView loginView) {
		final LoginView lv = this.loginView;
		loginView.getOkButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				login(lv.getLoginTextBox(), lv.getPasswordTextBox());
			}

		});
	}

	private void login(TextBox loginTextBox,
			PasswordTextBox passwordTextBox) {
		String login = loginTextBox.getText();
		String password = passwordTextBox.getText();
		
		
	}

	@Override
	public void goTo(Place place) {
		this.clientFactory.getPlaceController().goTo(place);
	}
}
