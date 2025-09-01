class StudentPhoneNumber{
public static void main(String [] args){
   long ram = 45675766779l;
   long raj = 89878675634l;
   long jhon = 89786445322l;
   
   long [] StudentPhoneNumber = {ram,raj,jhon};
   System.out.println(StudentPhoneNumber);
   
   System.out.println("display student phone number");
   
   for (int number=0; number<StudentPhoneNumber.length; number++){
   System.out.println(StudentPhoneNumber [number]);
   }
  }}