import java.io.Console;
import java.util.Scanner;
class Test16{
    public static void main(String[] args){
     Scanner sc = new Scanner (System.in);
     Console cns = System.console();
     System.out.println("sno");
     int sno=sc.nextInt();

     System.out.println("enter name");
     String name3 = cns.readLine();

     System.out.println("course");
     String course= cns.readLine();

     System.out.println("password");
     char[] pwd =cns.readPassword();
     
     System.out.println("sno:   "+ sno);
     System.out.println("sname:  " + name3);
     System.out.println("course:   "+ course);
     System.out.println("password:   " + new String(pwd));
    }
}