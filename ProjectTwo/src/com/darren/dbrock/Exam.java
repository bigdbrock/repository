package com.darren.dbrock;

import java.util.List;

public interface Exam {

	public List<Question> getQuestions();
	
	public void addQuestion(Question question);
	
	public void loadQuestions();
	
	public void loadAnswers();
	
	public float calculateScore();
	
	//writeReportCard();
}
