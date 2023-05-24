class Exam{
    Exam(){
        System.out.println("first one");
    }
    Exam(int x,int y){
        System.out.println("the value of x:" +x);
        System.out.println("the  value of y:" + y);
    }
    Exam(int a,int b,int c){
        System.out.println("the value of a:" + a);
        System.out.println("the  value of b:" + b);
        System.out.println("the  value of c:" + c);
    }
}
class Test10{
    public static void main(String[] args){
        Exam ob1=new Exam(); 
        Exam ob2=new Exam(11,12); 
        Exam ob3=new Exam(13, 14, 15); 
    }
}