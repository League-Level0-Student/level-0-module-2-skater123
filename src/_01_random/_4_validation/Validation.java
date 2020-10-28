//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		// 2. Repeat all the code above 10 times
		for(int i = 0; i<10; i++) {
		
			Random randomMaker = new Random();
			
			int randomNumber = randomMaker.nextInt(5);
			
			System.out.println(randomNumber);
	
			// 1. Use each value of randomNumber to give the user a random compliment.
			if (randomNumber == 0) {
				
				JOptionPane.showMessageDialog(null,"I like your shoes");
				
			} else if (randomNumber == 1) {
				
				//when randomNumber == 2
				JOptionPane.showMessageDialog(null,"dang that t shirt is fresh");
				
				
			 } else if(randomNumber == 2) {
				 
				 JOptionPane.showMessageDialog(null,"I like "
							+ "your hairline friend") ;
				 
			 } else  if(randomNumber == 3) {
				 
				 JOptionPane.showMessageDialog(null,"u r my best  friend");
				 
			 } else  if(randomNumber == 4) {
				 
				 JOptionPane.showMessageDialog(null,"ur shoes r sooo cool");
			 }
		}
		
		
 
		// 3. Find someone to test out your program. They will like it :)
	}
}




































































