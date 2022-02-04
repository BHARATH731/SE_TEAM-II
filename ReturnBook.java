import java.io.BufferedReader;
import java.io.FileReader;
/**This class is used to provide the return functionality for the user.
*@author Team 2
*@version 1.0
*@since 2021-11-05
*/
public class ReturnBook extends BookTransactions {
	/**This method is used to update the book details and count of that specific book when returned.
	*@param filepath
	*@param loginmail
	*@param isbn
	*@return no return tyoe.
	*@exception no exception.
	*/
	public static void returnBook(String filepath,String loginmail,String isbn) {
		String line = ""; 
		//String result="";
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
                    String m=Integer.toString(q+1);
                    update(filepath,m,result);
                    break;
                }			
            }
            String n=Integer.toString(q-1);
         
            //System.out.println(n);
           // update(filepath,m,result);
            Report.returnrep(loginmail, isbn);
           
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
	}
	
}
