import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

//import com.opencsv.CSVWriter;
public class Lms{

	public static void main(String[] args)throws Exception {
		final String f= "C:\\Users\\lenovo\\eclipse-workspace\\Books.csv";
		Scanner s =new Scanner(System.in);
		System.out.println("\033[H\033[2J");
        System.out.flush();
		 System.out.println("\n\n                           WELCOME                              ");
		//int ch=s.nextInt();
		while(true) {
			
			System.out.println("\n\n******************************LMS*****************************\n");
			System.out.println("1.admin\n2.user\n3.exit");
			System.out.println("enter choice:");
			//Scanner s =new Scanner(System.in);
			int ch=s.nextInt();
			System.out.println("\033[H\033[2J");
            System.out.flush();
				switch(ch){
					case 1:
						/**System.out.println("\033[H\033[2J");
		                System.out.flush();**/
						
						admin:while(true) {
							String choice=null;
						  System.out.println("\n*****************************ADMIN****************************\n");
						  System.out.println("\n1.add user\n2.add books\n3.view books\n4.view users\n5.view feedback\n6.Report\n7.logout\nenter option");
						  //s.reset();
						  //int choice=s.nextInt();
						  try{
							   choice=System.console().readLine();
						  }catch(Exception e){

						  }
						  System.out.println("\033[H\033[2J");
                          System.out.flush();
						  s.reset();
						  try {
							  switch(Integer.parseInt(choice)){
								  case 1:
								      
									  System.out.println("\n\n\n******************************REGISTER*****************************\n\n\n");
									  Register r=new Register();
									  r.run();
								      break;
								  case 2:
								      
									  System.out.println("\n\n\n*******************************BOOKS*************************\n\n");
								      AddBooks.run();
								      //s.reset();
									  break;
									
								  case 3:
								     
									  System.out.println("\n\n\n*****************************CATALOGUE*****************************\n\n");
									  ViewBooks.display(f);
									  break;
								  case 4:
									  //user display
									 
									  System.out.println("\n\n\n******************************USERS***************************\n\n");
									  DisplayUsers.display();
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
		                	//s.reset();
						}
						
						break;
					case 2:
						  try {
							Scanner z =new Scanner(System.in);
							
							System.out.println("\n\n*******************************USER****************************\n\n");
		                    String log=Login.loginRun();
							
		                  user : while(log!=null) {
							
		                	    System.out.println("\n\n*******************************USER****************************\n\n");
		                        System.out.println("\n1.Search\n2.Issue a book\n3.Return\n4.account\n5.Feeback\n6.logout\nenter choice");
								
		                        s.reset();
		                        // String c=s.nextLine();
		                        int check;
		                       // s.reset();
							    String c=z.nextLine();
								System.out.println("\033[H\033[2J");
                                System.out.flush();
		                        switch(Integer.parseInt(c)) {
		                            
			                        case 1:
									   
			                        	System.out.println("\n\n\n*******************************SEARCH***************************\n\n");
			                            SearchBook.Search();
			                            break;
			                        case 2:
									   
			                        	System.out.println("\n\n\n*******************************ISSUE****************************\n\n");
			                            System.out.println("enter isbn no:");
										z.reset();
			                            String isbn1=z.nextLine();
			                            int i=IssueBook.issue(f, log, isbn1);
			                            if(i==1){
			                            	System.out.println("Book is issued\nBook must be returned within 14 days starting from today");
			                            }else {
			                            	System.out.println("Book is not available");
			                            }
			                            break;
			                        case 3:
									   
			                        	System.out.println("\n\n\n*******************************RETURN****************************\n\n");
			                            System.out.println("enter isbn no:");
										z.reset();
			                            String isbn=z.nextLine();	
			                            ReturnBook.returnBook(f,log, isbn);
			                            break;  
			                        case 4:
									  
			                        	System.out.println("\n\n\n*******************************ACCOUNT MAINTANENCE****************************\n\n");
			                        	//account maintanence
			                        	Account.run(log);
			                        	break;
			                        case 5:
									  
			                        	System.out.println("\n\n\n*******************************FEEDBACK****************************\n\n");
			                        	System.out.println("enter feedback");
			                        	//String feedback=s.nextLine();
			                        	Feedback.writeFeedback();
			                        	break;
			                        case 6:
			                              check=1;
										 
			                              System.out.println("\n\n***********************************************************\n\n");
				                          System.out.println("Logging out as user");
			                             break user;
			                        default:
									   
			                        	System.out.println("enter a valid choice");
		                       }
		                      /** if(check==1)
		                    	   
		                    	   System.out.println("\n\n***********************************************************\n\n");
		                           //System.out.println("Logging out as user");
		                    	   break user;
		                        
		                    }**/
		                    }
						  }catch(Exception e) {
		                            //e.printStackTrace();
		                            System.out.println(e);
		                  }
		                  break;
					case 3:
						System.out.println("\n\n*******************************THANK YOU FOR USING LMS****************************\n\n");
						System.out.println("\n*******************************EXIT******************************\n");
						System.exit(0);
					default:
						System.out.println("enter valid choice");
		               
		        }
		}	
    }
}