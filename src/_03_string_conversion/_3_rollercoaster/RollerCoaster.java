package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
		public static void main(String[] args) {
			
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
String  heightToRide=		JOptionPane.showInputDialog(null,"Please enter your height");
	
		// Uncomment the line below...
			//if( heightToRide > 42 ) { }
int  heightAsSint= Integer.parseInt(heightToRide);
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
	
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
	if(heightAsSint>=48) {
		JOptionPane.showMessageDialog(null,"HOORAY YOUR TALL ENOUGH");
	}	
	
	
	// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
		else if (heightAsSint>=42) {
		JOptionPane.showMessageDialog(null,"Hey Man You Can Ride With Some One  Else If You want :D");
		}
	
	
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
		else {
			JOptionPane.showMessageDialog(null,"Hey   man you have  to be at  least 4ourty 2wo  inches to ride");
		}
	
		

		
		
	
		}	
}