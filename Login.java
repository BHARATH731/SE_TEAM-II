import java.util.*;
public class Login {
    public boolean eval(String em,String pas)throws Exception{
        Evaluation e = new Evaluation();
        int res=e.p_val(em,pas);
        if(res==1){
            return true;
        }
        return false;
    }
    public String loginRun()throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter email:");
        String em=sc.nextLine();
        Evaluation e = new Evaluation();
        int i = e.e_val(em);
        if(i!=-1){
            System.out.println("enter password:");
            String pas=sc.nextLine();
            boolean b = eval(em,pas);
            if(b){
                System.out.println("logged in successfully");
                return em ;
            }
            else{
                System.out.println("logged in failed,incorrect password");
                return "";
            }
        }
        else{
            System.out.println("user not existed");
            return "";
        }
    }
}