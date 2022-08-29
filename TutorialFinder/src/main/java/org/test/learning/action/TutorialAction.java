package org.test.learning.action;

import org.test.learning.service.TutorialFinderService;

public class TutorialAction {
	private String bestTutorialSite;
	private String language;
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String execute() {
		TutorialFinderService tutorialFinderService =  new TutorialFinderService();
		System.out.println(getLanguage());
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		return "success";
	}
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}
	
	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

}
