package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		int score = 0;
		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		String input = JOptionPane.showInputDialog("You can not keep me until you have given me away. What am I?");  
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		if(input.equals("giveaway")) {
			
			JOptionPane.showMessageDialog(null,"good job you got it correct. You now get 1 more point.");
			
			score = score+1;
			
			
			}
		
		else {
			
			JOptionPane.showMessageDialog(null,"Wrong :(");
			
			
			JOptionPane.showMessageDialog(null,"The right answer was giveaway.");
			
		}
		
		
		
		
		String input1 = JOptionPane.showInputDialog("I have 6 sides, 6 different colors, and have 6 letters in my first word. What am I?");  
		
		
		
if(input1.equals("rubik's cube")) {
			
			JOptionPane.showMessageDialog(null,"good job you got it correct. You now get 1 more point.");
			
			score = score+1;
			
			
			}
		
		else {
			
			JOptionPane.showMessageDialog(null,"Wrong :(");
			
			
			JOptionPane.showMessageDialog(null,"The right answer was rubik's cube.");
			
		}
		
	
		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
		
		JOptionPane.showMessageDialog(null,"score:" +score);
		
	}
}

