import java.util.*;
public class User{
    public static void run(String f){
        Scanner z =new Scanner(System.in);
        try{
            System.out.println("\n\n*******************************USER****************************\n\n");
            String log=Login.loginRun();

            user : while(log!=null) {

                System.out.println("\n\n*******************************USER****************************\n\n");
                System.out.println("\n1.Search\n2.Issue a book\n3.Return\n4.account\n5.Feeback\n6.logout\nenter choice");
                
               // s.reset();
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
            }
        }catch(Exception e){
            e.printStackTrace();
        }
							   
    }
    // public static void main(String[] args){
    //     User.run();
    // }
}