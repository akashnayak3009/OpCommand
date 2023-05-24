import java.util.Scanner;
class Even{
    void isEven( int n){
        if(n%2==0){
            System.out.println("Its even");
        }
        else{
            System.out.println("Its odd");
        }
    }
}
class Test6{  
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("type your number");
    int num=sc.nextInt();
    Even a1 =new Even();
    a1.isEven(num);
}
}
  
