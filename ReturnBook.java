import java.io.BufferedReader;
import java.io.FileReader;

public class ReturnBook extends BookTransactions {
	
	public static void returnBook(String filepath,String loginmail,String isbn) {
		String line = "";  
        //String isbn="123-124";
        int r=0;
        int q=0;
        try{  
            //String f="C:\\Users\\lenovo\\eclipse-workspace\\BooksInfo.csv";
            BufferedReader br = new BufferedReader(new FileReader(filepath));  
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
            updateCSV(filepath,m,r-1,4);
            Report.returnrep(loginmail, isbn);
           
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
	}
	
}
