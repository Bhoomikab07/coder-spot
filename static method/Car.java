class Car{
public static int year;
public static long number;
public static boolean isElectric;
public static char grade;
public static float licesense;
public static double price;
public static String name;
 
 public static void car(){
  
  System.out.println("manufactured year"+year);
  year=2022;
  System.out.println("recent manufactured"+year);
  
  System.out.println("car number"+number);
  number=254354l;
  System.out.println("car number"+number);
  
  System.out.println("electric car="+isElectric);
  isElectric=true;
  System.out.println("electric car="+isElectric);
  
  System.out.println("the grade of a car="+grade);
  grade='A';
  System.out.println("the grade of a car="+grade);
  
  
  System.out.println("the car licesense number="+licesense);
  licesense=465.22f;
  System.out.println("the car licesense number="+licesense);
  
  System.out.println("the total price of a car="+price);
  price=58.000;
  System.out.println("the total price of a car="+price);
  
  System.out.println("name of the car="+name);
  name="BMW";
  System.out.println("name of the car="+name);
  }

}