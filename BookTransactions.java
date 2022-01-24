
import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
public class BookTransactions {
	
	public static void updateCSV(String fileToUpdate, String replace,int row, int col)throws Exception
	{
                //Reading File
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
	
	public static void updateCSV(String fileToUpdate,String isbn,int row)throws Exception
	{

		File inputFile = new File(fileToUpdate);

		// Read existing file 
		CSVReader reader = new CSVReader(new FileReader(inputFile));
		List<String[]> data = reader.readAll();
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
		
	}  
}

	
	
	

