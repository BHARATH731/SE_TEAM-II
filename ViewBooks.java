/**This class is used to view the books.
*@author Team 2
*@version 1.0
*@since 2021-11-05
*/
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class ViewBooks  {  
	/*This method is used to display the books
	*@param filepath
	*@return no return type.
	*@exception no exception
	*/
	public static void display(String filepath) 
	{  
		String line = "";  
		//String splitBy = ",";  
		try   
		{  
		 
			BufferedReader br = new BufferedReader(new FileReader(filepath));  
			while ((line = br.readLine()) != null)    
			{  
				String[] Book = line.split(",");    // use comma as separator  
				System.out.println(  Book[0] + "    "  +Book[1]+"     "+Book[2] +"     "+Book[3]+"    "+Book[4] );  
			}  
		}   
		catch (IOException e)   
		{  
		   e.printStackTrace();  
		}  
	}  
}  
