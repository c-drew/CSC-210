
public class twentynattynumbers {

	public static void main(String[] args) {
		
		System.out.println("This program computes the sum of the first 20 natural numbers \n"
				+  "and computes the sum of the even numbers and odd numbers in these 20 natural numbers.\n");
		
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		for (int i = 1; i <= 20; i++) {
			
			if (i % 2 == 0) {
				evensum += i;
			}
			else
				oddsum += i;
			
			sum += i;
		}
		
		System.out.println("The sum of the first 20 natural odd numbers is: " + oddsum);
		System.out.println("The sum of the first 20 natural even numbers is: " + evensum);
		System.out.println("The sum of the first 20 natural numbers is: " + sum);
	}

}
