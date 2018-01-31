package com.darren.dbrock;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * 4 Pillars:
	 * 
	 * 	Abstraction- An inheritance hierarchy, where the higher classes are simpler or more general, and define more general 
	 *               and abstract implementation. While the lower classes in the hierarchy are more concrete and define more 
	 *               detailed implementations.
	 * 
	 * 	Encapsulation- To hide details of implementation, limit what other classes have access to.
	 * 
	 * 	Inheritance- When an object or class is based on another object, but uses the same implementation.
	 * 
	 * 	Polymorphism- The ability to present the same interface for different underlying forms.
	 */
	
	public static List<Computer> computers = new ArrayList<Computer>();
	
	public static void main(String[] args) {
		new Desktop();
		new Laptop();
		
		for(Computer comp : computers) {
			System.out.println(comp.toString());
		}
	}
	
}
