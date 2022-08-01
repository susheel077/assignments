package week2;

public class EmployeeDetails {
	public void printEmployeeName(String name) {
		System.out.println(name);
	}
	public void printEmployeeAddress(String Address) {
		System.out.println(Address);
	}
	public void printEmployeeId(int id) {
		System.out.println(id);
	}
	public void printEmployeePhoneNumber(long number) {
	System.out.println(number);
	}
	public void printEmployeeSalary( double Salary) {
		System.out.println(Salary);
	}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.printEmployeeName("Susheel");
		emp.printEmployeeAddress("Chennai");
		emp.printEmployeeId(25464);
		emp.printEmployeePhoneNumber(9254245245l);
		emp.printEmployeeSalary(25665.25);
	}
	}


