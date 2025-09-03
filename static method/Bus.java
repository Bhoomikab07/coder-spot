class Bus{
public static int busNumber;
public static long registration;
public static boolean isAc;
public static char routeCode;
public static float fuelCapacity;
public static double ticketPrice;
public static String busName;
 
 public static void bus(){
  
  System.out.println("bus number="+busNumber);
  busNumber=13123;
  System.out.println("bus number="+busNumber);
  
  System.out.println("registration="+registration);
  registration=767878l;
  System.out.println("registration"+registration);
  
  System.out.println("bus is AC="+isAc);
  isAc=true;
  System.out.println("bus is AC="+isAc);
  
  System.out.println("the bus routeCode="+routeCode);
  routeCode='R';
  System.out.println("the bus routeCode="+routeCode);
  
  
  System.out.println("the bus fuelCapacity="+fuelCapacity);
  fuelCapacity=123.66f;
  System.out.println("the bus fuelCapacity="+fuelCapacity);
  
  System.out.println("the total ticketPrice of a bus="+ticketPrice);
  ticketPrice=25.0;
  System.out.println("the total ticketPrice of a bus="+ticketPrice);
  
  System.out.println("name of the bus="+busName);
  busName="KSRTC";
  System.out.println("name of the car="+busName);
  }

}