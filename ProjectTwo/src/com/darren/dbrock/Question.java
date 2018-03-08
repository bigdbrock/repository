package com.darren.dbrock;

public class Question {
	
	private String question;
	private int questionNumber;
	
	public Question(int questionNumber, String question) {
		this.question = question;
		this.questionNumber = questionNumber;
	}

	public String getQuestion() {
		return question;
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

}
