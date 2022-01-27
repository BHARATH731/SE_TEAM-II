import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Feedback{
	public static String fileName = "C:\\Users\\lenovo\\eclipse-workspace\\Feedback.txt";
	public static void writeFeedback() throws IOException {
		Scanner s=new Scanner(System.in);
		String text=s.nextLine();
		 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
		    writer.write(text+'\n');
		    writer.close();
	}
	public static void displayfeedback() throws IOException{
		 String st="";
		 BufferedReader reader = new BufferedReader(new FileReader(fileName));
		 while ((st = reader.readLine()) != null) {
	            System.out.println(st);
		 }  
	}
}
