package composition;

import java.util.Arrays;

public class Department {
	
	Employee[] employee;//member variable should be array type
	String dname;

	public Department(Employee[] employee, String dname) {
		super();
		this.employee = employee;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [employee=" + Arrays.toString(employee) + ", dname=" + dname + "]";
	}



}
