package composition;

public class Employee {

	private String name;//instance ref variable
	private int empId;//instance variable
	private Address address;//instance ref variable 10000

	public Employee(String name, int empId, Address address)//10000
	{
		super();
		this.name = name;
		this.empId = empId;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", address=" + address + "]";
	}


	
	
}
