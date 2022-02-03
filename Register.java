import java.io.*;
import java.util.*;
/** This class is used to register the user for the library management system.
*@author Team 2
*@since 5-11-21
*@version 1.0
*/
public class Register{
    /** This method is used to write the user details to a file
    *@exception an exception.
    *@return no return type.
    *@param name 
    *@param roll 
    *@param branch 
    *@param em 
    *@param year
    *@see Exception.
    */
    
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
    /** This method is used to take information of the user as input from the console.
    *@return no return type.
    *@param no args used.
    *@exception throws Exception.
    *@see Exception.
    */
    public static void run()throws Exception{
    	Scanner scan=new Scanner(System.in);
        Evaluation e = new Evaluation();
        System.out.println("Enter a valid username:");
        String name = scan.nextLine();
        while(!(e.n_val(name))){
            System.out.println("Enter a valid username:");
            name = scan.nextLine();
        }

        System.out.println("Enter EmailID:");
        String emailid = scan.nextLine();
        while((e.e_val(emailid)!=-1)||(e.em_val(emailid)==-1)){
            System.out.println("Enter a valid Email:");
            emailid = scan.nextLine();
        }
        
        System.out.println("Enter year of study:");
        int year = Integer.parseInt(scan.nextLine());
        while(!(e.y_val(year))){
            System.out.println("enter a valid year-(1-4):");
            year = Integer.parseInt(scan.nextLine());
        }
        
        System.out.println("Enter Branch:");
        String branch = scan.nextLine();
        while(e.b_val(branch)){
            System.out.println("Enter a valid branch");
            branch = scan.nextLine();
        }
        
        System.out.println("Enter rollNumber:");
        String rollNumber = scan.nextLine();
        System.out.println("Create a password:");
        String rpassword = scan.nextLine();
        FileWriter pw=new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\Password.txt",true);
        String pass="";
        while(true){
            System.out.println("Re-enter password again");
            if(scan.nextLine().equals(rpassword)){
                pass=e.encrypt(rpassword);
               // scan.close();
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
       // scan.close();
    }
}
