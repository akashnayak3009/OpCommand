class Student{
    int Sno;
    String sname;
    String course;
    double fee;
}
class Example{
    static void m1(){
        Student s1= new Student();
        s1.Sno=10;
        s1.sname="akash";
        s1.course="java";
        s1.fee=1000;
        System.out.println(s1.Sno+" "+s1.sname+" "+s1.course+" "+s1.fee);
    }
    static Student m2(){
        Student s2=new Student();
        s2.Sno=102;
        s2.sname="kumar";
        s2.course="web";
        s2.fee=5000;
        return s2;
    }
}
class Test11{
    public static void main(String[] args){
        Example.m1();
        Example.m2();
        Student s3=Example.m2();
        System.out.println(Example.m2());
    }
}