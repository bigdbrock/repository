package com.darren.dbrock;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * 4 Pillars:
	 * 
	 * 	Abstraction-
	 * 
	 * 	Encapsulation-
	 * 
	 * 	Inheritance-
	 * 
	 * 	Polymorphism-
	 */
	
	public static List<Computer> computers = new ArrayList<Computer>();
	
	public static void main(String[] args) {
		for(Computer comp : computers) {
			System.out.println(comp.toString());
		}
	}
	
}
