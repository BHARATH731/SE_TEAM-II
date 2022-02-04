import java.io.*;
import java.util.*;
	/** This class is used to add books by the admin into the library catalog.
	*@author Team 2
	*@version 1.0
	*@since 2021-11-05
	*/
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
	    /**This method is used to check whether the adding book already exists or not.
	    *@param text
	    *@param file
	    *@return returns 1 if exits otherwise 0.
	    *@exception an exception
	    *@see Exception.
	    */
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
		/**This method is used to enter the book details by the librarian.
		*@param no args used.
		*@return no return type.
		*@exception throws exception.
		*@see Exception.
		*/
	    public static void run()throws Exception{
	       // AddBooks se=new AddBooks();
	    System.out.println("enter no of books to add");
	    	int n=Integer.parseInt(System.console().readLine());
	       // Scanner s=new Scanner(System.in);
	        for(int i=0;i<n;i++) {

	        	System.out.println("enter "+i+1+" book"+"\n"+"enter  bookname:");
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
	        }
	       // s.reset();
	        //s.close();
	    }
	}
