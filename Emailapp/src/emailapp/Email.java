package emailapp;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Email {

	Scanner sc=new Scanner(System.in);
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String department;
	private int mailBoxCapacity=500;
	private int defaultpasswordLength=10;
	private String alternateEmail;
	private String companySuffix="company.com";

	
	public Email() {}
	public Email(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
		System.out.println("New Employee::"+fname+" "+lname);
		
		
		System.out.println("-------------------------------");
		//call the method to return the department
		this.department=setDepartment();
		System.out.println("Department::"+department);
		
		System.out.println("-------------------------------");
		//call the method for return random  password
		
		this.password=randomPassword(defaultpasswordLength);
		System.out.println("Password is::"+password);
		
		
		
		System.out.println("-------------------------------");
		//combine element to generate email
		
		email=fname.toLowerCase()+"."+lname.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your company Email is::"+email);
		
	}
	
	
	


	


	private String setDepartment() {
		
		System.out.println("Department codes:\n 1 for Sales\n 2 for Developement\n 3 for Accounting\n 0 for none\n Enter Department Codes::");
		int choiceDept=sc.nextInt();
		
		if(choiceDept==1) {
			return "Sales";
			}else if(choiceDept==2) {
				return "Developement";
			}else if(choiceDept==3) {
				return "Accounting";
			}else if(choiceDept==0) {
				return "none";
			}else {
				System.out.println("Invalid choice");
			}
			
		return null;
	}
	
	//to create random password
	private String randomPassword(int length) {
		
		String passSet="ABCDEFGHIJKLMNOPQRSTUVWXZ0123456789@&#";
		char[] password=new char[length];
		
		for(int i=0;i<length;i++) {
			
			int ran=(int) (Math.random()*passSet.length());
			password[i]=passSet.charAt(ran);
		}
		return new String(password);
	}

	


	 // Set the mailbox capacity
    public void set_mailCap() {
        System.out.println("Current capacity = " + this.mailBoxCapacity + "mb");
        System.out.print("Enter new capacity: ");
        this.mailBoxCapacity = sc.nextInt();
        System.out.println("MAILBOX CAPACITY CHANGED SUCCESSFULLY!");

    }
	//to change password
	
			//public void changePassword(String email,String newPassword) {
			//	this.alternateEmail = email;
			//	this.password=newPassword;
			//}
		
			 // Change the password
		    public void set_password() {
		        boolean flag = false;
		        do {
		            System.out.print("ARE YOU SURE YOU WANT TO CHANGE YOUR PASSWORD? (Y/N) : ");
		            String choice = sc.next();
		            if (choice.equalsIgnoreCase("yes")) {
		                flag = true;
		                System.out.print("Enter current password: ");
		                String temp = sc.next();
		                if (temp.equals(this.password)) {
		                    System.out.println("Enter new password: ");
		                    this.password = sc.next();
		                    System.out.println("PASSWORD CHANGED SUCCESSFULLY!");
		                } else {
		                    System.out.println("Incorrect Password!");
		                }
		            } else if (choice.equalsIgnoreCase("no")) {
		                flag = true;
		                System.out.println("PASSWORD CHANGE CANCELED!");
		            } else {
		                System.out.println("**ENTER A VALID CHOICE**");
		            }
		        } while (!flag);
		    }

			
		//to display details
		    public void getInfo() {
		        System.out.println("NAME: " + this.fname + " " + this.lname);
		        System.out.println("DEPARTMENT: " + this.department);
		        System.out.println("EMAIL: " + this.email);
		        System.out.println("PASSWORD: " + this.password);
		        System.out.println("MAILBOX CAPACITY: " + this.mailBoxCapacity + "mb");
		        System.out.println("ALTER EMAIL: " + this.alternateEmail);
		    }
	
	//to set alternateemail
	
	public void setAlternateEmail() {
		
		System.out.println("Enter your alternate email address::");
		
		this.alternateEmail = sc.next();
		System.out.println("Ulternate email added succefully");
	}
	
	//to store in the file
	public void storeFile() throws IOException {
	FileWriter fw=new FileWriter("Info.txt",true);
	fw.append("First Name:"+this.fname +"\n");
	fw.append("Last Name:"+this.lname+"\n");
	fw.append("Password::"+this.password+"\n");
	fw.append("Capacity::"+this.mailBoxCapacity+"\n");
	fw.append("AlternateEmail::"+this.alternateEmail+"\n\n");
	
	fw.close();
	
	System.out.println("Data Stored");
	}
	
	//to read file
	
	public void readFile() throws IOException {
		
		FileReader fr=new FileReader("Info.txt");
		
		
		int res=0;
		do {
		res = fr.read();//returns -1 if it reaches end of the file
		System.out.print((char)res);
		}while(res!=-1);//? asscii value is -1
		
		fr.close();
		
		System.out.println();
	}
	
	
	public static boolean searchByName(String filename,String searchName)throws FileNotFoundException {
		
		Scanner sc=new Scanner (new File("Info.txt"));
		while(sc.hasNext()) {
			String next=sc.next();
			
			if(next.contains(searchName)) {
				return true;
			}
		}
		return false;
	}
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	
	
	
	
}
	
	
