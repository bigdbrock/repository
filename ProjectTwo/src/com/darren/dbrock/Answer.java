package com.darren.dbrock;

public class Answer {
	
	private String answer;
	private String answer2;
	private String answer3;
	private int answerNumber;
	
	public Answer(int answerNumber, String answer) {
		this.answer = answer;
		this.answerNumber = answerNumber;
	}
	
	public Answer(int answerNumber, String answer, String answer2, String answer3) {
		this.answerNumber = answerNumber;
		this.answer = answer;
		this.answer2 = answer2;
		this.answer3 = answer3;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public String getAnswer2() {
		return answer2;
	}
	
	public String getAnswer3() {
		return answer3;
	}
	
	public int getAnswerNumber() {
		return answerNumber;
	}

}
