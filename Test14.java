class Student{
    int sno;
    String sname;
    String course;
    double fee;
    String email;
    long mobile;
    char gender;
    boolean courseCompleted;
}
class Test14{
    public static void main(String[] args){
      Student s1 = new Student();
      System.out.println("student instance is created \n for storing given student value");
      System.out.println("Reading value from command line and storing in this studing instance\n");
      s1.sno=Integer.parseInt(args[0]);
      s1.sname=args[1];
      s1.course=args[2];
      s1.fee=Double.parseDouble(args[3]);
      s1.email=args[4];
      s1.mobile=Long.parseLong(args[5]);
      s1.gender=args[6].charAt(0);
      s1.courseCompleted=Boolean.parseBoolean(args[7]);
      System.out.println("student object value");
      System.out.println("sno:\t\t"+s1.sno );
      System.out.println("sname:\t\t"+ s1.sname);
      System.out.println("course:\t\t"+ s1.course);
      System.out.println("fee:\t\t"+ s1.fee );
      System.out.println("email:\t\t"+ s1.email );
      System.out.println("mobile:\t\t"+ s1.mobile );
      System.out.println("gender:\t\t"+ s1.gender );
      System.out.println("course com\t"+ s1.courseCompleted );
    }
}