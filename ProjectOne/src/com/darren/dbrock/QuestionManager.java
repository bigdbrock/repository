package com.darren.dbrock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionManager {
	
	private List<Question> questions = new ArrayList<Question>();

	public QuestionManager() {
		loadQuestions();
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	private void loadQuestions() {
		
		try {
			FileReader fr = new FileReader("test");
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
			
			String currentLine = "";
			String question;
			String answer;
			int index = 0;
			while((currentLine = br.readLine()) != null) {
				String[] line = currentLine.split(":");
				question = line[0];
				answer = line[1];
				questions.add(new Question(question, Boolean.valueOf(answer), index));
				index++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
