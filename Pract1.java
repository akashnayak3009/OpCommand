// class Pract1{
//     public static void main(String[] args){
//        int x;
//        try{
//         x=10;
//         System.out.println(x);
//        }
//        catch(ArithmeticException e){
//         System.out.println(x);
//        }
//        finally{
//         System.out.println(x);
//        }
//        System.out.println(x)
        
//     }
// }
// class Pract1{
    // public static void main(String[] args){
        // int x;
        // try{
            // x=10;
            // System.out.println(x);
        // }
        // catch(ArithmeticException e){
            // System.out.println(x);
            // System.out.println("not acess");
            // 
        // }
        // System.out.println(x);
        // }
    // }
// 
// class Pract1{
    // public static void main(String[]args){
    //    try{
        // System.out.println(50/0);
    //    }
    //    catch(ArithmeticException e){
        // e.printStackTrace();
        // System.out.println("==========================");
        // System.out.println(e.toString());
        // System.out.println("=================");
        // System.out.println(e.getMessage());
    //    }
    // }
// }
// 
class Pract1{

    static void validate(int a) throws IllegalArgumentException{
    throw new IllegalArgumentException("For fun");
}

    public static void main(String[] args){
        try{
            validate(5);
        }
        catch(IllegalArgumentException e){
            e.printStackTrace(); 
        }
    }
}

























































