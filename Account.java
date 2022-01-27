import java.util.Scanner;
import java.io.*;
public class Account extends Report {
	 public static void display(String email,String filepath)throws Exception {
		 Scanner scan = new Scanner( new File(filepath));
	     String emp="";
	     while(scan.hasNextLine()){
	    	 emp=scan.nextLine();
	         if(emp.split(",")[0].equals(email)){
	                System.out.println(emp);
	          }
	      }
	      scan.close();
	}
	         
	     
	public static void run(String email)throws Exception {
		System.out.println("issued books");
		display(email,filei);
		System.out.println("returned books");
		display(email,filer);
	}
}
