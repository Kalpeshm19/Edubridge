package string;

public class Example8 {
	
	    public static void referenceCheck(Object x, Object y) {  
	        if (x == y) {  
	            System.out.println("Both pointing to the same reference");  
	   
	        } else {  
	            System.out.println("Both are pointing to different reference");  
	        }  
	    }  
	    public static void main(String[] args) {  
	        String str1 = "Java";  
	        String str2 = "Java";  
	        System.out.println("Before Modification in st1");  
	        referenceCheck(str1, str2);  
	        str1 += "ava";  
	        System.out.println("After Modification");  
	        referenceCheck(str1, str2);  
	    }  
	 


}
