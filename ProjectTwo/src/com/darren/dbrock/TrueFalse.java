package com.darren.dbrock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrueFalse implements Exam {
	
	private List<Question> questions = new ArrayList<Question>();
	private List<Answer> answers = new ArrayList<Answer>();

	@Override
	public String getName() {
		return "TrueFalse";
	}
	@Override
	public void startExam() {
		//play out exam
		int index = 0;
		Question currentQuestion;
		boolean answer;
		int numRight = 0;
		int numWrong = 0;

		System.out.println("Welcome to Darren's Java quiz. All questions are true/false.");
		System.out.println("When a question is presented, answer with a t/f");
		System.out.println();

		String input = "";
		Scanner scanner = new Scanner(System.in);
		
		while (index < questions.size() + 1) {
			if (index >= questions.size()) {
				//calcualte score
				float average = calculateScore(numRight, numWrong);
				
				//write scores to a flatfile
				writeReportCard(average);
				
				System.out.println("Here's your score: " + average + "%");
				scanner.close();
				break;
			}

			currentQuestion = questions.get(index);
			System.out.println(currentQuestion.getQuestion());
			input = scanner.next();

			if (input.toLowerCase().startsWith("t")) {
				answer = true;
				if (answers.get(index).getAnswer() == String.valueOf(answer)) {
					numRight++;
				} else {
					numWrong++;
				}
				index++;
			} else if (input.toLowerCase().startsWith("f")) {
				answer = false;
				if (answers.get(index).getAnswer() == String.valueOf(answer)) {
					numRight++;
				} else {
					numWrong++;
				}
				index++;
			} else {
				System.out.println("You must type t for true, or f for false to continue.");
			}
		}
	}

	@Override
	public List<Question> getQuestions() {
		return questions;
	}

	//pull from file
	 /** Array [0] = exam name
	 *   Array [1] = question number
	 *   Array [2] = question string*/
	@Override
	public void loadQuestions() {
		try {
			FileReader fr = new FileReader("Questions");
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
			
			String currentLine = "";
			String examName;
			String questionNumber;
			String question;
			while((currentLine = br.readLine()) != null) {
				String[] line = currentLine.split(":");
				examName = line[0];
				questionNumber = line[1];
				question = line[2];
				if(examName.toLowerCase().equals(getName().toLowerCase())) {
					questions.add(new Question(Integer.parseInt(questionNumber), question));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//pull from file
	@Override
	public void loadAnswers() {
		try {
			FileReader fr = new FileReader("Answers");
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
			
			String currentLine = "";
			String examName;
			String answerNumber;
			String answer;
			while((currentLine = br.readLine()) != null) {
				String[] line = currentLine.split(":");
				examName = line[0];
				answerNumber = line[1];
				answer = line[2];
				if(examName.toLowerCase().equals(getName().toLowerCase())) {
					answers.add(new Answer(Integer.parseInt(answerNumber), answer));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public float calculateScore(int numRight, int numWrong) {
		int totalQuestions = numRight + numWrong;
		float average = (100 * numRight / totalQuestions);
		return average;
	}

	//write to a file
	@Override
	public void writeReportCard(float grade) {
		FileWriting fw = new FileWriting("reportcard", true);
		fw.writeToFile(getName() + ": " + grade + "%");
	}

	@Override
	public List<Answer> getAnswers() {
		return answers;
	}

}
