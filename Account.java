import java.util.Scanner;
import java.io.*;
/** This class is used to maintain the account.
*@author Team 2
*@since 5-11-21
*@version 1.0
*/
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
	 /**This method is used to print the issue and return details of a particular user.
	 *@return no return type
	 *@param email
	 *@exception an exception
	 *@see Exception
	 */
	public static void run(String email)throws Exception {
		System.out.println("issued books");
		display(email,filei);
		System.out.println("returned books");
		display(email,filer);
	}
}
