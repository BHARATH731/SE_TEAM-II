import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class Search{
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