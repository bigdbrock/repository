package com.darren.dbrock;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class ApplicationWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void runApplication() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationWindow window = new ApplicationWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationWindow() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 33, 299, 161);
		frame.getContentPane().add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(323, 33, 83, 30);
		frame.getContentPane().add(comboBox);
	}
}
