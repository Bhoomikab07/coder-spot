class Cloths{
public static int price;
public static String name;
public static long serialNumber;
public static float rating;
public static double cost;
public static boolean isGood;
public static char grade;

public Cloths(int price,String name,long serialNumber,float rating,double cost,boolean isGood,char grade)
{
System.out.println("inside class="+this.price);
System.out.println("inside class="+this.name);
System.out.println("inside class="+this.serialNumber);
System.out.println("inside class="+this.rating);
System.out.println("inside class="+this.cost);
System.out.println("inside class="+this.isGood);
System.out.println("inside class="+this.grade);

this.price = price;
this.name = name;
this.serialNumber = serialNumber;
this.rating = rating;
this.cost = cost;
this.isGood = isGood;
this.grade = grade;

System.out.println("inside class="+this.price);
System.out.println("inside class="+this.name);
System.out.println("inside class="+this.serialNumber);
System.out.println("inside class="+this.rating);
System.out.println("inside class="+this.cost);
System.out.println("inside class="+this.isGood);
System.out.println("inside class="+this.grade);

}
}