package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String prompt = "Do you know how to write code?";
		//JOptionPane.showMessageDialog(null, prompt);
		int input = JOptionPane.showConfirmDialog(null, prompt);
		
		System.out.println(input);
		
		if(input == 0)
		{
			JOptionPane.showMessageDialog(null, "You will rule the world!");
		}
		else if(input == 1)
		{
			JOptionPane.showMessageDialog(null, "Sign up for classes at the league!");
		}

	}
}