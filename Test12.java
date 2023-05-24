import java.util.Scanner;
class Example{
    static void m1(int a, int b){
        int c=a+b;
        System.out.println("your sum is :"+c);
    }
}

class Test12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("type ur first no");
        int num1=sc.nextInt();
        System.out.println("type ur second no");
        int num2=sc.nextInt();
        Example.m1(num1,num2);
    }
}