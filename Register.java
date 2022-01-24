import java.io.*;
import java.util.Scanner;

public class Register{
    public void ewrite(String em)throws Exception{
        FileWriter ew=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\emails.txt",true);
        FileWriter iw=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\IssueReport.txt",true);
        FileWriter rw=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\ReturnReport.txt",true);
        Evaluation eval = new Evaluation();
        int val = eval.e_val(em);
        Evaluation e = new Evaluation();
        if(val==-1){
            String email=e.encrypt(em);
            String s = email + "\n";
            System.out.println("enter password:");
            Scanner sc = new Scanner(System.in);
            String pas = sc.nextLine();
            FileWriter pw=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\passwords.txt",true);
            System.out.println("Re-enter password:");
            while(true){
                if(sc.nextLine().equals(pas)){
                    String password=e.encrypt(pas);
                    String s1 = password + "\n";
                    pw.write(s1);
                    ew.write(s);
                    iw.write(em+"\n");
                    rw.write(em+"\n");
                    ew.close();
                    iw.close();
                    rw.close();
                    pw.close();
                    sc.close();
                    System.out.println("Successfully Registered");
                    break;
                }
                else{
                    System.out.println("password does not match"+"\n"+"Re-enter pasword again:");
                }
            }
        }
        else{
            System.out.println("User Already Existed");
        }
    }
    
    public void registerRun()throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter email:");
        
        String em = sc.nextLine();
        if(em.endsWith("@gmail.com" )|| em.endsWith("@vvit.net")){
            ewrite(em);
            
        }
        else{
            System.out.println("enter a valid email account");
        }
        sc.close();
    }
}