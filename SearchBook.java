import java.util.*;
import java.util.Map.Entry;
import java.io.*;
/**
*This class provides the search functionality for the user who access the library management system.
*@author Team 2
*@version 1.0
*@since 5-11-21
*/
public class SearchBook{
	String f="C:\\Users\\lenovo\\eclipse-workspace\\Books.csv";
	/** Thsi method is used to search the book using isbn number
	*@param It takes the parameter given by the user that is isbn number of the required book as the string.
	*@exception an exception.
	*@see Exception.
	*@return This method returns an empty string .It actually checks the availability of the book corresponding to the given isbn number.
	*/
    public String searchByIsbn(String text)throws Exception{
        Scanner sc=new Scanner(new File(f));
        sc.useDelimiter("\n");
        LinkedHashMap<String,String> m = new LinkedHashMap<String, String>();
        while(sc.hasNext()){
            String[] tokens=sc.next().split(",");
            m.put(tokens[1].replaceAll("^\"|\"$", ""),tokens[1].replaceAll("^\"|\"$", ""));
        }
        Set<Map.Entry<String,String>> s = m.entrySet();
        for(Entry<String, String> temp : s){
            if(temp.getKey().equalsIgnoreCase(text)){
            	//System.out.println(temp.getValue());
            	display(temp.getValue());
                return temp.getValue();
            }
        }
        return "";
    }
	/** Thsi method is used to search the book using author name.
	*@param It takes the parameter given by the user that is author name of the required book as the string.
	*@exception an exception.
	*@see Exception.
	*@return This method returns an empty string .It actually checks the availability of the book corresponding to the given author name.
	*/
    public String searchByAuthor(String text)throws Exception{
        Scanner sc=new Scanner(new File(f));
        sc.useDelimiter("\n");
        LinkedHashMap<String,String> m = new LinkedHashMap<String, String>();
        while(sc.hasNext()){
            String[] tokens=sc.next().split(",");
            m.put(tokens[0].replaceAll("^\"|\"$", ""),tokens[2].replaceAll("^\"|\"$", ""));
        }
        Set<Map.Entry<String,String>> s = m.entrySet();
        LinkedHashMap<String,String> a = new LinkedHashMap<String, String>();
        int i=1;
        for(Entry<String, String> temp : s){
            if(temp.getValue().equalsIgnoreCase(text)){
                a.put(Integer.toString(i),temp.getKey());
                i+=1;
            }
        }
        Set<Map.Entry<String,String>> b = a.entrySet();
        if(i>1){
            System.out.println("enter your choice from below:");
            for(Entry<String, String> c : b){
                System.out.println(c.getKey()+"."+c.getValue());
            }
            System.out.println("enter choice:");
            Scanner scan=new Scanner(System.in);
            String selected=scan.nextLine();
            for(Entry<String, String> c : b){
                if(c.getKey().equalsIgnoreCase(selected)){
                    return searchByBookname(c.getValue());
                }
            }
        }
        return "";
    }
	/** Thsi method is used to search the book using publisher
	*@param It takes the parameter given by the user that is publisher of the required book as the string.
	*@exception an exception.
	*@see Exception.
	*@return This method returns an empty string .It actually checks the availability of the book corresponding to the given publisher.
	*/
    public String searchByPublisher(String text)throws Exception{
	    Scanner sc=new Scanner(new File(f));
	    sc.useDelimiter("\n");
	    LinkedHashMap<String,String> m = new LinkedHashMap<String, String>();
	    while(sc.hasNext()){
	        String[] tokens=sc.next().split(",");
	        m.put(tokens[0].replaceAll("^\"|\"$", ""),tokens[3].replaceAll("^\"|\"$", ""));
	    }
	    Set<Map.Entry<String,String>> s = m.entrySet();
	    LinkedHashMap<String,String> a = new LinkedHashMap<String, String>();
	    int i=1;
	    for(Entry<String, String> temp : s){
	        if(temp.getValue().equalsIgnoreCase(text)){
	            a.put(Integer.toString(i),temp.getKey());
	            i+=1;
	        }
	    }
	    Set<Map.Entry<String,String>> b = a.entrySet();
	    System.out.println("enter your choice from below:");
	    for(Entry<String, String> c : b){
	        System.out.println(c.getKey()+"."+c.getValue());
	    }
	    System.out.println("enter choice:");
	    Scanner scan=new Scanner(System.in);
	    String selected=scan.nextLine();
	    for(Entry<String, String> c : b){
	        if(c.getKey().equalsIgnoreCase(selected)){
	        	//display(c.get);
	            return searchByBookname(c.getValue());
	        }
	    }
	    return "";
    }
    /** Thsi method is used to search the book using book title.
	*@param It takes the parameter given by the user that is title of the required book as the string.
	*@exception an exception.
	*@see Exception.
	*@return This method returns an empty string .It actually checks the availability of the book corresponding to the given book title.
	*/
    public String searchByBookname(String text)throws Exception{
        Scanner sc=new Scanner(new File(f));
        sc.useDelimiter("\n");
        LinkedHashMap<String,String> m = new LinkedHashMap<String, String>();
        while(sc.hasNext()){
            String[] tokens=sc.next().split(",");
            m.put(tokens[0].replaceAll("^\"|\"$", ""),tokens[1].replaceAll("^\"|\"$", ""));
        }
        Set<Map.Entry<String,String>> s = m.entrySet();
        for(Entry<String, String> temp : s){
            if(temp.getKey().equalsIgnoreCase(text)){
            	display(temp.getValue());
                return temp.getValue();
            }
        }
        return "";
    }
    /** This is the method which displays the number of books based on isbn , author , book title , publisher and also acknowledges the user .
    *@param takes isbn number as parameter.
    *@return no return type.
    *@exception an exception.
    *@see Exception.
    */
    public  void display(String isbn)throws Exception{
        Scanner scan = new Scanner(new File(f));
        while(scan.hasNextLine()){
            String s = scan.nextLine();
           
            String[] bookinfo= s.split(",");
            //System.out.println(bookinfo[1]);
            if(bookinfo[1].replaceAll("^\"|\"$", "").equals(isbn)){
                System.out.println("bookname:"+bookinfo[0]);
                System.out.println("isbnno:"+bookinfo[1]);
                System.out.println("author:"+bookinfo[2]);
                System.out.println("publisher:"+bookinfo[3]);
                System.out.println("count:"+bookinfo[4]);
            }
        }
    }
    
    /** This is the method which displays the options for the user about the filters available to search for the book and also acknowledges the user
    *@param no args used.
    *@return no return type.
    *@exception an exception
    *@see Exception.
    */
    public static void Search()throws Exception{
        SearchBook s = new SearchBook();
        while(true){
            System.out.println("\033[H\033[2J");
		    System.out.flush();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter choice:");
            System.out.println("........MAIN MENU OF SEARCH........");
            System.out.println("1.search by bookname:");
            System.out.println("2.search by author:");
            System.out.println("3.search by isbnno:");
            System.out.println("4.search by publisher:");
            System.out.println("5.go back to main menu");
            int choice =Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1: //System.out.println("have to integrate from bharathvaz");
                	 System.out.println("enter bookname:");
                     String bookname=sc.nextLine();
                     String status=s.searchByBookname(bookname);
                     if(status.equals("")){
                         System.out.println("book not found");
                     }
                    
                     break;
                        
                case 2: 
	                	System.out.println("enter author name:");
	                    String author=sc.nextLine();
	                    String status1=s.searchByAuthor(author);
	                    if(status1.equals("")){
	                        System.out.println("book not found");
	                    }
	                    
	                    break;
                      
                case 3: System.out.println("enter isbnno:");
                        String isbnno=sc.nextLine();
                        String status2=s.searchByIsbn(isbnno);
                        if(status2.equals("")){
                            System.out.println("book not found");
                        }
                        
                        break;
                case 4: System.out.println("enter publisher:");
                        String publisher=sc.nextLine();
                        String status3=s.searchByPublisher(publisher);
                        if(status3.equals("")){
                            System.out.println("book not found");
                        }
                       break;
                //case 5: break;
                default: System.out.println("enter a valid choice");
                 
            }
            break;
        }
    }
}
