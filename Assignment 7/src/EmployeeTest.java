
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Drew", 1, 36.5, 19);
		Employee emp2 = new Employee("Nathan", 2, 40, 19);
		Employee emp3 = new Employee("Erin", 3, 36.25, 21);
		Employee emp4 = new Employee("Madison", 4, 17.5, 38);
		Employee emp5 = new Employee("Sophie", 5, 17, 30);
		
		System.out.print(emp1.getEmployeeName() + "\t");
		System.out.print(emp1.getEmployeeID() + "\t");
		System.out.print(emp1.getHoursWorked() + "\t");
		System.out.print(emp1.getPayRate() + "\t");
		System.out.print(emp1.computePay() + "\n");
		
		System.out.print(emp2.getEmployeeName() + "\t");
		System.out.print(emp2.getEmployeeID() + "\t");
		System.out.print(emp2.getHoursWorked() + "\t");
		System.out.print(emp2.getPayRate() + "\t");
		System.out.print(emp2.computePay() + "\n");
		
		System.out.print(emp3.getEmployeeName() + "\t");
		System.out.print(emp3.getEmployeeID() + "\t");
		System.out.print(emp3.getHoursWorked() + "\t");
		System.out.print(emp3.getPayRate() + "\t");
		System.out.print(emp3.computePay() + "\n");
		
		System.out.print(emp4.getEmployeeName() + "\t");
		System.out.print(emp4.getEmployeeID() + "\t");
		System.out.print(emp4.getHoursWorked() + "\t");
		System.out.print(emp4.getPayRate() + "\t");
		System.out.print(emp4.computePay() + "\n");
		
		System.out.print(emp5.getEmployeeName() + "\t");
		System.out.print(emp5.getEmployeeID() + "\t");
		System.out.print(emp5.getHoursWorked() + "\t");
		System.out.print(emp5.getPayRate() + "\t");
		System.out.print(emp5.computePay() + "\n");
		
		
	}

	
}
