class Test17{
    static int a;
    static int b;

    static void m1(){
         a=10;
         b=20;
    }
    static void m2(int x, int y){
        a=x;
        b=y;
    }
    static void m3(int a, int b){
        a=a;
        b=b;
    }
    static void m4(int a, int b){
        Test17.a=a;
        Test17.b=b;
    }

    public static void main(String[] args){
        System.out.println(a + "  " + b);

        m1();
        System.out.println(a + "  " + b);

        m2(30, 40);
        System.out.println(a + "  " + b);

        m3(50, 60);
        System.out.println(a + "  " + b);
        
        m4(70, 80);
        System.out.println(a + "  " + b);
    }

}
    