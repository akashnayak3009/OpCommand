import java.io.*;
class Test5{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter first no");
        int a=Integer.parseInt(br.readLine());
      
        System.out.println("enter second no");
        int b=Integer.parseInt(br.readLine());
       
        System.out.println(a+b);
    }
}
    
