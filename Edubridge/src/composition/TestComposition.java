package composition;
import java.util.Scanner;

public class TestComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address=new Address("bangalore","karnataka","india");
		//10000
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee("harish",345,address);//10000
	System.out.println(employee);//toString()
	System.out.println("Enter the size::");
	int size=scanner.nextInt();
	Employee[] employeeList=new Employee[size];
	for(int i=0;i<employeeList.length;i++)
	{
		String name,city,state,country;
		int eid;
		System.out.println("name,id,city,state,country");
		name=scanner.next();
		eid=scanner.nextInt();
		city=scanner.next();
		state=scanner.next();
		country=scanner.next();
		Address add=new Address(city,state,country);
		employeeList[i]=new Employee(name,eid,add);
	}
	Department department = new Department(employeeList,"HR");
	System.out.println(department);
	}



	}


