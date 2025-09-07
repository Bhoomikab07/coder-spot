class Mobiles{
public static int price;
public static String name;
public static long number;
public static float rating;
public static double cost;
public static boolean isGood;
public static char quality;

public Mobiles(int price,String name,long number,float rating,double cost,boolean isGood,char quality)
{
System.out.println("inside class="+this.price);
System.out.println("inside class="+this.name);
System.out.println("inside class="+this.number);
System.out.println("inside class="+this.rating);
System.out.println("inside class="+this.cost);
System.out.println("inside class="+this.isGood);
System.out.println("inside class="+this.quality);

this.price = price;
this.name = name;
this.number = number;
this.rating = rating;
this.cost = cost;
this.isGood = isGood;
this.quality = quality;

System.out.println("inside class="+this.price);
System.out.println("inside class="+this.name);
System.out.println("inside class="+this.number);
System.out.println("inside class="+this.rating);
System.out.println("inside class="+this.cost);
System.out.println("inside class="+this.isGood);
System.out.println("inside class="+this.quality);

}
}