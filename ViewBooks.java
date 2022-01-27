/**import java.io.FileReader;
import java.util.List;
import com.opencsv.*;
 
public class ViewBooks {
  //  private static final String CSV_FILE_PATH
    //    = "C:\\Users\\lenovo\\eclipse-workspace\\Desktop.txt";
 /**   private static final String CSV_FILE_CUSTOM_SEPARATOR
        = "C:\\Users\\lenovo\\eclipse-workspace\\Desktop.txt";*/
 
  /**  public static void main(String[] args)
    {
        System.out.println("Read Data Line by Line With Header \n");
        readDataLineByLine("C:\\Users\\lenovo\\eclipse-workspace\\Desktop.txt");
        System.out.println("_______________________________________________");**/
 
      /**  System.out.println("Read All Data at Once and Hide the Header also \n");
        readAllDataAtOnce(CSV_FILE_PATH);
        System.out.println("_______________________________________________");**/
 
     /**   System.out.println("Custom Separator here semi-colon\n");
        readDataFromCustomSeparator(CSV_FILE_CUSTOM_SEPARATOR);
        System.out.println("_______________________________________________");
    }
 
    public static void readDataLineByLine(String file)
    {
 
        try {
 
            // Create an object of filereader class
            // with CSV file as a parameter.
            FileReader filereader = new FileReader(file);
 
            // create csvReader object passing
            // filereader as parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
 
            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public static void readAllDataAtOnce(String file)
    {
        try {
 
            // Create an object of filereader class
            // with CSV file as a parameter.
            FileReader filereader = new FileReader(file);
 
            // create csvReader object
            // and skip first Line
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                                      .withSkipLines(1)
                                      .build();
            List<String[]> allData = csvReader.readAll();
 
            // print Data
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public static void readDataFromCustomSeparator(String file)
    {
        try {
            // Create object of filereader
            // class with csv file as parameter.
            FileReader filereader = new FileReader(file);
 
            // create csvParser object with
            // custom separator semi-colon
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
 
            // create csvReader object with
            // parameter filereader and parser
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                                      .withCSVParser(parser)
                                      .build();
 
            // Read all data at once
            List<String[]> allData = csvReader.readAll();
 
            // print Data
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
import java.io.FileReader;
import com.opencsv.CSVReader;
public class ViewBooks {
  public static void main(String[] args) {
    CSVReader reader = null;
    try {
      //parsing a CSV file into CSVReader class constructor  
      reader = new CSVReader(new FileReader("C:\\Users\\lenovo\\eclipse-workspace\\Desktop.csv"));
      String[] nextLine;
      //reads one line at a time  
      while ((nextLine = reader.readNext()) != null) {
        for (String token: nextLine) {
          System.out.print(token);
        }
        System.out.print("\n");
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}**/
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class ViewBooks  {  
	
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