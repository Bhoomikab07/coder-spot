class Passenger{
public static int age;
public static long adharNo;
public static boolean hasReserved;
public static char gender;
public static float weight;
public static double ticketPrice;
public static String name;
 
 public static void passenger(){
  
  System.out.println("passenger age="+age);
  age=25;
  System.out.println("passenger age="+age);
  
  System.out.println("adharNo of a passenger="+adharNo);
  adharNo=123434l;
  System.out.println("adharNo of a passenger"+adharNo);
  
  System.out.println("reserved seat="+hasReserved);
  hasReserved=true;
  System.out.println("reserved seat="+hasReserved);
  
  System.out.println("gender of a passenger="+gender);
  gender='M';
  System.out.println("gender of a passenger="+gender);
  
  
  System.out.println("weight of a person="+weight);
  weight=57.78f;
  System.out.println("weight of a person="+weight);
  
  System.out.println("the total ticketPrice for a person="+ticketPrice);
  ticketPrice=500.0;
  System.out.println("the total ticketPrice for a person="+ticketPrice);
  
  System.out.println("name of the passenger="+name);
  name="Ram";
  System.out.println("name of the passenger="+name);
  }

}