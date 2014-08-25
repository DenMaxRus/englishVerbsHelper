package com.englishverbshelper;

public class Verb {
	int id;
	Word[] forms;
	String[] translations;
	
	public Verb(Word[] forms, String[] translations) {
		this.forms = forms;
		this.translations = translations;
	}
}
