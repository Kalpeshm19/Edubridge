package customerBank;

import java.util.Scanner;



public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address=new Address("jalgaon","maharashtra","india");
		
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer("yash",345,address);

		System.out.println(customer);//toString()
		System.out.println("Enter the size::");
		int size=scanner.nextInt();
		Customer[] customerList=new Customer[size];
		for(int i=0;i<customerList.length;i++)
		{
			String name,city,state,country;
			int account_no;
			System.out.println("name,account_no,city,state,country");
			name=scanner.next();
			account_no=scanner.nextInt();
			city=scanner.next();
			state=scanner.next();
			country=scanner.next();
			Address add=new Address(city,state,country);
			customerList[i]=new Customer(name,account_no,add);
		}
		Bank bank = new Bank(customerList,"EducationAccount");
		System.out.println(bank);
		}
	

}
