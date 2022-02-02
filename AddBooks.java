import java.io.*;
import java.util.*;
/**import com.opencsv.CSVWriter;
  
/**public class AddBooks {
  
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
            int noOfRow = Integer.parseInt(sc.System.console().readLine(););
            System.out.println("Enter Data of books in order of bookname , isbnno ,author ,publisher,qty");
            for (int i = 0; i < noOfRow; i++) {
                String row = sc.System.console().readLine();;
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
    }**/
	
	public class AddBooks{
	    public static void addBooks(String bookname,String isbnno,String author,String publisher,Integer count)throws Exception{
	    	String filename= "C:\\Users\\lenovo\\eclipse-workspace\\Books.csv";
	        FileWriter it=new FileWriter(filename,true);
	        //Scanner sc=new Scanner(System.in);
	        int i=check(isbnno,filename);
	        if(i==-1){
	            String s="";
	            s=s+bookname+","+isbnno+","+author+","+publisher+","+count+"\n";
	            it.write(s);
	            it.close();
	        }
	        else{
	            System.out.println("book already existed");
	            
	        }
	        //sc.close();
	    }
	    /**public void ptwrite(String bookname,String publisher)throws Exception{
	        FileWriter tb=new FileWriter("ptbooks.csv",true);
	        Scanner sc=new Scanner(System.in);
	        int i=check(bookname,"ptbooks.csv");
	        if(i==-1){
	            String s="";
	            s=s+publisher+","+bookname+"\n";
	            tb.write(s);
	            tb.close();
	        }
	        else{
	            System.out.println("book already existed");
	        }
	        sc.close();
	    }
	    public void cbwrite(String bookname,String count)throws Exception{
	        FileWriter tb=new FileWriter("cbbooks.csv",true);
	        Scanner sc=new Scanner(System.in);
	        int i=check(bookname,"cbbooks.csv");
	        if(i==-1){
	            String s="";
	            s=s+count+","+bookname+"\n";
	            tb.write(s);
	            tb.close();
	        }
	        else{
	            System.out.println("book already existed");
	        }
	        sc.close();
	    }
	    public void atwrite(String bookname,String author)throws Exception{
	        FileWriter tb=new FileWriter("atbooks.csv",true);
	        Scanner sc=new Scanner(System.in);
	        int i=check(bookname,"atbooks.csv");
	        if(i==-1){
	            String s="";
	            s=s+author+","+bookname+"\n";
	            tb.write(s);
	            tb.close();
	        }
	        else{
	            System.out.println("book already existed");
	        }
	        sc.close();
	    }**/
	    public static int check(String text,String file)throws Exception{
	        Scanner sc=new Scanner(new File(file));
	        sc.useDelimiter("\n");
	        String t="";
	        while(sc.hasNext()){
	            String[] tokens=sc.next().split(",");
	            t=t+tokens[1]+"/";
	        }
	        String[] book=t.split("/");
	        for(String temp : book){
	            if(temp.equals(text)){
	            	sc.close();
	                return 1;
	            }
	        }
	        sc.close();
	        return -1;
	    }
	    public static void run()throws Exception{
	       // AddBooks se=new AddBooks();
	    	
	       // Scanner s=new Scanner(System.in);
	        System.out.println("enter bookname:");
	        String bookname=System.console().readLine();
	        System.out.println("enter isbnno:");
	        String isbnno=System.console().readLine();
	        System.out.println("enter author:");
	        String author=System.console().readLine();
	        System.out.println("enter publisher:");
	        String publisher=System.console().readLine();
	        System.out.println("enter count:");
	        int count=Integer.parseInt(System.console().readLine());
			//s.close();
	        addBooks(bookname,isbnno,author,publisher,count);
	       // s.reset();
	        //s.close();
	    }
	}
