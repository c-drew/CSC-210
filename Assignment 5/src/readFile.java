import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class readFile 
{

	public static void main(String[] args) throws IOException 
	{
		
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			int num = rand.nextInt(10) + 1;
			System.out.println("The following program will read from a specified read file and write the first 1-10 lines from it to a new file you name\n");

			System.out.print("Enter a .txt file you'd like to read from : ");
			String file1 = sc.nextLine();
			File readFile = new File(file1);
			Scanner inputFile = new Scanner(readFile);
			System.out.print("Enter a file name to write to : ");
			String file2 = sc.nextLine();
			PrintWriter outputFile = new PrintWriter(file2);
			
			int i = 1;
			while(inputFile.hasNext() && i <= num)
			{
				String line = inputFile.nextLine();
				outputFile.print(i + " : ");
				outputFile.println(line.toUpperCase());
				i++;
			}
			System.out.println("...done\n" + num + " lines were printed to " + file2);
			
			inputFile.close();
			outputFile.close();
			sc.close();
		
	}

	}
