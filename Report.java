import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
/** This class is used to generate reports.
*@author Team 2
*@since 5-11-21
*@version 1.0
*/
public class Report{
	public static final String filei="C:\\Users\\lenovo\\eclipse-workspace\\IssueReport.txt";
    public static final String filer="C:\\Users\\lenovo\\eclipse-workspace\\ReturnReport.txt";
    public static String date() {
    	LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }
	/** This method is used to write the issue details to a file.
	*@param email
	*@param isbn
	*@exception an exception
	*@see Exception 
	*@return no return type.
	*/
    public static void issue(String email,String isbn)throws Exception{
           
        
          
            Scanner scan = new Scanner(new File(filei));
            String[] s={};
            String rep="";
            String con="";
            String emp="";
            while(scan.hasNextLine()){
                emp=scan.nextLine();
                if(emp.split(",")[0].equals(email)){
                    rep=emp+","+isbn+"/"+date();
                    con=con+rep+"\n";
                }
                else{
                    con=con+emp+"\n";
                }
            }
            scan.close();
           // System.out.println(con);
            FileWriter f = new FileWriter(filei);
            f.write(con);
            f.close();
     }
    
    /**This method is used to show the return representation.
    *@param email.
    *@param isbn
    *@return no return type.
    *@exception an exception 
    *@see Exception.
    */
    public static void returnrep(String email,String isbn)throws Exception{
        Scanner scan = new Scanner(new File(filer));
        String rep="";
        String con="";
        String emp="";
        while(scan.hasNextLine()){
            emp=scan.nextLine();
            if(emp.split(",")[0].equals(email)){
                boolean b=valisbn(email,isbn,filei);
                boolean a=valisbn(email,isbn,filer);
                System.out.println(b);
                System.out.println(a);
                if(b&&(!a)){
                    rep=emp+","+isbn+"/"+date();
                    con=con+rep+"\n";
                    System.out.println("Book is returned...");	
                   // return true;
                }
                else{
                    System.out.println("book is not issued to return");
                    con=con+emp+"\n";
                  //  return false;
                }
            }
            else{
                con=con+emp+"\n";
              //  return false;
            }
        }
        scan.close();
        //System.out.println(con);
        FileWriter f = new FileWriter(filer);
        f.write(con);
        f.close();
    }
     /**This method is used to validate the isbn number.
     *@param email
     *@param isbn
     *@param file
     *@return returns a boolean value based on the validation of the isbn.
     *@exception exception 
     *@see exception.
     */
    public static boolean valisbn(String email,String isbn,String file)throws Exception{
        Scanner sc = new Scanner(new File(file));
        String t="";
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            if(s.split(",")[0].equals(email)){
                t=t+s;
                break;
            }
        }
        String[] iss=t.split(",");
        for(String temp:iss){
            if(temp.split("/")[0].equals(isbn)){
            	
                return true;
            }
        }
        return false;
    }
        /**This method is used to display the reports.
	*@param  file takes the file name as parameter which contains the details of issued and returned books.
	*@return no return type.
	*@exception an exception.
	*@see Exception.
	*/
   public static void report(String file)throws Exception {
			 String st="";
			 BufferedReader reader = new BufferedReader(new FileReader(file));
			 while ((st = reader.readLine()) != null) {
				 System.out.println(st);
			 }  
			 reader.close();
		 
   }
	/**This method is used to show the reports
	*@param no args used.
	*@return no return type.
	*@exception an exception.
	*@see Exception.
	*/
   public static void run()throws Exception{
	   System.out.println("1.full report\n2.report of a user");
	   Scanner s =new Scanner(System.in);
	   switch(Integer.parseInt(s.nextLine())) {
	   case 1:
		   System.out.println("\nUSERS ISSUE REPORT\n\n");
		   report(filei);
		   System.out.println("\nUSERS RETURN REPORT\n\n");
		   report(filer);
		   break;
	   case 2:
		   System.out.println("Enter email of the user");
		   Account.run(s.nextLine());
		   break;
		
	   }
   
   }
        
}        
        
        
        
        
        
        
        
    
        
        
       
        
        
        
        
        
     /***   //scan.useDelimiter("\n");
        String[] s={};
        String rep="";
        String empty="";
        while(scan.hasNext()) {
        	System.out.println(scan.next().split(",")[0]);
            if(scan.next().split(",")[0].equals(email)){
                empty=scan.next();
                s=empty.split(",");
                rep=isbn;
                Evaluation e = new Evaluation();
                int ind=e.e_val(email);
                BookTransactions.updateCSV(f,rep,ind);
            }
        }
       // System.out.println(s.length);
        scan.close();**/
       /** Evaluation ew=new Evaluation();
        int index=ew.e_val(email);
        System.out.println(index);
        
        
    	
    	//System.out.println("enter isbn no:");
        //String isbn1=s.next();
        String line1 = ""; 
        //String isbn="123-124";
        int r1=0;
       // int q1=0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while ((line1 = br.readLine()) != null){   
               // r1=r1+1;
                String[] report = line1.split(","); 
               
                String result = report[0];
                if(email.equals(result)){
                   
                	   BookTransactions.updateCSV(f,isbn,index);
                    }
                    
                r1+=1;
                }
              
            			
        }
        catch(Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }
    	
    	
    	
    	
    	
    }**/
  /***  public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        IssueReport i = new IssueReport();
        System.out.println("enter the email:");
        String email=sc.nextLine();
        System.out.println("enter the isbnno:");
        String isbn=sc.nextLine();
        i.issue(email, isbn);
        sc.close();
    }***/

