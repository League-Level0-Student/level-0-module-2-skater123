package _01_random._6_lottery_numbers;

import java.util.Random;

public class LotteryTicket {
	
	public static void main(String[] args)
	{
		
		//Generate 6 random numbers!
		Random r = new Random();
		
		int num1 = r.nextInt(10);
		int num2 = r.nextInt(10); // 0 - 9
		int num3 = r.nextInt(10); // 0 - 9
		int num4 = r.nextInt(10); // 0 - 9
		int num5 = r.nextInt(10); // 0 - 9
		int num6 = r.nextInt(10); // 0 - 9
		
		//Display 6 random numbers in a pop-up box
		System.out.println(""+ num1 + num2 + num3 + num4 + num5 + num6);
		
		
		/*
		 * We want to generate 6 single digit numbers and then concat them together.
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
		
		//Bonus set the title of the pop-up box.
	
	}


}