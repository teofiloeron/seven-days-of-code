package com.eronapps.model;

import java.util.List;

public class Items {

	public List<Filme> filmes;
	public String ErrorMessage;

	public Items() {
	}

	public Items(List<Filme> filmes, String errorMessage) {
		super();
		this.filmes = filmes;
		ErrorMessage = errorMessage;
	}

	public List<Filme> getItems() {
		return filmes;
	}

	public void setItems(List<Filme> filmes) {
		this.filmes = filmes;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}

}
