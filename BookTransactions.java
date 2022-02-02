
import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
//import com.opencsv.CSVReader;
//import com.opencsv.CSVWriter;
public class BookTransactions {
	
/**	public static void updateCSV(String fileToUpdate, String replace,int row, int col)throws Exception
	{

		File inputFile = new File(fileToUpdate);

		// Read existing file 
		CSVReader reader = new CSVReader(new FileReader(inputFile));
		List<String[]> data = reader.readAll();
		// get CSV row column  and replace with by using row and column
		data.get(row)[col] = replace;
		reader.close();

		// Write to CSV file which is open
		CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
		writer.writeAll(data);
		//writer.flush();
		writer.close();
		
	}
	
	public static void update(String fileToUpdate,String isbn,int row)throws Exception
	{

		File inputFile = new File(fileToUpdate);

		// Read existing file 
		CSVReader reader = new CSVReader(new FileReader(inputFile));
        //Path path=Paths.get(fileToUpdate);
		List<String[]> data = reader.readAll();
		//System.out.println( Files.readAllLines(path));
		//List<String[]> data = Files.readAllLines(path);
		// get CSV row column  and replace with by using row and column
		String replace[]=data.get(row);
		int col=replace.length-1;
		//replace[col]=isbn;
		data.get(row)[col]=isbn;
		reader.close();

		// Write to CSV file which is open
		CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
		writer.writeAll(data);
		//writer.flush();
		writer.close();
		
	}  **/
	
	public static void update(String filename,String replace,String isbn)throws Exception{
        Scanner scan = new Scanner(new File(filename));
        String rep="";
        String con="";
        String emp="";
        while(scan.hasNextLine()){
            emp=scan.nextLine();
            if(emp.split(",")[1].equals(isbn)){
                String[] bookinfo = emp.split(",");
                
                    rep=bookinfo[0]+","+bookinfo[1]+","+bookinfo[2]+","+bookinfo[3]+","+replace;
                    con=con+rep+"\n";
                
            }
            else{
                con=con+emp+"\n";
            }
        }
        scan.close();
       // System.out.println(con);
        FileWriter f = new FileWriter(filename);
        f.write(con);
        f.close();
    }
	
	
}

	
	
	

