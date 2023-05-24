class Test19{
    
    static int c=m1();
    static int m1(){
        System.out.println("sv1 c");
        return 30;
    }
    static{
        System.out.println("sb 1");
    }
    public static void main(String[] args){
        System.out.println("main method execution");
    }
static int a =m1();
}