package com.darren.dbrock;

public class Answer {
	
	public String answer;
	public int id;
	
	public Answer(String answer, int id) {
		this.answer = answer;
		this.id = id;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public int getId() {
		return id;
	}

}