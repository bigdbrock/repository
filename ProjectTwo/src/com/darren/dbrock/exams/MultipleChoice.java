package com.darren.dbrock.exams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.darren.dbrock.Answer;
import com.darren.dbrock.Exam;
import com.darren.dbrock.FileWriting;
import com.darren.dbrock.Question;

public class MultipleChoice implements Exam {

	private List<Question> questions = new ArrayList<Question>();
	private List<Answer> answers = new ArrayList<Answer>();

	@Override
	public String getName() {
		return "MultipleChoice";
	}
	@Override
	public void startExam(Scanner scanner) {
		
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
			String answer1;
			String answer2;
			String answer3;
			while((currentLine = br.readLine()) != null) {
				String[] line = currentLine.split(":");
				examName = line[0];
				answerNumber = line[1];
				answer1 = line[2];
				answer2 = line[3];
				answer3 = line[4];
				if(examName.toLowerCase().equals(getName().toLowerCase())) {
					answers.add(new Answer(Integer.parseInt(answerNumber), answer1, answer2, answer3));
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
