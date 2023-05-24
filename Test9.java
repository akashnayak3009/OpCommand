class Example{
//   private static void m1() It can be private or non private to access.
static void m1()

{
        System.out.println("access from m1");
    }
    static void m2(){
        System.out.println("access from m2");
    }
    static void m3(){
        m1();
    }
   
}
class Test9{
    public static void main(String[] args){
        Example.m1();
        Example.m2();
        Example.m3();
    }
    }
   