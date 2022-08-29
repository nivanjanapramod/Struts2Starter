package org.test.learning.service;

public class TutorialFinderService {
	public String getBestTutorialSite(String language) {
		if (language.equals("java")){
			return "Java Brains";
		}
		else {
			return "Language not supported";
		}
	}
}
