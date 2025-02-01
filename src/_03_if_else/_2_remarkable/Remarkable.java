package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String dog = "Dogs are cute and fun to play with";
	String shoes = "Shoes are cool";
	String music = "Music help me study for my math test";

		// 2. Ask the user to enter a name. Store their answer in a variable.
	String userName = JOptionPane.showInputDialog("Enter your name");
		// 3. In a pop-up, tell the user what is remarkable about that person.
	if ("dog".equals(userName)) {
		JOptionPane.showMessageDialog(null, dog);
	}
	
	if ("shoes".equals(userName)) {
		JOptionPane.showMessageDialog(null, shoes);
	}
	
	if ("music".equals(userName)) {
		JOptionPane.showMessageDialog(null, music);
	}
	
}
}

