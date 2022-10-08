/* Write a program that asks the user to enter the number of hours worked and the hourly pay
rate. Compute the total pay.

Note: If the number of hours worked is greater than 40, then there is also an overtime pay
of 1.5 times the number of hours worked above 40 (For example, if the number of hours
worked is 45, overtime pay = 5 * 1.5 * pay rate). 

Then, the total pay will be the sum of the pay for 40 hours plus the overtime pay */

import java.util.Scanner;

public class TotalPay 
{

	public static void main(String[] args)
	{
		double hours, rate, othours, otrate;
				
		System.out.println("This program asks the user to enter number of hours worked and hourly pay rate and computes the total pay.\n");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of hours worked: ");
		hours = scan.nextDouble();
		
		System.out.print("\nEnter hourly pay rate: ");
		rate = scan.nextDouble();
		
		if (hours > 40) {
			othours = hours - 40;
			otrate = rate * 1.5;
			hours = 40;
			System.out.printf("\nYour total pay is: $%.2f", (hours * rate) + (othours * otrate));
		}
		else
			System.out.printf("\nYour total pay is: $%.2f", (hours * rate));
	
	}

}
