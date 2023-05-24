class Example{
    static int a = 50;
    static void m1(){
        int a =50;
    }
    static void m2(){
        System.out.println("from m2 a:" + a);
    }
}
class Test18{
    public static void main(String[] args){
         System.out.println("original value");
         System.out.println("from mm a:" + Example.a);
         Example.m2();
         Example.m2();
         Example.a = 60;
         System.out.println("\n after modifying value in mm ");
         System.out.println("from mm a: " + Example.a);
         Example.m2();
    }
}