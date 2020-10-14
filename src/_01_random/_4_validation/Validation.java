//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null,"I like your shoes");
			
		}
		// 2. Repeat all the code above 10 times
		 else if (randomNumber == 1){
			 JOptionPane.showMessageDialog(null,"I like ya cut g") ;{
		JOptionPane.showMessageDialog(null,"dang that t shirt is fresh");{
			JOptionPane.showMessageDialog(null,"U  have such a nice smile");{
				
			}
				 }
			 }
		 }
		// 3. Find someone to test out your program. They will like it :)
	}
}
