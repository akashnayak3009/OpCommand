import java.util.Scanner;
class Test4
{
    float calculate(int bs)
    {
        return bs+(0.93F*bs)+(0.63F*bs);
    }
}
class Salary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bSal");
        int bsal=sc.nextInt();
        if(bsal>=12000)
        {
            Test4 a1=new Test4();
            float totSal=a1.calculate(bsal);
            System.out.println(bsal);
            System.out.println(totSal);
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}