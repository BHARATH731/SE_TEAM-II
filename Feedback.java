import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**This class is used to write the feedback of the user to a file.
*@author Team 2.
*@version 2.0
*@since 2021-11-05
*/
public class Feedback{
	public static String fileName = "C:\\Users\\lenovo\\eclipse-workspace\\Feedback.txt";
	public static void writeFeedback() throws IOException {
		Scanner s=new Scanner(System.in);
		String text=s.nextLine();
		 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
		    writer.write(text+'\n');
		    writer.close();
	}
	/**This method is used to display the feedback from the feedback file which was given by the users previously.
	*@param no args used.
	*@return no return type.
	*@exception an IOException.
	*@see IOException.
	*/
	public static void displayfeedback() throws IOException{
		 String st="";
		 BufferedReader reader = new BufferedReader(new FileReader(fileName));
		 while ((st = reader.readLine()) != null) {
	            System.out.println(st);
		 }  
	}
}
