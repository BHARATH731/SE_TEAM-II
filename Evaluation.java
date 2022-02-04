import java.io.*;  
import java.util.*;
/**This class is used for the purpose of evaluation.
*@author Team 2
*@version 1.0
*@since 2021-11-05
*/
public class Evaluation{
    /**This method is used for checking the email entered is registered or not.
    *@param em
    *@return it returns i if the emailid exists otherwise -1.
    *@exception an exception.
    *see Exception.
    */
    public int e_val(String em)throws Exception{
        //Scanner sc=new Scanner(new File("emails.txt"));
        Scanner sc=new Scanner(new File("C:\\Users\\lenovo\\eclipse-workspace\\Password.txt"));
        sc.useDelimiter("\n");
        String t="";
        int i=0;
        while(sc.hasNext()){
            //t=t+decrypt(sc.next());
            t=t+decrypt(sc.next().split(",")[0]);
            t=t+" ";
            //System.out.println(t);
        }
        String ear[]=t.split(" ");
        for(String temp : ear){
        	
            if(temp.equals(em)){
            	//System.out.println(i);
                sc.close();
                return i;
            }
            else{
                i+=1;
            }
        }
        sc.close();
        return -1;
    }
    /**This method is used for the verificatin of email id and respective password of the user.
    *@param em
    *@param pas
    *@return If the emailid and password get matched it returns 1 otherwise 0.
    *@exception an exception.
    *@see Exception.
    */
    public int p_val(String em,String pas)throws Exception{
        //Scanner sc=new Scanner(new File("passwords.txt"));
        Scanner sc=new Scanner(new File("C:\\Users\\lenovo\\eclipse-workspace\\Password.txt"));
        sc.useDelimiter("\n");
        String t="";
        while(sc.hasNext()){
            //t=t+decrypt(sc.next());
            t=t+decrypt(sc.next().split(",")[1]);
            t=t+" ";
           // System.out.println("in password"+t);
        }
        String par[]=t.split(" ");
        int ind = e_val(em);
       // System.out.println(ind);
        int tries=3;
        Scanner sc1=new Scanner(System.in);
       // System.out.println(par[ind].equals(pas));
        if(par[ind].equals(pas)){
        //	System.out.println(par[0]);
            sc.close();
            return 1;
        }
        else{
            tries-=1;
            while(tries>0){
                System.out.println("still got"+" "+tries+" "+"tries"+"\n"+"enter password again:");
                String pas1=sc1.nextLine();
                if(par[ind].equals(pas1)){
                    sc.close();
                    return 1;
                }
                tries-=1;
            }
            sc.close();
            return -1;
        }
    
        /**This method is used to encrypt the emailid.
        *@param em
        *@return It returns the emailid as the string in encrypted form.
        *@exception an exception.
        *@see Exception.
        */
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
         /**This method is used to decrypt the emailid.
        *@param em
        *@return It returns the emailid as the string in decrypted form.
        *@exception an exception.
        *@see Exception.
        */
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
    /*public static void main(String[] args)throws Exception{
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
        sc.close();
    }*/
        /**This method is used to check whether the entered emailid already exists or not.
        *@param name.
        *@return it returns if exists otherwise false.
        *@exception an exception.
        *@see Exception.
        */
    public boolean n_val(String name)throws Exception{
        Scanner sc = new Scanner(new FileReader("C:\\Users\\lenovo\\eclipse-workspace\\register.txt"));
        sc.useDelimiter("\n");
        String t="";
        while(sc.hasNext()){
            String[] info = sc.next().split(",");
            t=t+info[1];
            t=t+" ";
        }
        String[] n=t.split(" ");
        for(String temp:n){
            if(temp.equals(name)){
                sc.close();
                return false;
            }
        }
        sc.close();
        return true;
    }
        /**This method is used for validating the year whether the entered study year of the student is less then or eqaul to 4 and greater than or equal to 1.
        *@param year.
        *@return It returns true if year is between 1 and 4 otherwise false.
        *@exception an exception.
        *@see Exception.
        */
    public boolean y_val(int year)throws Exception{
        if(year>=1 && year<=4){
            return true;
        }
        return false;
    }
        /**This method is used for validating the branch whether the entered branch of the student is in the mentioned branches or  not.
        *@param branch.
        *@return It returns true if the branch is valid.
        *@exception an exception.
        *@see Exception.
        */
    public boolean b_val(String branch)throws Exception{
        String t="cse,ece,eee,civil,it,mechanical";
        String[] b=t.split(",");
        for(String temp:b){
            if(temp.equals(branch)){
                return false;
            }
        }
        return true;
    }
        /**This method is used for validating the email whether the entered email ends either with @vvit.net or @gmail.com.
        *@param em.
        *@return It returns true if the email ends with @vvit.net or @gmail.com otherwise false.
        *@exception an exception.
        *@see Exception.
        */
    public int em_val(String em) {
        if(em.endsWith("@vvit.net")||em.endsWith("@gmail.com"))
        {
            return 1;
        }
        return -1;
    }
}
