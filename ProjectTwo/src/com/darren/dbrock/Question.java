package com.darren.dbrock;

public class Question {
	
	private String question;
	private int id;
	
	public Question(String question, int id) {
		this.question = question;
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public int getId() {
		return id;
	}

}
