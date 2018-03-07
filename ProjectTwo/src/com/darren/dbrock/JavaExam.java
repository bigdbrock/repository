package com.darren.dbrock;

import java.util.ArrayList;
import java.util.List;

public class JavaExam implements Exam {
	
	private List<Question> questions = new ArrayList<Question>();
	private List<Answer> answers = new ArrayList<Answer>();

	@Override
	public void startExam() {
		
	}

	@Override
	public List<Question> getQuestions() {
		return questions;
	}

	//pull from file
	@Override
	public void loadQuestions() {
		
	}

	//pull from file
	@Override
	public void loadAnswers() {
		
	}

	@Override
	public float calculateScore() {
		return 0;
	}

	//write to a file
	@Override
	public void writeReportCard() {
		
	}

	@Override
	public List<Answer> getAnswers() {
		return answers;
	}

}
