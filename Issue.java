import java.io.*;
import java.util.*;
public class Issue{
    public void issue(String email,String isbn)throws Exception{
        Scanner scan = new Scanner(new File("issuedemo.csv"));
        scan.useDelimiter("\n");
        //String s="";
        while(scan.hasNext()){
            if(scan.next().split(",")[0].equals(email)){
                String[] s=scan.next().split(",");
                //replace(s,s+","+isbn)
            }
        }
        System.out.println(s);
        scan.close();
    }
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        Issue i = new Issue();
        System.out.println("enter the email:");
        String email=sc.nextLine();
        System.out.println("enter the isbnno:");
        String isbn=sc.nextLine();
        i.issue(email, isbn);
        sc.close();
    }
}