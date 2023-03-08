package emailapp;
import java.io.IOException;
import java.util.Scanner;


public class EmailApp {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String option;
        
      
        System.out.println("--------------------Welcome---------------------- ");
        System.out.println();
        System.out.println("Enter First Name:");
        String f_name = sc.next();
        System.out.println("Enter Last Name:");
        String l_name = sc.next();
        
        // Creating a new employee (i.e. an object of the Email class)
        Email em1 = new Email(f_name, l_name);
        
         int choice = -1;
        do {
           // System.out.println("\n**********\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password"
                    //+ "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Store data in file\n6.Show file\n7.Exit");
            System.out.println("1.Show Info");
            System.out.println();
            System.out.println("2.Change password");
            System.out.println();
            System.out.println("3.Change MailBox Capacity");
            System.out.println();
            System.out.println("4.Set Alternate Email");
            System.out.println();
            System.out.println("5.Store data in file");
            System.out.println();
            System.out.println("6.Show File");
            System.out.println();
            System.out.println("7.Do you want to search in file??");
            System.out.println();
            System.out.println("8.Continue");
        	System.out.println("*****************************");
            System.out.println("Enter Your Choice::");
        	
        	
        	choice = sc.nextInt();
           
            switch(choice) {
                case 1:
                    em1.getInfo();
                    break;
                case 2:
                    em1.set_password();
                    break;
                case 3:
                    em1.set_mailCap();
                    break;
                case 4:
                    em1.setAlternateEmail();
                    break;
                case 5:
                    em1.storeFile();
                    break;
                case 6:
                    em1.readFile();
                    break;
                    
                case 7:
                	String filename = "Info.txt";
                	String searchName;
                	System.out.println("Enter name you want to search in file::");
                	searchName=sc.next();
                	if (Email.searchByName(filename, searchName)) {
                	    System.out.println("Name is find: " + searchName);
                	} else {
                	    System.out.println("Name not found: " + searchName);
                	}
                	break;
                case 8:
                    System.out.println("Do you want to add another employee");
                    break;
                default:
                    System.out.println("INVALID CHOICE! ENTER AGAIN!");
            }

        }while(choice!=8);
        
       System.out.println("(y/n)");
        option=sc.next();
        
        if(option.equalsIgnoreCase("y")) {
        	EmailApp.main(args);
        }
        else {
        	System.exit(1);
        }
      }
      
    

}