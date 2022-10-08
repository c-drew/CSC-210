// Write a program that asks the user to enter three numbers. Compute the average of the numbers and display the result.

import java.util.Scanner; // import the Scanner class

public class ThreeNumbers 
{

	public static void main(String[] args) 
	{
		double num1, num2, num3;
		Scanner scan = new Scanner(System.in); // declaring Scanner object
		
		System.out.println("This program asks for three numbers, computes the average of all three, and displays the result.\n");
		
		System.out.print("Enter your first number: ");
		num1 = scan.nextDouble();
		System.out.print("\nEnter your second number: ");
		num2 = scan.nextDouble();
		System.out.print("\nEnter your third number: ");
		num3 = scan.nextDouble();
		
		System.out.printf("\nThe average of your numbers is: %.3f", (num1 + num2 + num3)/3);

	}

}
