import java.util.Scanner;
class Test3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("type ur no");
        int no=sc.nextInt();
        
        if(no%2==0){
            System.out.println("Its even");
        }
        else{
            System.out.println("Its odd");
        }
    }
}