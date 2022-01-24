import java.io.*;
import java.util.*;
public class Report{
	public static final String filei="C:\\Users\\lenovo\\eclipse-workspace\\IssueReport.txt";
    public static final String filer="C:\\Users\\lenovo\\eclipse-workspace\\ReturnReport.txt";
	
    public static void issue(String email,String isbn)throws Exception{
 
        
      //  public void issue(String email,String isbn)throws Exception{
            Scanner scan = new Scanner(new File(filei));
            String[] s={};
            String rep="";
            String con="";
            String emp="";
            while(scan.hasNextLine()){
                emp=scan.nextLine();
                if(emp.split(",")[0].equals(email)){
                    rep=emp+","+isbn;
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
               // System.out.println(b);
                if(b&&(!a)){
                    rep=emp+","+isbn;
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
            //System.out.println(temp);
            if(temp.equals(isbn)){
                return true;
            }
        }
        return false;
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
}