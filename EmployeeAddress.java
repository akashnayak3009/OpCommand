
class EmployeeAddress{
String hNo,streetName,city,pinCode;
void getAddress(){
System.out.println("houseNo" + hNo);
System.out.println("streetname" + streetName);
System.out.println("city" + city);
System.out.println("pinCode" + pinCode);
}
   public static void main(String[] args){
EmployeeAddress ea1 = new EmployeeAddress();
ea1.hNo="547";
ea1.streetName="velkam";
ea1.city="hyderabad";
ea1.pinCode="8982";
ea1.getAddress();
}
}


