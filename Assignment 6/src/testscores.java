
public class testscores {

	public static void main(String[] args) {
		
		String[] stuNames = {"Drew", "Joe", "Tim", "Greg", "Mark"};
		
		int[][] stuTests = 		{	{99, 80, 78, 97, 60}, 
									{98, 87, 82, 90, 56},
									{96, 83, 77, 91, 62},
									{100, 88, 78, 87, 60}
								};
		double[] stuTotal = new double[5];
		
		char[] letterGrades = {'A', 'B', 'C', 'D', 'F'};
		char[] stuGrades = new char[5];
		
		for (int i = 0; i < stuTests.length; i++) {
			for (int j = 0; j < stuTests[i].length; j++) {
				stuTotal[j] += (stuTests[i][j]);
			}
		}
		
		for (int k = 0; k < stuTotal.length; k++) {
			if ((stuTotal[k]/stuTests.length >= 90.0) && (stuTotal[k]/stuTests.length <= 100.0))
				stuGrades[k] = letterGrades[0];
			if ((stuTotal[k]/stuTests.length >= 80.0) && (stuTotal[k]/stuTests.length < 90.0))
				stuGrades[k] = letterGrades[1];
			if ((stuTotal[k]/stuTests.length >= 70.0) && (stuTotal[k]/stuTests.length < 80.0))
				stuGrades[k] = letterGrades[2];
			if ((stuTotal[k]/stuTests.length >= 60.0) && (stuTotal[k]/stuTests.length < 70.0))
				stuGrades[k] = letterGrades[3];
			if (stuTotal[k]/stuTests.length < 60.0)
				stuGrades[k] = letterGrades[4];
			
			System.out.println(stuNames[k] + "\t" + stuGrades[k]);
		}
	}
}
