/* Write a program that uses a loop to display the Celsius temperatures 0 through 10 and their
Fahrenheit equivalents, as shown below: */


public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		System.out.println("Celsius\tFahrenheit\n");
		for (double i = 0; i <= 10; i++) {
			System.out.println(i + "\t" + (i*9/5 + 32));
		}
	}
	
}
