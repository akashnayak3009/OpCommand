class Example{
    static void m1(){
        System.out.println("Declared by m1");
    }
    void m2(){
        System.out.println("Declarred by m2");
    }
    void m3(){
        int p=10;
        System.out.println(p);
    }
    void m4(int p){
        System.out.println(p);
    }
}
class Test8{
    public static void main(String[] args){
        Example.m1();
        Example a1=new Example();
        a1.m2();
        a1.m3();
    }
}