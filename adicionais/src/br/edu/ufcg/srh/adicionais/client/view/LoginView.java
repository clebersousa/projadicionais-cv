package br.edu.ufcg.srh.adicionais.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

public interface LoginView extends View {

	public TextBox getLoginTextBox();
	public PasswordTextBox getPasswordTextBox();
	public Button getOkButton();
}
