package com.darren.dbrock;

public class Question {

	private String question;
	private boolean answer = false;
	private int id;
	
	public Question(String question, boolean answer, int id) {
		this.question = question;
		this.answer = answer;
		this.id = id;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public boolean getAnswer() {
		return answer;
	}
	
	public int getId() {
		return id;
	}
}
