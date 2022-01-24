import java.io.*;
import java.util.*;
import java.lang.*;
public class SignUp{
    public static Scanner sc=new Scanner(System.in);
    //String id=s.next();
    public static void write(String id,File fi)throws IOException{//creating a method to write the data to file
        FileWriter fw=new FileWriter(fi,true);
        fw.write(id);
        fw.close();
    }
    public static String[] readFiles(String file){// converting the data of the file into array and storing 
        try{
            File f =new File(file);
            Scanner s=new Scanner(f);
            int c=0;
            int flag=0;
            while(s.hasNextLine()){
                c++;
                s.nextLine();
            }
            String[] arr=new String[c];
            Scanner s1=new Scanner(f);
            for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }
            System.out.println("Enter the Username:");
            String uname=sc.next();
            //System.out.print(uname);
            for(int i=0;i<arr.length;i++){
                //System.out.println(arr[i]);
                if(uname.equals(arr[i])){//making sure the username is not repeated
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            if(flag==1){
                System.out.println("The user already exists");
            }
            else{
                int i;
                String x;
                i=arr.length;
                File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\username.txt");
                write(uname +"\n",fi);
                String [] data1=readFile("password.txt");//if the user is new then he need to create a password
                //System.out.println("The data has been appended succesfully");
                arr[i]=s1.nextLine();

            }
            return arr;
        }
        catch(Exception e){
            return null;
        }
    }
    public static Scanner sca=new Scanner(System.in);
    //String id=s.next();
    public static void writes(String id,File fi)throws IOException{
        FileWriter fw=new FileWriter(fi,true);
        fw.write(id);
        fw.close();
    }
    public static String[] readFile(String file){
        try{
            File f =new File(file);
            Scanner s=new Scanner(f);
            int c=0;
            int flag=0;
            while(s.hasNextLine()){
                c++;
                s.nextLine();
            }
            String[] arr=new String[c];
            Scanner s1=new Scanner(f);
            /*for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }*/
            System.out.println("Enter the Password:");
            String pass=sca.next();
            //System.out.println(uname);
            File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\password.txt");
            write(pass +"\n",fi);
            System.out.println("The aacount has been created");
            for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }
            return arr;
        }
        catch(Exception e){
            return null;
        }
    }
    public static String[] readFiles1(String file){// converting the data of the file into array and storing 
        try{
            File f =new File(file);
            Scanner scann=new Scanner(f);
            int c=0;
            int flag=0;
            while(scann.hasNextLine()){
                c++;
                scann.nextLine();
            }
            String[] arr=new String[c];
            Scanner s2=new Scanner(f);
            for(int i=0;i<arr.length;i++){
                arr[i]=s2.nextLine();
            }
            System.out.println("Enter the Username:");
            String uname=sc.next();
            int x;
            for(int i=0;i<arr.length;i++){
                if(uname.equals(arr[i])){
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            //System.out.print(uname);
            if(flag==1){
                for(int i=0;i<arr.length;i++){
                    //System.out.println(arr[i]);
                    if(uname.equals(arr[i])){
                        System.out.println("The capatcha number is "+ i);
                        String [] data1=readFile1("password.txt");
                        //System.out.println(i);
                    }
                }
            }
            else{
                System.out.println("The user doesnot exist");
                System.out.println("if you are new click 1\n if you are already an existing user click 2");
                Scanner scan=new Scanner(System.in);
                int cho=scan.nextInt();
                if(cho==1){
                    String [] data=readFiles("username.txt");
                    System.out.println("Please login inorder to access the features of the software");
                    String[] data2=readFiles1("username.txt");
                }
                else{
                    String[] data2=readFiles1("username.txt");
                }
                //System.exit(0);
            }
            //System.out.println("User does not exist");
            /*for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }*/
            return arr;
        }
        catch(Exception ex){
            return null;
        }
    }
    public static String[] readFile1(String file){
        try{
            File f =new File(file);
            Scanner s=new Scanner(f);
            int c=0;
            int flag=0;
            while(s.hasNextLine()){
                c++;
                s.nextLine();
            }
            String[] arr=new String[c];
            Scanner s1=new Scanner(f);
            /*for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }*/
            File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\password.txt");
            System.out.println("Enter the captcha number:");
            int index=sca.nextInt();
            System.out.println("Enter the password:");
            String pass=sca.next();
            for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }
            //System.out.println(arr[index]);
            //File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\password.txt");
            if(arr[index].equals(pass)){
                System.out.println("You have succesfully login into the library management software");
            }
            else{
                System.out.println("Details doesn't match");
                System.out.println("Please login again");
                String[] data2=readFiles1("username.txt");
            }
            return arr;
        }
        catch(Exception e){
            return null;
        }
    }    public static String[] search(String file){// converting the data of the file into array and storing 
        try{
            File f =new File(file);
            Scanner scann=new Scanner(f);
            int c=0;
            int flag=0;
            while(scann.hasNextLine()){
                c++;
                scann.nextLine();
            }
            String[] arr=new String[c];
            Scanner s2=new Scanner(f);
            for(int i=0;i<arr.length;i++){
                arr[i]=s2.nextLine();
            }
            System.out.println("Enter the bookname:");
            String bname=sc.next();
            int x;
            for(int i=0;i<arr.length;i++){
                //System.out.println(arr[i]);
                if(bname.equals(arr[i])){//making sure the username is not repeated
                    flag=1;
                    System.out.println("The book is available");
                    System.out.println(i);
                    break;
                }
                else{
                    flag=0;
                }
            }
            if(flag==1){
                //System.out.println("The book is available");
                //System.out.println(i);
                    //System.out.println("The number of books available is ");
                String [] data1=search1("count.txt");
                    //System.out.println(i);
            }
            else{
                System.out.println("The book is not available so please tell us in the feedback form about the book you need");
            }
            //System.out.println("User does not exist");
            /*for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }*/
            return arr;
        }
        catch(Exception ee){
            return null;
        }
    }
    public static String[] search1(String file){
        try{
            File f =new File(file);
            Scanner s=new Scanner(f);
            int c=0;
            int flag=0;
            while(s.hasNextLine()){
                c++;
                s.nextLine();
            }
            String[] arr=new String[c];
            Scanner s1=new Scanner(f);
            /*for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }*/
            File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\count.txt");
            System.out.println("Please enter the number you view on screen :");
            int index=sca.nextInt();
            for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }
            System.out.println("The number of books available is "+arr[index]);
            int x=Integer.parseInt(arr[index]);
            if(x>0){
                System.out.println("The book is available ");
            }
            else if(x==1){
                System.out.println("The book is available and stock is about to complete");
            }
            else{
                System.out.println("The book is not available");
            }
            Scanner sc=new Scanner(System.in);
            System.out.println(" Do you want to search any other book? \nClick y to search other book and anything not to search");
            String c1=sc.next();
            if(c1.equals("y")){
               String [] data2=search("bookname.txt");
            }
            else{

            }

            return arr;
        }
        catch(Exception ex){
            return null;
        }
    }
    public static String[] reserve(String file){// converting the data of the file into array and storing 
        try{
            File f =new File(file);
            Scanner s=new Scanner(f);
            int c=0;
            int flag=0;
            while(s.hasNextLine()){
                c++;
                s.nextLine();
            }
            String[] arr=new String[c];
            Scanner s1=new Scanner(f);
            for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }
            System.out.println("Enter the bookname:");
            String uname=sc.next();
            //System.out.print(uname);
            for(int i=0;i<arr.length;i++){
                //System.out.println(arr[i]);
                if(uname.equals(arr[i])){//making sure the username is not repeated
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            if(flag==1){
                System.out.println("The book is in the library ");
                Scanner sca=new Scanner(System.in);
                System.out.println("Enter the roll number ");
                String fil=sca.next();
                System.out.println("Enter y if you want to reserve the book and anything to not to reserve");
                String res=sca.next();
                if(res.equals("y")){
                    File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\reservereport.txt");
                    write("The book " + uname + " has been reserved by "+ fil +"\n",fi);
                    System.out.println("The book " + uname + " has been reserved by "+fil);
                }
                else{
                    System.out.println(" The book has not been reserved");
                }
            }
            else{
                System.out.println("The book is not in the library.Please give us in the feedback form we will try to add the book");
            }
            //String [] data1=reserve("bookname.txt");
            //Scanner sc=new Scanner(System.in);
            System.out.println(" Do you want to reserve any other book? \nClick y to reserve other book and anything not to reserve");
            String c3=sc.next();
            if(c3.equals("y")){
                String [] data2=reserve("bookname.txt");
            }
            else{

            }

            return arr;
        }
        catch(Exception e){
            return null;
        }
    }
    /*public static void riter(String id,File fi)throws IOException{//creating a method to write the data to file
        FileWriter fw=new FileWriter(fi,true);
        PrintWriter pw=new PrintWriter(fw);
        fw.riter(id);
        fw.close();
    }*/
    //public static Scanner scan=new Scanner(System.in);
    public static String feedback(String file){
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the feedback you want to give:");
        String fil=sca.nextLine();
        File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\feedback.txt");
        //write(fil,fi);
        System.out.println("The feedback given by you is "+fil);
        return " ";
    }
    public static String[] adminname(String file){// converting the data of the file into array and storing 
        try{
            File f =new File(file);
            Scanner scann=new Scanner(f);
            int c=0;
            int flag=0;
            while(scann.hasNextLine()){
                c++;
                scann.nextLine();
            }
            String[] arr=new String[c];
            Scanner s2=new Scanner(f);
            for(int i=0;i<arr.length;i++){
                arr[i]=s2.nextLine();
            }
            System.out.println("Enter the name:");
            String uname=sc.next();
            int x;
            //System.out.print(uname);
            for(int i=0;i<arr.length;i++){
                //System.out.println(arr[i]);
                if(uname.equals(arr[i])){
                    System.out.println("The capatcha number is "+ i);
                    String [] data1=admin("admin.txt");
                    //System.out.println(i);
                }
            }
            //System.out.println("User does not exist");
            /*for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }*/
            return arr;
        }
        catch(Exception ex){
            return null;
        }
    }
    public static String[] admin(String file){
        try{
            File f =new File(file);
            Scanner s=new Scanner(f);
            int c=0;
            int flag=0;
            while(s.hasNextLine()){
                c++;
                s.nextLine();
            }
            String[] arr=new String[c];
            Scanner s1=new Scanner(f);
            /*for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }*/
            File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\admin.txt");
            System.out.println("Enter the captcha number:");
            int index=sca.nextInt();
            System.out.println("Enter the adminid:");
            String pass=sca.next();
            for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }
            //System.out.println(arr[index]);
            //File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\password.txt");
            if(arr[index].equals(pass)){
                System.out.println("You have succesfully login into the library management software as admin ");
            }
            else{
                System.out.println("Details doesn't match");
            }
            return arr;
        }
        catch(Exception e){
            return null;
        }
    }



    public static void main(String [] args)throws IOException{
        System.out.println( "welcome to VVIT LMS");
        System.out.println("Click 1 for SignUp \nClick 2 for LogIn");
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        switch(choice){
            case 1:
            String [] data=readFiles("username.txt");
            System.out.println("Please login inorder to access the features of the software");
              // System.out.println(Arrays.toString(data));
              //String [] data1=readFile("password.txt");
              //System.out.println(Arrays.toString(data));
            case 2:
            String[] data2=readFiles1("username.txt");
            break;
            /*System.out.println("Enter the usernmae:");
            String user=scan.next();
            System.out.println("Enter the password:");
            String pwd=scan.next();*/
        }
        System.out.println("Click 1 to search a book and for book availability \nClick 2 for reserving the book \nClick 3 for feedback \nClick 4 if you want to login as admin");
        Scanner sca=new Scanner(System.in);
        int choice1=sca.nextInt();
        switch(choice1){
            case 1:
            String [] data=search("bookname.txt");
            Scanner s=new Scanner(System.in);
            /*System.out.println(" Do you want to search any other book? \nClick y to search other book and anything not to search");
            String c1=s.next();
            if(c1.equals("y")){
               String [] data2=search("bookname.txt");
            }
            else{*/
                System.out.println("Do you want to reserve any book\nClick y to reserve and anything not to ");
                String c2=s.next();
                if(c2.equals("y")){
                    
                }
                else{
                    System.out.println("Do you want to give any feedback\nClick y to give feedback and anything not to ");
                    String c5=sc.next();
                    if(c5.equals("y")){
                        String data3=feedback("feedback.txt");
                    }
                    else{
                        System.out.println("If you want to login as admin please login again");
                        break;
                    }
                    break;
                }
            //}
            System.out.println("Enter the details of the book in order to reserve the book");
            case 2:
            String [] data1=reserve("bookname.txt");
            Scanner sc=new Scanner(System.in);
            /*System.out.println(" Do you want to reserve any other book? \nClick y to reserve other book and anything not to reserve");
            String c3=sc.next();
            if(c3.equals("y")){
                String [] data2=reserve("bookname.txt");
            }
            else{*/
            System.out.println("Do you want to give any feedback\nClick y to give feedback and anything not to ");
            String c5=sc.next();
            if(c5.equals("y")){
                    
            }
            else{
                System.out.println("If you want to login as admin please login again");
                break;
            }
           // }

            case 3:
            String data3=feedback("feedback.txt");
            Scanner sac=new Scanner(System.in);
            System.out.println("Do you want to login as admin\nClick y want to login and anything not to");
            String c4=sac.next();
            if(c4.equals("y")){

            }
            else{
                break;
            }
            case 4:
            String[] data5=adminname("names.txt");
            System.out.println("Click 1 to issue book \nClick 2 to return book \nClick 3 to add book");
            Scanner scann=new Scanner(System.in);
            int choice2=scann.nextInt();
            switch(choice2){
                case 1:
                System.out.println("you are here to issue book");
                break;
                case 2:
                System.out.println("you are here to update the details of returned book");
                break;
                case 3:
                System.out.println("you are here to add a new book");
                break;
            }

        }
        System.out.println("Logging out of the account ");
        System.out.println("Thanks for using VVIT LMS");
    }    
}