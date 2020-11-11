//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {

		// 2. Get the user to enter a question for the 8 ball to answer

		JOptionPane.showMessageDialog(null, "So hows your day goin");
		int randomNumber;
		// 3. Make a variable and initialize it to a random number.
		Random r = new Random();
		// ** You will need to make a random object!
		randomNumber = r.nextInt(4);
		// Limit the random numbers to be between 0 and 3

		// 4. If the random number is 0
		if (randomNumber == 0) {
			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "yes");
		}
		// 5. If the random number is 1
		else if (randomNumber == 1) {
			// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "no");
		}
		// 6. If the random number is 2
		else if (randomNumber == 2) {
			// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "maybe you should ask google ");
		}
		// 7. If the random number is 3
		else if (randomNumber == 3) {
			// -- write your own answer
			JOptionPane.showMessageDialog(null, "have an amazing day u r da man3");

		}

	}

}
