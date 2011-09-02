package br.edu.ufcg.srh.adicionais.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface AdicionaisResources extends ClientBundle {

	@Source("image12.png")
	public ImageResource logoUfcg();

	@Source("logo.png")
	public ImageResource logoAdicionais();

	@Source("logoIce.png")
	public ImageResource logoDeveloper();

	@Source("Adicionais.css")
	public AdicionaisCssResource css();
}
