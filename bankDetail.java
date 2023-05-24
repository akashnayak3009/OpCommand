class BankAccount{
    static String bankName;
    static String branchName;
    static String ifsc;
    
    long accNum;
    String accHName;
    double balance;
    
    static void setBankDetails(String bankN, String branchN, String ifs ){
        bankName = bankN;
        branchName = branchN;
        ifsc = ifs;
    }
    void setBankAccountDetails(long accN, String accHN, double bal){
        accNum = accN;
        accHName = accHN;
        balance = bal;
    }
    void deposit(double amt){
        balance = balance + amt;
    }
    void withdraw(double amt){
        balance = balance - amt;
    }
    void currentBalance(){
        System.out.println(balance);
    }
    static void bankName(){
        System.out.println(bankName);
    }
    static void branchName(){
        System.out.println(branchName);
    }
    static void ifsc(){
        System.out.println(ifsc);
    }
    void display(){
        System.out.println("bankName\t\t"+ bankName);
        System.out.println("branchName\t"+ branchName);
        System.out.println("ifsc\t\t"+ ifsc);
        System.out.println("accNum\t\t"+ accNum);
        System.out.println("accHName\t\t"+ accHName);
        System.out.println("balance\t\t"+ balance);
    }
}

class bankDetail{
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        System.out.println("\nacc1 object details");
        acc1.display();

        System.out.println("\nacc2 object details");
        acc2.display();
        
        BankAccount.setBankDetails("HDFC","ameerpet", "HD125am");
        
        System.out.println("\nacc1 object details");
        acc1.display();

        System.out.println("\nacc2 object details");
        acc2.display();

        acc1.setBankAccountDetails(1234,"HK", 25000);

        System.out.println("\nacc1 object details");
        acc1.display();

        System.out.println("\nacc2 object details");
        acc2.display();
        
        acc2.setBankAccountDetails(5678,"AK", 50000);

        System.out.println("\nacc1 object details");
        acc1.display();

        System.out.println("\nacc2 object details");
        acc2.display();

        acc1.setBankDetails("icici", "Sr nagar", "ifsc155");

        System.out.println("\nacc1 object details");
        acc1.display();

        System.out.println("\nacc2 object details");
        acc2.display();
        
        acc1.deposit(7000);
        System.out.println("\nacc1 object details");
        acc1.display();

        System.out.println("\nacc2 object details");
        acc2.display();

        acc2.withdraw(5000);

        System.out.println("\nacc1 object details");
        acc1.display();

        System.out.println("\nacc2 object details");
        acc2.display();
    }   
}