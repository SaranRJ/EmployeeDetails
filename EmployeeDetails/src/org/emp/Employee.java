package org.emp;

public class Employee {

	public void empID() {
		System.out.println("The Employee Id : 1234");
	}

	public void empName() {
		System.out.println("The Employee Name : Saran");

	}

	public void empDob() {
		System.out.println("The Employee DOB : 14/01/1998");

	}

	public void empphone() {
		System.out.println("The Employee Phone : 9812763456");

	}

	public void empEmail() {
		System.out.println("The Employee Email : rj14@gmail.com");

	}

	public void empAddress() {
		System.out.println("The Employee Address : No:FON, Tambaram");

	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.empID();
		emp.empName();
		emp.empDob();
		emp.empphone();
		emp.empEmail();
		emp.empAddress();

	}

}
