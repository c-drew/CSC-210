
public class Employee {
	
	private String employeeName;
	private int employeeID;
	private double hoursWorked;
	private double payRate;
	
	public void setEmployeeName(String name) {
		this.employeeName = name;
	}
	
	public void setEmployeeID(int ID) {
		this.employeeID = ID;
	}
	
	public void setHoursWorked(double hours) {
		this.hoursWorked = hours;
	}
	
	public void setPayRate(double rate) {
		this.payRate = rate;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public Employee(String name, int ID, double hours, double rate) {
		this.employeeName = name;
		this.employeeID = ID;
		this.hoursWorked = hours;
		this.payRate = rate;
	}
	
	public double computePay() {
		return hoursWorked * payRate;
	}
	
}
