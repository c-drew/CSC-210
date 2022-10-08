/* Write a program that uses an input validation loop to verify whether the user enters a
positive integer value. */

import java.util.Scanner;

public class PositiveVerification {
	
	public static void main(String[] args) {
		System.out.println("This program uses an input validation loop " + 
			"to verify whether the user enters a positive integer value\n");
		
		System.out.println("Enter a positive integer value: \n");
		
		Scanner sc = new Scanner(System.in);
	
		int i = sc.nextInt();
				
		while (i < 0) {
			System.out.println("This integer is negative.");
			System.out.println("Enter a positive integer value: \n");
			i = sc.nextInt();
		}
		sc.close();
		System.out.println(i + " is a positive  integer!");
		
	}
}
