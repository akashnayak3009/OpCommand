// class A{
//     int x =10;

//     void m1(){
//         A a1 = new A();
//         System.out.println(a1.x);
//     }
// }

// class Test27{
//     public static void main(String[] args){
//           A a1 = new A();
//           a1.x= 15;
//           a1.m1();

//             A a2 = new A();
//             a2.x =18;
//             a2.m1();
//     }
// }
// class Test27{
//     int x =50;
//     public static void main(String[] args){
//         System.out.println(new Test27().x);
//     }
// }

    // class Example{
    //     int x;
    //     int y;
    //     public  static void m1(){
    //         Example e1 = new Example();
    //         Example e2 = new Example();
    //         e1.x = 10;
    //         e1.y = 20;

    //         System.out.println(e1.x);
    //         System.out.println(e1.y);

    //         e2.x = 30;
    //         e2.y = 40;

    //         System.out.println(e2.x);
    //         System.out.println(e2.y);

    //         e1.x = 15;
    //         e1.y = 16;

    //         System.out.println(e1.x);
    //         System.out.println(e1.y); 

    //         e2.x = 18;
    //         e2.y = 19;

    //         System.out.println(e2.x);
    //         System.out.println(e2.y);
    //     }
    // }
    // class Test27{
    //     public static void main(String[] args){
    //       Example.m1();
    //     }
    // }
        import java.util.Scanner;
    // class Example{
    //     int x;
    //     int y;
    //     void set (int p , int q){
    //         x=p;
    //         y=q;
    //     }
    //     void display(){
    //         System.out.println(x);
    //         System.out.println(y);
    //     }
    // }
    // class Test27{
    //     public static void main(String[] args){
    //         Example e1 = new Example();
    //         Example e2 = new Example();

    //         e1.set(15 ,16);
    //         e2.set(18,19);

    //         e1.display();
    //         e2.display();

    //         e1.set(10 , 20);
    //         e2.set(30,40);

    //         e1.display();
    //         e2.display();
    //     }
    // // }
    // class Example{
    //     int x;
    //     int y;
    //     void set (int p , int q){
    //         x=p;
    //         y=q;
    //     }
    //     void display(){
    //         System.out.println(x);
    //         System.out.println(y);
    //     }
    // }
    // class Test27{
    //     public static void main(String[] args){
    //         Example e1 = new Example();
    //         Example e2 = new Example();

    //         Scanner sc = new Scanner (System.in);

    //         System.out.println("type values");

    //         e1.set(sc.nextInt(),sc.nextInt());
    //         e2.set(sc.nextInt(),sc.nextInt());

    //         System.out.println("Your values are:");

    //         e1.display();
    //         e2.display();
    //     }
    // }
    
    class Example{
        int x;
        int y;
        void set (int x , int y){
            this.x=x;
            this.y=y;
        }
        void display(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    class Test27{
        public static void main(String[] args){
            Example e1 = new Example();
            Example e2 = new Example();

            Scanner sc = new Scanner (System.in);

            System.out.println("type values");

            e1.set(sc.nextInt(),sc.nextInt());
            e2.set(sc.nextInt(),sc.nextInt());

            System.out.println("Your values are:");

            e1.display();
            e2.display();
        }
    }