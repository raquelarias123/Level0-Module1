package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String userAnswer = JOptionPane.showInputDialog(null, "What has to be broken before you can use it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if ("An egg".equals(userAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is an egg");
		}
		userAnswer = JOptionPane.showInputDialog(null, "What month of the year has 28 days?");
		if("all of them".equals(userAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score ++;
			}
		
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is all of them");
		}
		
		userAnswer = JOptionPane.showInputDialog(null, "What is always in front of you but can’t be seen?");
		if ("the future".equals(userAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is the future");
		}
		
		userAnswer = JOptionPane.showInputDialog(null, "What gets wet while drying?");
		if ("A towel".equals(userAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		
		JOptionPane.showMessageDialog(null, "Your score is "+score);
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

