/**import java.util.Scanner; 
class Main{
    public static void main(String[] args)throws Exception{
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Admin");
            System.out.println("2.User");
            int n = 0;
            n = Integer.parseInt(sc.next());
            switch(n){
                case 1 :
                System.out.println("3. AddUser");
                System.out.println("4 AddBooks");
                int choice = sc.nextInt();
                switch(choice) {
                case 3:
                        while(true){
                            System.out.println("enter email:");
                            String em = sc.next();
                            if(em.endsWith("@vvit.net")){
                                Register r = new Register();
                                r.ewrite(em);
                                break;
                            }
                            else{
                                System.out.println("enter a valid email account");
                            }
                        }
                case 4:
                	//AddBooks add=new AddBooks();
                	//add.addDataToCSV(CSV_FILE_PATH);
                
                break;
                case 2:
                Login l = new Login();
                System.out.println("enter email:");
                String em=sc.nextLine();
                Evaluation e = new Evaluation();
                int i = e.e_val(em);
                if(i!=-1){
                    System.out.println("enter password:");
                    String pas=sc.nextLine();
                    boolean b = l.eval(em,pas);
                    if(b){
                        System.out.println("logged in successfully");
                    }
                    else{
                        System.out.println("logged in failed,incorrect password");
                    }
                }
                else{
                    System.out.println("user not existed");
                }
            }
            sc.close();
        }
        //sc.close();
    }
    }
}
**/