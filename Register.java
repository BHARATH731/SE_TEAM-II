import java.io.*;
import java.util.*;
public class Register{
    
    public static void ewrite(String name,String roll,String branch,String em,int year)throws Exception{
        FileWriter rw=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\register.txt",true);
        FileWriter iw=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\IssueReport.txt",true);
        FileWriter rew=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\ReturnReport.txt",true);
        FileWriter ew=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\Password.txt",true);
        Evaluation e = new Evaluation();
        int val = e.e_val(em);
        if(val==-1){
            String email=e.encrypt(em);
            String s = name+","+roll+","+branch+","+email+","+Integer.toString(year)+"\n";
            rw.write(s);
            String s1=em+"\n";
            iw.write(s1);
            rew.write(s1);
            //ew.write(s1);
            rew.close();
            iw.close();
            ew.close();
            rw.close();
        }
        else{
            System.out.println("User Already Existed");
        }
    }
    public static void run()throws Exception{
    	Scanner scan=new Scanner(System.in);
        Evaluation e = new Evaluation();
        System.out.println("Enter a valid username:");
        String name = System.console().readLine();
        while(!(e.n_val(name))){
                    System.out.println("Enter a valid username:");
                    name = System.console().readLine();
                }

                System.out.println("Enter EmailID:");
                String emailid = System.console().readLine();
                while((e.e_val(emailid)!=-1)||(e.em_val(emailid)==-1)){
                    System.out.println("Enter a valid Email:");
                    emailid = System.console().readLine();
                }
                
                System.out.println("Enter year of study:");
                int year = Integer.parseInt(System.console().readLine());
                while(!(e.y_val(year))){
                    System.out.println("enter a valid year-(1-4):");
                    year = Integer.parseInt(System.console().readLine());
                }
                
                System.out.println("Enter Branch:");
                String branch = System.console().readLine();
                while(e.b_val(branch)){
                    System.out.println("Enter a valid branch");
                    branch = System.console().readLine();
                }
                
                System.out.println("Enter rollNumber:");
                String rollNumber = System.console().readLine();
                
                System.out.println("Create a password:");
                String rpassword = System.console().readLine();
                FileWriter pw=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\Password.txt",true);
                String pass="";
                while(true){
                    System.out.println("Re-enter password again");
                    if(System.console().readLine().equals(rpassword)){
                        pass=e.encrypt(rpassword);
                        break;
                    }
                    else{
                        System.out.println("password does not match"+"\n");
                    }
                }
                ////System.out.println("\033[H\033[2J");
                //System.out.flush();
                if(e.e_val(emailid)==-1){
                    Register r = new Register();
                    r.ewrite(name, rollNumber, branch, emailid, year);
                    String s1 = e.encrypt(emailid)+","+pass + "\n";
                    pw.write(s1);
                    pw.close();
                    System.out.println("user registeration completed");
                  
                }
                else{
                    System.out.println("user already registerd");
                  
                }
                scan.close();
            }
    
              
    
}