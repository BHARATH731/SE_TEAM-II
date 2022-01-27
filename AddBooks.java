import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;
  
public class AddBooks {
  
    public static void addDataToCSV(String CSV_FILE_PATH)
    {
        // first create file object for file placed at location
        // specified by filepath
        File file = new File(CSV_FILE_PATH);
       
        Scanner sc = new Scanner(System.in);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file,true );
  
            // create CSVWriter with ';' as separator
            CSVWriter writer = new CSVWriter(outputfile, ',',
                                             CSVWriter.NO_QUOTE_CHARACTER,
                                             CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                             CSVWriter.DEFAULT_LINE_END);
  
            // create a List which contains Data
            List<String[]> data = new ArrayList<String[]>();
  
            System.out.println("Enter no of books");
            int noOfRow = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Data of books in order of bookname , isbnno ,author ,publisher,qty");
            for (int i = 0; i < noOfRow; i++) {
                String row = sc.nextLine();
                String[] rowdata = row.split(",");
                data.add(rowdata);
            }
  
            writer.writeAll(data);
  
            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}