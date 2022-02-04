import java.io.BufferedReader;
import java.io.FileReader;
/**This class s used to issue the book to the user.
*@author Team 2
*@version 1.0
*@since 2021-11-05
*/
public class IssueBook extends BookTransactions{
	/**This method is used to issu the book to the user using isbn number and decrease that particular book count.
	*@param loginmail
	*@param isbn
	*@return It returns an integer regarding the book count.
	*@exception no exception.
	*/
	public static int issue(String filepath,String loginmail,String isbn1) {
		String line1 = ""; 
        int r1=0;
        int q1=0;
        int check=0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            while ((line1 = br.readLine()) != null){   
                r1=r1+1;
                String[] Book = line1.split(","); 
                
                String result = Book[1].replaceAll("^\"|\"$", "");
              
                if(isbn1.equals(result)){
                    
                    q1=Integer.parseInt(Book[4].replaceAll("^\"|\"$", ""));
                    if(q1>0) {
                        String n1=Integer.toString(q1-1);
                     
                        update(filepath,n1,result);
                       
                        Report.issue(loginmail,result);
                        check= 1;
                        break;
                    }
                    else {
                    	System.out.println("book was ran out of stock");
                    	check= 0;
                    }
                }
            }
        }
        catch(Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }
        return check;
	}
}
