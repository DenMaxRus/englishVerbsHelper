package com.englishverbshelper;

public class IrregularVerb {
	private int id;
	Word[] forms;
	String[] translations;
	
	public IrregularVerb(Word[] forms, String[] translations) {
		this.forms = forms;
		this.translations = translations;
	}
}