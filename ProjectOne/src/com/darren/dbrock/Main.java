package com.darren.dbrock;

import java.util.Scanner;

public class Main {

	/*
	 * Java is an object oriented programming language:true In java, x = 4 is
	 * read as 'x equals four':false In java, x == 4 is read as 'x equals
	 * four':true You must have a main method for your program to run:true A
	 * good time to use an int is when you're calculating GPA:false A class
	 * needs to be instantiated as an object before being used:true If
	 * private/public/protected is not specified, by default private is
	 * used:false Objects can't exist in memory in runtime:false An object is a
	 * variable, where its type is the class used to declare the variable:true
	 * GUI stands for Gimme Ur Internet:false
	 */
	
	private static QuestionManager qm;
	private static FileWriting fw;

	public static void main(String[] args) {
		qm = new QuestionManager();
		fw = new FileWriting("exam_results", true);

		Scanner scanner = new Scanner(System.in);
		runLoop(scanner);
	}

	private static void runLoop(Scanner scanner) {

		int index = 0;
		Question currentQuestion;
		boolean answer;
		int numRight = 0;
		int numWrong = 0;

		System.out.println("Welcome to Darren's Java quiz. All questions are true/false.");
		System.out.println("When a question is presented, answer with a t/f");
		System.out.println();

		String input = "";

		while (index < qm.getQuestions().size() + 1) {
			if (index >= qm.getQuestions().size()) {
				int totalQuestions = numRight + numWrong;
				double average = (100 * numRight / totalQuestions);
				System.out.println("Here's your score: " + average + "%");
				fw.writeToFile(average + "%");
				break;
			}

			currentQuestion = qm.getQuestions().get(index);
			System.out.println(currentQuestion.getQuestion());
			input = scanner.next();

			if (input.toLowerCase().startsWith("t")) {
				answer = true;
				if (currentQuestion.getAnswer() == answer) {
					numRight++;
				} else {
					numWrong++;
				}
				index++;
			} else if (input.toLowerCase().startsWith("f")) {
				answer = false;
				if (currentQuestion.getAnswer() == answer) {
					numRight++;
				} else {
					numWrong++;
				}
				index++;
			} else {
				System.out.println("You must type t for true, or f for false to continue.");
			}
		}
		scanner.close();
	}

}
