package neha.java.concepts;

import java.util.Scanner;

public class inputFromUserExample{
public static void main(String args[]){
	
	String Username;
	// Example of String Input
	System.out.println("Enter your Name");
	Scanner scan=new Scanner(System.in);
	Username=scan.next();  // or u can write Username=scan.nextLine();
	   System.out.println("Name Accepted   "+ Username);

	   
	// Example of Int Input
	   int age;
	   System.out.println("Enter your age");
	   age=scan.nextInt();
	   System.out.println("Age Accepted "+age);
	   
	 
	// Example of Double Input
	   Double abc;
	   System.out.println("Enter any no in double");
	   abc=scan.nextDouble();
	   System.out.println("double no. is "+abc);
	   

}
}