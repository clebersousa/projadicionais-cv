package br.edu.ufcg.srh.adicionais.client.view;

import br.edu.ufcg.srh.adicionais.client.Adicionais;
import br.edu.ufcg.srh.adicionais.client.activity.Presenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LoginViewImpl extends Composite implements LoginView {

	private TextBox loginTextBox;
	private PasswordTextBox passwordTextBox;
	private Button accessButton;
	private Presenter presenter;

	public LoginViewImpl() {
		VerticalPanel vp = new VerticalPanel();
		this.initWidget(vp);
		vp.setSize("100%", "100%");
		FlexTable grid = new FlexTable();
		grid.setStyleName(Adicionais.RESOURCES.css().login());

		Label loginLabel = new Label("Login:");
		this.loginTextBox = new TextBox();
		Label passwordLabel = new Label("Senha:");
		this.passwordTextBox = new PasswordTextBox();
		this.accessButton = new Button("Acessar");
		this.accessButton.setWidth("5em");

		grid.setCellSpacing(6);
		grid.setWidget(0, 0, loginLabel);
		grid.setWidget(0, 1, this.loginTextBox);
		grid.setWidget(1, 0, passwordLabel);
		grid.setWidget(1, 1, this.passwordTextBox);
		grid.setWidget(2, 0, accessButton);
		grid.getFlexCellFormatter().setColSpan(2, 0, 2);
		grid.getCellFormatter().setHorizontalAlignment(
				2, 0, HasHorizontalAlignment.ALIGN_RIGHT);

		vp.add(grid);
		vp.setCellVerticalAlignment(grid, HasVerticalAlignment.ALIGN_MIDDLE);
		vp.setCellHorizontalAlignment(grid, HasHorizontalAlignment.ALIGN_CENTER);
		this.setSize("100%", "100%");
	}

	@Override
	public TextBox getLoginTextBox() {
		return this.loginTextBox;
	}

	@Override
	public PasswordTextBox getPasswordTextBox() {
		return this.passwordTextBox;
	}
	
	@Override
	public Button getOkButton() {
		return this.accessButton;
	}

	@Override
	public Presenter getPresenter() {
		return this.presenter;
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}
}
