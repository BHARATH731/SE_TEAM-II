import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**This class is used to display the users.
*@author Team 2
*@version 1.0
*@since 2021-11-05
*/
public class DisplayUsers {
	 static Evaluation e=new Evaluation();
	 private static String fileName="C:\\Users\\lenovo\\eclipse-workspace\\Register.txt";
	 public static void display()throws Exception {
		 String st="";
		 BufferedReader reader = new BufferedReader(new FileReader(fileName));
		 while ((st = reader.readLine()) != null) {
            String[] info=st.split(",");
			System.out.println("name : "+info[0]+"roll number : "+info[1]+"Branch : "+info[2]+"Email : "+e.decrypt(info[3])+"Year of study : "+info[4]);
		 }  
		 reader.close();
	 }
}
