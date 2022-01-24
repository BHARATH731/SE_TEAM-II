import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Feedback{
	public static void run() throws IOException {
		String fileName = "C:\\Users\\lenovo\\eclipse-workspace\\Feedback.txt";
		Scanner s=new Scanner(System.in);
		String text=s.nextLine();
		 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
		    writer.write(text+'\n');
		    writer.close();
	}
}
