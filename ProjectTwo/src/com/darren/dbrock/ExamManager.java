package com.darren.dbrock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.darren.dbrock.exams.MultipleChoice;
import com.darren.dbrock.exams.TrueFalse;

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
	 * format for question file:
	 * 
	   ****Use split method, with character":" to split strings in file****
	 * 
	 *   examNameHere:questionNumber:question is this string?
	 *   Array [0] = exam name
	 *   Array [1] = question number
	 *   Array [2] = question string
	 * 
	 * format for answer file:
	 * 
	 *   examNameHere:answerNumber:answer is this string.
	 *   Array [0] = exam name
	 *   Array [1] = answer number
	 *   Array [2] = answer string
	 *   
	     ****IF MULT.CHOICE****
	 *   examNameHere:answerNumber:answer number one is this string:answer number two is this string
	 *   Array [0] = exam name
	 *   Array [1] = answer number
	 *   Array [2-4] = answer string
	 */
	
	public static void main(String[] args) {
		List<Exam> exams = new ArrayList<Exam>();
		
		//load all exams on startup
		exams.add(new TrueFalse());
		exams.add(new MultipleChoice());
		
		for(Exam e : exams) {
			e.loadQuestions();
			e.loadAnswers();
		}
		
		//prompt user to enter which exam to take
		Scanner scanner = new Scanner(System.in);
		System.out.println("Here's a list of available exams.");
		
		int counter = 1;
		for(Exam e : exams) {
			System.out.println(counter + ". " + e.getName());
			counter++;
		}
		System.out.println("Which would you like to take?");
		String input = scanner.next();
		
		//start exam based on which exam user chose
		exams.get(input.charAt(0) - 1).startExam(scanner);
	}
	
}
