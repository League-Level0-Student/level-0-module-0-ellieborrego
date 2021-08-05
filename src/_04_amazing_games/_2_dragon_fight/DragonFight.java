package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		
			// playerHealth to store your health - set it equal to 100
		int playerHealth = 100; 
		
	
			// dragonHealth to store the dragon's health - set it equal to 100
		int dragonHealth = 100;
		
		// 2.Create some variables to hold the attack strengths. These will be given different values later. 
		
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
			
		int playerAttack = 0;
		
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
		int dragonAttack = 0;
		
		int shieldDefense = 0;
		
		int lost_points = 0;
		
		String shield_str = "";
		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
			
			String[] attackArray = {"yell","kick","sword", "shield"};
			
			int attackType = JOptionPane.showOptionDialog(null, "Choose attack type: ", "Click a button", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, null, attackArray, attackArray[0]);
					
	
				// 4. If they typed in "yell":
	
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			if (attackType == 0)
				playerAttack = ran.nextInt(10);
			
				// 5. If they typed in "kick":
	
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
			else if (attackType == 1)
				playerAttack = ran.nextInt(25);
		
			else if (attackType == 2)
				playerAttack = ran.nextInt(35);
			
			else if (attackType == 3)
			{
				playerAttack = 0;
				shieldDefense = ran.nextInt(35);
			}
				// 6. Subtract the player attack value from the dragon's health
			
			dragonHealth -= playerAttack;

			// THE DRAGON RETALIATES

				// 7. Find a random number between 0 and 35 and store it in dragonAttack
			
			dragonAttack = ran.nextInt(35);
	
				// 8. Subtract the dragon attack value from the player's health
			if (attackType != 3)
			{
				playerHealth -= dragonAttack;
				lost_points = dragonAttack;
			}
			else
				if(dragonAttack <= shieldDefense)
				{
					playerHealth -= 0;
					shield_str = ", Shield protected your health points!";
					lost_points = 0;
				}
				else
				{
					playerHealth -= (dragonAttack-shieldDefense);
					shield_str = ", only lost " 
							+ (dragonAttack - shieldDefense) + " health points";
					lost_points = dragonAttack - shieldDefense;

				}
			
			// ASSESS THE DAMAGE

				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
			
			if (playerHealth <= 0)
				playerLost();
	
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
			
			if (dragonHealth <= 0)
				dragonLost();

			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
			String final_score = "Player health : " + playerHealth 
					+ "\nDragon health : " + dragonHealth; 
			//JOptionPane.showMessageDialog(null, final_score);
			

			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			final_score += "\n\nPlayer points lost: " + lost_points
					+ "\nDragon points lost: " + playerAttack
					+ "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
					+ "\nDragon Attack points: " + dragonAttack
					+ "\nPlayer Attack points: " + playerAttack
					+ "\nShield defense: " + shieldDefense + shield_str;
			JOptionPane.showMessageDialog(null, final_score);
			
			shieldDefense = 0;
			shield_str = "";
			
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		String player_lost = "You have been defeated by the dragon and have no treasure!";
		JOptionPane.showMessageDialog(null,player_lost);

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		String dragon_lost = "The dragon has been defeated and you get a ton of gold!";
		JOptionPane.showMessageDialog(null,dragon_lost);
		System.exit(0);   //This code ends the program
	}

}
