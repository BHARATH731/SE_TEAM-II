import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/** This class is used to take feedback from the user.
*@author Team 2
*@version 1.0
*@since 2020-11-05
*/
public class Feedback{
	/** This is main method that take feedback from the user and stores it in the feedback file.
	*@param no args passed
	*@return it doesn't return anything
	*@exception throws i/o exception
	*@see i/o exception.
	*/
	public static void run() throws IOException {
		String fileName = "C:\\Users\\lenovo\\eclipse-workspace\\Feedback.txt";
		Scanner s=new Scanner(System.in);
		String text=s.nextLine();
		 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
		    writer.write(text+'\n');
		    writer.close();
	}
}
