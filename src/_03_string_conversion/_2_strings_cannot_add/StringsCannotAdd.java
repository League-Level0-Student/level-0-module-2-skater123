package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {

		// 1) Make a main method that includes all the steps below…. 
		public static void main(String[] args) {
			
		
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
			String fourAsString= JOptionPane.showInputDialog(null,"Heyy u should type in the number four");
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			String sixAsString= JOptionPane.showInputDialog(null,"Hey You Should Type in the number 6 ");
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
		JOptionPane.showMessageDialog(null, fourAsString+sixAsString);
			// Did you notice 46 instead of 4 + 6 = 10?
			//yes I did the computer is not that smart
		
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			String fiveAsString= JOptionPane.showInputDialog(null,"hey you should type in the number 5");
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			JOptionPane.showMessageDialog(null,fourAsString+sixAsString+fiveAsString);
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			//Yes I did AGAIN:/  
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			int  fourAsSInt= Integer.parseInt(fourAsString);
			// 7) Do the same for sixAsString. 
			int sixAsSInt= Integer.parseInt(sixAsString);
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			JOptionPane.showMessageDialog(null,sixAsSInt+fourAsSInt);
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			//YES I DID
			JOptionPane.showMessageDialog(null,"HURRAY");
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			int fiveAsSInt= Integer.parseInt(fiveAsString);
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			JOptionPane.showMessageDialog(null,fourAsSInt+sixAsSInt+fiveAsSInt);
			// Is your value now 15 instead of 465?
		}}
