import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class SearchBook{
	String f="C:\\Users\\lenovo\\eclipse-workspace\\Books.csv";
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
            if(temp.getKey().equals(text)){
                return temp.getValue();
            }
        }
        return "";
    }
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
            if(temp.getValue().equals(text)){
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
                if(c.getKey().equals(selected)){
                    return searchByBookname(c.getValue());
                }
            }
        }
        return "";
    }
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
	        if(temp.getValue().equals(text)){
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
	        if(c.getKey().equals(selected)){
	            return searchByBookname(c.getValue());
	        }
	    }
	    return "";
    }
    
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
            if(temp.getKey().equals(text)){
                return temp.getValue();
            }
        }
        return "";
    }
    public static void Search()throws Exception{
        SearchBook s = new SearchBook();
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
                case 1: //System.out.println("have to integrate from bharathvaz");
                	 System.out.println("enter bookname:");
                     String bookname=sc.nextLine();
                     String status=s.searchByBookname(bookname);
                     if(status.equals("")){
                         System.out.println("book not found");
                     }
                     else{
                         System.out.println("book found"+" "+status);
                     }
                     break;
                        
                case 2: 
                        System.out.println("enter author name:");
                        String author=sc.nextLine();
                        String status1=s.searchByAuthor(author);
                        if(status1.equals(".")){
                            System.out.println("book not found");
                            System.out.println("to issue enter 1");
                            String i=sc.next();
                           int x= Integer.parseInt(i);  
                           if(x==1) {
                        	   
                           }
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
                        String status3=s.searchByPublisher(publisher);
                        if(status3.equals("")){
                            System.out.println("book not found");
                        }
                        else{
                            System.out.println("book found"+" "+status3);
                        }
                        break;
                case 5: break;
                default: System.out.println("enter a valid choice");
                 
            }
            break;
        }
    }
}