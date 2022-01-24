/**import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Book {

	public static void main(String[] args) throws IOException {
		try {
			String line = "";  
			String isbn="24-56";
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lenovo\\eclipse-workspace\\Desktop.csv"));
		//	BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\Desktop.csv"));
	       // StringBuffer b = new StringBuffer();
			//FileWriter outputfile = new FileWriter(,true );
          /**  CSVWriter writer = new CSVWriter(outputfile, ',',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);**/

// create a List which contains Data
				//	List<String[]> data = new ArrayList<String[]>();
					
					
				//	int noOfRow = Integer.parseInt(sc.nextLine());
					
			/**	String[]					
					writer.writeAll(data);
					
					// closing writer connection
					writer.close();**/
			
			
			
		/**	
			List<Book> books = new ArrayList<>(); 
			
			line=br.readLine();
			
			while ((line = br.readLine()) != null)    
			{  
				String[] metadata = line.split(",");    // use comma as separator  
				//System.out.println(  Book[0] + "    "  +Book[1]+"     "+Book[2] +"     "+Book[3] ); 
				//int qty=Integer.parseInt(Book[3]);
				//if(isbn.equals(Book[1])) {
					//System.out.println("Book is issued");
					//break;
				}
				
				
				// Book[3]=Integer.toString((qty-1));
			}
		catch (IOException ioe) 
		{ 
				ioe.printStackTrace(); 
				} 
			private static Book createBook(String[] metadata) 
	        { 
					String name = metadata[0]; 
					int qty = Integer.parseInt(metadata[3]); 
					String author = metadata[2]; // create and return book of this metadata 
					String isbn =metadata[1];
					return new Book(name, isbn, author,qty); 
		     } 
				
class Book { 
	private String name; 
	private int qty; 
	private String author;
	private String isbn;
	public Book(String name, String isbn,String author,int qty) { 
		this.name = name; 
		this.qty = qty; 
		this.author = author; 
		this.isbn=isbn;
		} 
	public String getName() { 
		return name; 
	} 
	public void setName(String name) { 
		this.name = name; 
	} 
	public String getIsbn() { 
		return isbn; 
	} 
	public void setIsbn(String isbn) { 
		this.isbn = isbn; 
	} 

	public int getQty() {
		return qty; 
	} 
	public void setQty(int qty) { 
		this.qty = qty; 
	} 
	public String getAuthor() { 
		return author; 
		} 
	public void setAuthor(String author) { 
		this.author = author; 
		} @Override 
	public String toString() { 
			return "Book [name=" + name + ", qty=" + qty + ", author=" + author + "]"; 
			} 
  
			
	     
		
	}
}**/
/**public class BookTransactions {  
    static final String FILEPATH ="C:\\Users\\lenovo\\Documents\\jyothi\\abc.txt";  
    public static void main(String[] args) {  
        try {  
            System.out.println(new String(readFromFile(FILEPATH, 0, 18)));  
            writeToFile(FILEPATH,"25" , 22);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    private static byte[] readFromFile(String filePath, int position, int size)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
}  **/
		

/****import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List; /** * Simple Java program to read CSV file in Java. In this program we will read * list of books stored in CSV file as comma separated values. * * @author WINDOWS 8 * */ 
/**public class Book 
{ 
	public static void main(String... args) 
	{ 
		List<Book> books = readBooksFromCSV("C:\\Users\\lenovo\\eclipse-workspace\\Desktop.csv"); // let's print all the person read from CSV file 
		for (Book b : books) {
			System.out.println(b); 
		 } 
		} 
	private static List<Book> readBooksFromCSV(String fileName) 
	{ 
		List<Book> books = new ArrayList<>(); 
		Path pathToFile = Paths.get(fileName); // create an instance of BufferedReader // using try with resource, Java 7 feature to close resources 
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) { // read the first line from the text file 
			String line = br.readLine(); // loop until all lines are read 
			while (line != null) { // use string.split to load a string array with the values from // each line of // the file, using a comma as the delimiter 
				String[] attributes = line.split(","); 
				Book book = createBook(attributes); // adding book into ArrayList books.add(book); // read next line before looping // if end of file reached, line would be null 
				line = br.readLine(); 
				} 
			} catch (IOException ioe) 
		{ 
				ioe.printStackTrace(); 
				} 
		return books; 
		} 
	private static Book createBook(String[] metadata) 
	{ 
		String name = metadata[0]; 
	//	int qty = Integer.parseInt(metadata[3]); 
		String author = metadata[2]; // create and return book of this metadata 
		String isbn =metadata[1];
		return new Book(name, isbn, author); 
		} 
	} 
class Book { 
	private String name; 
	//private int qty; 	private String author;
	private String isbn;
	public Book(String name, String isbn,String author) { 
		this.name = name; 
		//this.qty = qty; 
		this.author = author; 
		this.isbn=isbn;
		} 
	public String getName() { 
		return name; 
	} 
	public void setName(String name) { 
		this.name = name; 
	} 
	public String getIsbn() { 
		return isbn; 
	} 
	public void setIsbn(String isbn) { 
		this.isbn = isbn; 
	} 

/**	public int getQty() {
		return qty; 
	} 
	public void setQty(int qty) { 
		this.qty = qty; 
	} **/
	/**public String getAuthor() { 
		return author; 
		} 
	public void setAuthor(String author) { 
		this.author = author; 
		} @Override 
	public String toString() { 
			return "Book [name=" + name + ",  + ", author=" + author"; 
			} 
  
			
		
	}***/