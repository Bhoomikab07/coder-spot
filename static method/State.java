class State{
public static int population;
public static long pinCode;
public static boolean isCoastal;
public static char stateCode;
public static float area;
public static double literacyRate;
public static String name;
 
 public static void state(){
  
  System.out.println("total population of a state="+population);
  population=65877;
  System.out.println("total population of a state="+population);
  
  System.out.println("state pinCode="+pinCode);
  pinCode=12338l;
  System.out.println("state pinCode"+pinCode);
  
  System.out.println("it is coastal area="+isCoastal);
  isCoastal=true;
  System.out.println("it is coastal="+isCoastal);
  
  System.out.println("stateCode="+stateCode);
  stateCode='C';
  System.out.println("stateCode="+stateCode);
  
  
  System.out.println("the total area of a state="+area);
  area=6567.7f;
  System.out.println("the total area of a state="+area);
  
  System.out.println("the total literacyRate="+literacyRate);
  literacyRate=6787.0;
  System.out.println("the total literacyRate="+literacyRate);
  
  System.out.println("name of the state="+name);
 name="Goa";
  System.out.println("name of the state="+name);
  }

}