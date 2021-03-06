package com.darren.dbrock;

import java.util.List;
import java.util.Scanner;

public interface Exam {
	/**
	 * build exam interface
	 * build 2 stub exams
	 * test
	 */
	
	public String getName();
	
	public void startExam(Scanner scanner);
	
	public List<Question> getQuestions();
	
	public List<Answer> getAnswers();
	
	public void loadQuestions();
	
	public void loadAnswers();
	
	public void writeReportCard(float grade);

	public float calculateScore(int numRight, int numWrong);
}
