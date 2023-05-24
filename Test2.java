import java.util.Scanner;
class Test2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("English mark:");
        float English=sc.nextFloat();
        System.out.println("Maths mark:");
        float Maths=sc.nextFloat();
        System.out.println("Hindi mark:");
        float Hindi=sc.nextFloat();
        System.out.println("GK mark:");
        float GK=sc.nextFloat();
        System.out.println("Scince mark:");
        float Science=sc.nextFloat();
        System.out.println("History mark:");
        float History=sc.nextFloat();
        float totalMarks=English+Maths+Hindi+GK+History+Science;
        System.out.println("total marks:"+ totalMarks);
        float per=totalMarks/6;
        System.out.println("percentage"+per);
    }
}