package com.example.sertifikasinavcustomlistview;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private boolean isMale;

	public User(final String name, final boolean male) {
		super();
		this.name = name;
		isMale = male;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(final boolean male) {
		isMale = male;
	}

	public String getInformation() {
		final String male = isMale ? "Erkek" : "Bayan ";
		return "AD : " + name + "\nCinsiyet : " + male;
	}
}
