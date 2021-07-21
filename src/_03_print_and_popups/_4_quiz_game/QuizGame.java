package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int correct = 0;
		int count = 0;
		int wrong = 0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String question = "Are there nine planets?";
		int planets = JOptionPane.showConfirmDialog(null, question);
		count++;
		System.out.println(question);

		
				// 3.  Use an if statement to check if their answer is correct
		if(planets == 1) {
			correct++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else
		{
			wrong++;
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		question = "Do dolphins fly?";
		int dolphins = JOptionPane.showConfirmDialog(null, question);
		count++;
		if(dolphins == 1) {
			correct++;
			JOptionPane.showMessageDialog(null, "Correct!");

		}
		else
		{
			wrong++;
			JOptionPane.showMessageDialog(null, "Incorrect!");

		}
		
		//System.out.println(question2);
		
		
		question = "Are bananas sour?";
		int bananas = JOptionPane.showConfirmDialog(null, question);
		count++; 
		if(bananas == 1) {
			correct++;
			JOptionPane.showMessageDialog(null, "Correct!");

		}
		else
		{
			wrong++;
			JOptionPane.showMessageDialog(null, "Incorrect!");

		}
		
		int score = correct - wrong;
		System.out.println("score " + score);
		
		if(score < 0)
			score = 0;
		
		// After all the questions have been asked, tell the user their final score 
		String final_score = "You got " + wrong + " wrong and "+ correct + " correct out of " + count + "!\n"
				+ "You lost " + wrong + " points.."
				+ "\nFinal score is : " + score;
		
		
		JOptionPane.showMessageDialog(null, final_score);
		
	}
}
