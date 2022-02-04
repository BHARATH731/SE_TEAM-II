import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

//import com.opencsv.CSVWriter;
public class Lms{

	public static void main(String[] args)throws Exception {
		final String f= "C:\\Users\\lenovo\\eclipse-workspace\\Books.csv";
		final String f1="C:\\Users\\lenovo\\eclipse-workspace\\register.txt";
		
		System.out.println("\033[H\033[2J");
        System.out.flush();
		 System.out.println("\n\n                           WELCOME                              ");
		//int ch=s.nextInt();
		while(true) {
			Scanner s =new Scanner(System.in);
			System.out.println("\n\n******************************LMS*****************************\n");
			System.out.println("1.admin\n2.user\n3.exit");
			System.out.println("enter choice:");
			s.reset();
			//Scanner s =new Scanner(System.in);
			int ch=Integer.parseInt(s.nextLine());
			System.out.println("\033[H\033[2J");
            System.out.flush();
				switch(ch){
					case 1:
						/**System.out.println("\033[H\033[2J");
		                System.out.flush();**/
						
						admin:
						while(true) {
							// String choice=null;
						  System.out.println("\n*****************************ADMIN****************************\n");
						  System.out.println("\n1.add user\n2.add books\n3.view books\n4.view users\n5.view feedback\n6.Report\n7.logout\nenter option");
						  //s.reset();
						//   int choice=s.nextInt();
						int choice = Integer.parseInt(s.nextLine());
						//   try{
						// 	   choice=System.console().readLine();
						//   }catch(Exception e){

						//   }
						  System.out.println("\033[H\033[2J");
                          System.out.flush();
						 // s.reset();
						  try {
							//   switch(Integer.parseInt(choice)){
								switch(choice){
								  case 1:
								      
									  System.out.println("\n\n\n******************************REGISTER*****************************\n\n\n");
									  Register r=new Register();
									  r.run();
									  s.reset();
								      break;
								  case 2:
								      
									  System.out.println("\n\n\n*******************************BOOKS*************************\n\n");
								      AddBooks.run();
								      //s.reset();
									  break;
									
								  case 3:
								     
									  System.out.println("\n\n\n*****************************CATALOGUE*****************************\n\n");
									  ViewBooks.display(f);
									  //View.run(f);
									  break;
								  case 4:
									  //user display
									 
									  System.out.println("\n\n\n******************************USERS***************************\n\n");
									  DisplayUsers.display();
									  //View.run(f1);
									  break;
								  case 5:
								     
									  System.out.println("\n\n\n*****************************FEEDBACK****************************\n\n");
									  Feedback.displayfeedback();
									  break;
								  case 6:
									  //report
									  
									  System.out.println("\n\n\n*****************************TRANSACTION REPORT***********************\n\n");
									  Report.run();
									  break;
								  case 7:
								      
									  System.out.println("\n\n***********************************************************\n\n");
									  System.out.println("logging out as admin\n");
									  break admin;
								  default:
								      
									  System.out.println("enter a valid choice");
									  //System.exit(0);
									 // break;
									  continue;
								}
						    }catch(Exception e){
							  e.printStackTrace();
		                    }
		                	s.reset();
						}
						//s.close();
						break;
					case 2:
					      User.run(f);
						 // z.close();
		                  break;
					case 3:
						System.out.println("\n\n*******************************THANK YOU FOR USING LMS****************************\n\n");
						System.out.println("\n*******************************EXIT******************************\n");
						System.exit(0);
					default:
						System.out.println("enter valid choice");
		               
		        }
			//s.close();
		}
		
	
    }
}