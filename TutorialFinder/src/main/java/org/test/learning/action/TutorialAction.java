package org.test.learning.action;

import org.test.learning.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	
	public String execute() {
		TutorialFinderService tutorialFinderService =  new TutorialFinderService();
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite());
		return "success";
	}
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}
	
	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}
}
