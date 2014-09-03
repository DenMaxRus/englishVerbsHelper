package com.englishverbshelper;

public class PhrasalVerb {
	private int id;
	String mainVerb;
	Word[] variants;
	public PhrasalVerb(String mainVerb, Word[] variants) {
		this.mainVerb = mainVerb;
		this.variants = variants;
	}
}
