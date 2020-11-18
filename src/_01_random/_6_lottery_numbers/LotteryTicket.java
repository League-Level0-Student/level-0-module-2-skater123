package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTicket {
	
	public static void main(String[] args)
	{
		
		//Generate 6 random numbers!
		Random r = new Random();
		
		//Variable declaration
		int num1 = r.nextInt(10);
		
		//int describes the type.
		//a variable can hold any integer number
		//-2147483648 to 2147483647 -> 2^32
		
		//Once you assign a number to an int variable
		//you can use that variable to represent the value.
		//int num1 = 2
		//int num2 = 4
		//num1 + num2 = 6
		
		//int num3 = r.nextInt(10);
		//int num4 = r.nextInt(10);
		//num3 + num4 = ? [0-18]
		
		int num2 = r.nextInt(10); // 0 - 9
		int num3 = r.nextInt(10); // 0 - 9
		int num4 = r.nextInt(10); // 0 - 9
		int num5 = r.nextInt(10); // 0 - 9
		int num6 = r.nextInt(10); // 0 - 9
		
		//Display 6 random numbers in a pop-up box
		System.out.println(""+ num1 + num2 + num3 + num4 + num5 + num6);
		
		//as string "3" + "2" = "32"
		//as integer 3 + 2 = 5
		
		//Bonus set the title of the pop-up box.
		//Output similar to "720461"
		//[7] num1,[2] num2,[0] num3,[4] num4,[6] num5,[1] num6
		//[4] num1,[3] num2,[3] num3,[4] num4,[4] num5,[9] num6
		JOptionPane.showMessageDialog(null, "" + num1 + num2 + num3 + num4 + num5 + num6, "6 Random Numbers", 1);
		
		/*
		 * We want to generate 6 single digit numbers and then contact them together.
		 * 
		 * 0-9 -> Single digit {1}
		 * 0-10 -> Two digit {2} -> 5 numbers that could be two digits.
		 * 
		 * num1 = 8
		 * num2 = 10
		 * num3 = 11
		 * num4 = 12
		 * num4 = 13
		 * num5 = 14
		 * 
		 * Concat int vars
		 * 
		 * 81011121314 -> 11 digits max
		 * Could also be 6 digits min
		 * WH
		 * We need 6 digits
		 * 
		 * 
		 */
	}
}