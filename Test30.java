// class Test30{
//     int x=10;
//     void m1(){
//         System.out.println("m1");

//     }
//     void printXY(){
//         System.out.println(this.x);
//         m1();
//     }
//     public static void main (String args[]){
//         Test30 t1 =new Test30();
//         t1.printXY();
//     }
// }
 


// class Test30{
//     int x =10;
//     int y =20;
    
//     void m1(){
//         Test30 t1 =new Test30();
//         t1.x=50;
//         t1.y=60;
//     }
//     public static void main (String[] args){
//         Test30 t2 =new Test30();
//         System.out.println(t2.x + " " +t2.y);
//         t2.m1();
//         System.out.println(t2.x + " " +t2.y);
//     }
// }

// class Test30{
//     int x =10;
//     public static void main(String[] args){
//         Test30 t1 = new Test30();
//         Test30 t2 = new Test30();
//         Test30 t3 = t2;

//         t2.x = 70;

//         System.out.println(t1.x);
//         System.out.println(t2.x);
//         System.out.println(t3.x);

//     }
// }

class Test30{
    int x;
    void m1(Test30 t1){
        x = x+1;

        t1.x = t1.x + 3;
    }
    public static void main(String[] args){
        Test30 t1 = new Test30();
        Test30 t2 = new Test30();

        t1.m1(t2);
        System.out.println(t1.x);
        System.out.println(t2.x);

        t2.m1(t1);
        System.out.println(t1.x);
        System.out.println(t2.x);

        t1.m1(t1);
        System.out.println(t1.x);
        System.out.println(t2.x);

        t2.m1(t2);
        System.out.println(t1.x);
        System.out.println(t2.x);
    }
}
































