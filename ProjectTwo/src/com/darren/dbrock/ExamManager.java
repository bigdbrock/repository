package com.darren.dbrock;

import java.util.ArrayList;
import java.util.List;

public class ExamManager {
 
	/**
	 * 1. Load my exams
	 * 2. Offer user the available exam choices
	 * 3. Give exam
	 *   a. Ask questions
	 *   b. Collect responses
	 * 4. Calculate score
	 * 
	 * 
	 * 
	 * each test has a flatfile where questions and answers are stored
	 */
	
	public List<Exam> exams = new ArrayList<Exam>();
	
	public void main(String[] args) {
		//load all exams on startup
		for(Exam e : exams) {
			e.loadQuestions();
			e.loadAnswers();
		}
		
		//prompt user to enter which exam to take
		for(Exam e : exams) {
			System.out.println(e.getName());
		}
		//start exam based on which exam user chose
	}
	
}
