import java.util.Scanner;
class findNumber{
    void isGreat(int x, int y){
        if(x>y){
            System.out.println("This is greater"+x);
        }
        else if(x==y){
            System.out.println("both are equal");
        }
        else if(x<y){
            System.out.println("This  is smaller"+y);
        }
        else{
            System.out.println("invalid");
        }
    }
}
class Test7{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Type first number");
        int a=sc.nextInt();
        System.out.println("Type second number");
        int b=sc.nextInt();
        findNumber a1=new findNumber();
        a1.isGreat(a,b);
    }
}