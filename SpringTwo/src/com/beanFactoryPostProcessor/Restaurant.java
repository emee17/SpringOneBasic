package com.beanFactoryPostProcessor;

public class Restaurant 
{
	private String welcomeNote;
	
	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void show()
	{
		System.out.println(welcomeNote);
	}

	
}
