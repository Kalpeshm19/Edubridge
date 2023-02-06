package customerBank;



public class Customer {
	
	private String name;//instance ref variable
	private int account_no;//instance variable
	private Address address;//instance ref variable 10000


	


	public Customer(String name, int account_no, Address address) {
		super();
		this.name = name;
		this.account_no = account_no;
		this.address = address;
	}





	@Override
	public String toString() {
		return "Customer [name=" + name + ", account_no=" + account_no + ", address=" + address + "]";
	}

}
