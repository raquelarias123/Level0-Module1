package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static  void main(String[]args) {
		String birthday = JOptionPane.showInputDialog("What is your birthday?");
		
		if ("01/31".equals(birthday)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "very merry UNbirthday");
		}
	}
}
