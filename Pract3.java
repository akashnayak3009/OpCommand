class Pract3{

    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("try proper no");
        }
        finally{
            System.out.println("I am totally getting executed");
        }
        System.out.println("I am totally out of world");
    }
}