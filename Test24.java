// class Test24{
//     int m=60;
//     int n=70;

//     public static void main(String[] args){
        
//        Test24 t1 = new Test24();

//         System.out.println(t1.m);
//         System.out.println(t1.n);

//         t1.m=100;
//         t1.n=200;

//         System.out.println(t1.m);
//         System.out.println(t1.n);
//     }
// }
class A{ int x = 10;}
class Example{
    static A a1 = new A();
    A a2 = new A();
    void m1( A a3){
        A a4 = new A();
    }
}
class Test24{
     
    public static void main(String[] args){
        Example e1 = new Example();
        A a5 = new A();
        e1.m1(a5);

    }
}