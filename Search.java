import java.util.*;
import java.util.Map.Entry;
import java.io.*;
/**This class provides the search functionality to user for library management system.
*@author team 2
*@version 1.0
*@since 2020-11-5
*/
public class Search{
    /** This method is to search the book using isbn number
    *@param It takes the parameter given by the user that is isbn number of the required book as a string
    *@exception an exception
    *@see Exception
    *@return This method returns an empty String .It actually checks the availability of the book corresponding to the given isbn number and acknowledges the user.
    */
    public String searchByIsbn(String text)throws Exception{
        Scanner sc=new Scanner(new File("Desktop.csv"));
        sc.useDelimiter("\n");
        LinkedHashMap<String,String> m = new LinkedHashMap<String, String>();
        while(sc.hasNext()){
            String[] tokens=sc.next().split(",");
            m.put(tokens[1],tokens[1]);
        }
        Set<Map.Entry<String,String>> s = m.entrySet();
        for(Entry<String, String> temp : s){
            if(temp.getKey().equals(text)){
                return temp.getValue();
            }
        }
        return "";
    }
    /** This method is to search the book using author name.
    *@param It takes the parameter given by the user that is name of the author of the required book as a string
    *@exception an exception
    *@see Exception
    *@return This method returns an empty String .It actually checks the availability of the book corresponding to the given author name and acknowledges the user.
    */
    public String searchByAuthor(String text)throws Exception{
    
        Scanner sc=new Scanner(new File("Desktop.csv"));
        sc.useDelimiter("\n");
        LinkedHashMap<String,String> m = new LinkedHashMap<String, String>();
        while(sc.hasNext()){
            String[] tokens=sc.next().split(",");
            m.put(tokens[2],tokens[1]);
        }
        Set<Map.Entry<String,String>> s = m.entrySet();
        for(Entry<String, String> temp : s){
            if(temp.getKey().equals(text)){
                return temp.getValue();
            }
        }
        return "";
    }
    /** This method is to search the book using publisher.
    *@param It takes the parameter given by the user that is publisher of the required book as a string
    *@exception an exception
    *@see Exception
    *@return This method returns an empty String .It actually checks the availability of the book corresponding to the given publisher and acknowledges the user.
    */
    public String searchByPublisher(String text)throws Exception{
        Scanner sc=new Scanner(new File("Desktop.csv"));
        sc.useDelimiter("\n");
        LinkedHashMap<String,String> m = new LinkedHashMap<String, String>();
        while(sc.hasNext()){
            String[] tokens=sc.next().split(",");
            m.put(tokens[3],tokens[1]);
        }
        Set<Map.Entry<String,String>> s = m.entrySet();
        for(Entry<String, String> temp : s){
            if(temp.getKey().equals(text)){
                return temp.getValue();
            }
        }
        return "";
    }
    /**This is the main method which displays the options for the user about the filters available to serach for the book and also acknowledges the user.
    *@param takes args as param
    *@return no return type
    *exception exception
    *@see Exception
    */
    public static void main(String[] args)throws Exception{
        Search s = new Search();
        while(true){
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
                case 1: System.out.println("have to integrate from bharathvaz");
                        break;
                case 2: 
                        System.out.println("enter author name:");
                        String author=sc.nextLine();
                        String status1=s.searchByAuthor(author);
                        if(status1.equals("")){
                            System.out.println("book not found");
                        }
                        else{
                            System.out.println("book found"+" "+status1);
                        }
                        break;
                case 3: System.out.println("enter isbnno:");
                        String isbnno=sc.nextLine();
                        String status2=s.searchByIsbn(isbnno);
                        if(status2.equals("")){
                            System.out.println("book not found");
                        }
                        else{
                            System.out.println("book found"+" "+status2);
                        }
                        break;
                case 4: System.out.println("enter publisher:");
                        String publisher=sc.nextLine();
                        String status3=s.searchByAuthor(publisher);
                        if(status3.equals("")){
                            System.out.println("book not found");
                        }
                        else{
                            System.out.println("book found"+" "+status3);
                        }
                        break;
                case 5: System.exit(0);
                default: System.out.println("enter a valid choice");
            }
        }
    }
}
