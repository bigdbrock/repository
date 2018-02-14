package com.darren.dbrock;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriting {

	private String path;
	private boolean appendToFile = false;
	
	public FileWriting(String path) {
		this.path = path;
	}
	
	public FileWriting(String path, boolean appendToFile) {
		this.path = path;
		this.appendToFile = appendToFile;
	}

	public void writeToFile(String textLine) {
		try {
			FileWriter write = new FileWriter(path, appendToFile);
			PrintWriter print = new PrintWriter(write);
			
			print.printf("%s" + "%n", textLine);
			print.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
