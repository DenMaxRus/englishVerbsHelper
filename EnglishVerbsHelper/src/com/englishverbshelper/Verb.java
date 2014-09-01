package com.englishverbshelper;

public class Verb {
	private int id;
	Word[] forms;
	String[] translations;
	
	public int getId() {
		return id;
	}
	
	public Verb(Word[] forms, String[] translations) {
		this.forms = forms;
		this.translations = translations;
	}
}