import java.io.*;  
import java.util.*;
public class Evaluation{
    public int e_val(String em)throws Exception{
        Scanner sc=new Scanner(new File("C:\\Users\\lenovo\\eclipse-workspace\\emails.txt"));
        sc.useDelimiter("\n");
        String t="";
        int i=0;
        while(sc.hasNext()){
            t=t+decrypt(sc.next());
            t=t+" ";
        }
        String ear[]=t.split(" ");
        for(String temp : ear){
            if(temp.equals(em)){
                return i;
            }
            else{
                i+=1;
            }
        }
        return -1;
    }
    public int p_val(String em,String pas)throws Exception{
        Scanner sc=new Scanner(new File("C:\\Users\\lenovo\\eclipse-workspace\\passwords.txt"));
        sc.useDelimiter("\n");
        String t="";
        while(sc.hasNext()){
            t=t+decrypt(sc.next());
            t=t+" ";
        }
        String par[]=t.split(" ");
        int ind = e_val(em);
        int tries=3;
       // System.out.println(ind);
        Scanner sc1=new Scanner(System.in);
        if(par[ind].equals(pas)){
            //sc1.close();
            return 1;
        }
        else{
            tries-=1;
            while(tries>0){
                System.out.println("still got"+" "+tries+" "+"tries"+"\n"+"enter password again:");
                String pas1=sc1.nextLine();
                if(par[ind].equals(pas1)){
                    //sc1.close();
                    return 1;
                }
                tries-=1;
            }
            sc1.close();
            return -1;
        }
    }
    public String encrypt(String em)throws Exception{
        char[] ech = new char[em.length()];
        for (int i=0;i<em.length();i++){
            ech[i] = em.charAt(i);
        }
        String s="";
        for(char c : ech) {
            int ascii=c+3;
            char c1=(char)ascii;
            s=s+String.valueOf(c1);
        }
        return s;
    }
    public String decrypt(String de)throws Exception{
        char[] ch = new char[de.length()];
        for (int i=0;i<de.length();i++){
            ch[i] = de.charAt(i);
        }
        String s="";
        for(char c : ch) {
            int ascii=c-3;
            char c1=(char)ascii;
            s=s+String.valueOf(c1);
        }
        return s;
    }
    public static void mian(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter email:");
        String em=sc.nextLine();
        System.out.println("enter password:");
        String pas=sc.nextLine();
        Evaluation e = new Evaluation();
        int i = e.p_val(em,pas);
        if(i==1){
            System.out.println("logged in successfully");
        }
        else{
            System.out.println("logged in failed");
        }
        //sc.close();
    }
}