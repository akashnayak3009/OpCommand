class Example{
    String Sno, sname,course,fee;
    void Akash(){
        System.out.println("Akash Details");
        System.out.println("Sno:"+Sno);
        System.out.println("sname:"+sname);
        System.out.println("course:"+course);
        System.out.println("fee:"+fee);
    }
    void Papu(){
        System.out.println("papu Details");
        System.out.println("Sno:"+Sno);
        System.out.println("sname:"+sname);
        System.out.println("course:"+course);
        System.out.println("fee:"+fee);
    }
    public static void main(String[] args){
        Example ak =new Example();
        ak.Sno="1";
        ak.sname="akash";
        ak.course="java";
        ak.fee="500";
        ak.Akash();
        Example pa = new Example();
        pa.Sno="2";
        pa.sname="papu";
        pa.course="web";
        pa.fee="200";
        pa.Papu();
    }
}
