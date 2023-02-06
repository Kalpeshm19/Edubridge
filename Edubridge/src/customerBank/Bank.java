package customerBank;

import java.util.Arrays;



public class Bank {
	
	Customer[] customer;//member variable should be array type
	String dname;

	public Bank(Customer[] customer, String dname) {
		super();
		this.customer = customer;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [customer=" + Arrays.toString(customer) + ", dname=" + dname + "]";
	}



}
