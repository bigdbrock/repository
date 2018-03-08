package com.darren.dbrock;

public class Answer {
	
	private String answer;
	private int answerNumber;
	
	public Answer(int answerNumber, String answer) {
		this.answer = answer;
		this.answerNumber = answerNumber;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public int getAnswerNumber() {
		return answerNumber;
	}

}
