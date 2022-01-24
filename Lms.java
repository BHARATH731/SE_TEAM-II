import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

import com.opencsv.CSVWriter;
public class Lms{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.admin\n2.user");
		System.out.println("enter choice:");
		Scanner s =new Scanner(System.in);
		String f="C:\\Users\\lenovo\\eclipse-workspace\\Books.csv";
		int ch=s.nextInt();
		switch(ch){
			case 1:
				  System.out.println("1.add user\n2.add books\n3.view books\nenter option");
				  int choice=s.nextInt();
				  try {
					  switch(choice){
						  case 1:
							  Register r=new Register();
							  r.registerRun();
						      break;
						  case 2:
							  AddBooks add=new AddBooks();
						      add.addDataToCSV(f);
							  break;
							
						  case 3:
							  ViewBooks.display(f);
							  break;
							  
							  
						  default:
							  System.exit(0);
							  // case 5:
							  //  SearchBook.Search();
						}
				    }catch(Exception e){
					  e.printStackTrace();
                    }
                    break;
			case 2:
				  try {
                    Login l=new Login();
                    String log=l.loginRun();
                    while(log!="") {
                        System.out.println("1.Search\n2.Issue a book\n3.Return\n4.Feeback\nenter choice");
                        // String c=s.next();
                        s.reset();
                        switch(Integer.parseInt(s.next())) {
	                        case 1:
	                            SearchBook.Search();
	                            break;
	                        case 2:
	                            System.out.println("enter isbn no:");
	                            String isbn1=s.next();
	                            String line1 = ""; 
	                            //String isbn="123-124";
	                            int r1=0;
	                            int q1=0;
	                            try {
	                                BufferedReader br = new BufferedReader(new FileReader(f));
	                                while ((line1 = br.readLine()) != null){   
	                                    r1=r1+1;
	                                    String[] Book = line1.split(","); 
	                                    //System.out.println(Book[1]);
	                                    //System.out.println(isbn1);
	                                    String result = Book[1].replaceAll("^\"|\"$", "");
	                                   // System.out.println(result);
	                                    if(isbn1.equals(result)){
	                                        //System.out.println("Book is available");
	                                        q1=Integer.parseInt(Book[4].replaceAll("^\"|\"$", ""));
	                                        if(q1>0) {
		                                        String n1=Integer.toString(q1-1);
		    	                                //String m1=Integer.toString(q1+1);
		    	                                //System.out.println(n1);
		    	                                BookTransactions.updateCSV(f,n1,r1-1,4);
		    	                               // System.out.println("login email" +log);
		    	                                Report.issue(log,result);
		    	                                //BookTransactions.updateCSV(f,"36",r-1,4);
		    	                                System.out.println("book is issued\nbook should be returned within 14 days starting from today");
	                                        }
	                                        else {
		                                    	System.out.println("book was ran out of stock");
		                                    	break;
	                                        }
	                                    }
	                                  /***  else {
	                                    	System.out.println("book is not available");
	                                    	
	                                    }**/
	                                }			
	                            }
	                            catch(Exception e) {
	                                //e.printStackTrace();
	                                System.out.println(e);
	                            }
	                            break;
	                        case 3:
	                            System.out.println("enter isbn no:");
	                            String isbn=s.next();	
	                            String line = "";  
	                            //String isbn="123-124";
	                            int r=0;
	                            int q=0;
	                            try{  
	                                //String f="C:\\Users\\lenovo\\eclipse-workspace\\BooksInfo.csv";
	                                BufferedReader br = new BufferedReader(new FileReader(f));  
	                                while ((line = br.readLine()) != null)    
	                                {   
	                                    r=r+1;
	                                    String[] Book = line.split(","); 
	                                    //System.out.println(Book[1]);
	                                    //System.out.println(isbn);
	                                    String result = Book[1]. replaceAll("^\"|\"$", "");
	                                    if(isbn.equals(result)){
	                                        //System.out.println("Book is available");
	                                        q=Integer.parseInt(Book[4]. replaceAll("^\"|\"$", ""));
	                                        break;
	                                    }			
	                                }
	                                String n=Integer.toString(q-1);
	                                String m=Integer.toString(q+1);
	                                //System.out.println(n);
	                                BookTransactions.updateCSV(f,m,r-1,4);
	                                Report.returnrep(log, isbn);
	                               
	                                
	                            }
	                            catch(Exception e) {
	                                e.printStackTrace();
	                            }
	                            break;  
	                        case 4:
	                        	System.out.println("enter feedback");
	                        	//String feedback=s.next();
	                        	Feedback.run();
                       }
                    }
				  }catch(Exception e) {
                            //e.printStackTrace();
                            System.out.println(e);
                  }
                  break;
            
        }
    }
}