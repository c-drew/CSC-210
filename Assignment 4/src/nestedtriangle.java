
public class nestedtriangle {

	public static void main(String[] args) {
		
		System.out.println("This program prints a 10x10 right triangle.\n");
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j < i) {
				System.out.print(" ");
				}
				else 
				System.out.print("*");
		}
		System.out.println();
		}
		
	}

}
