class Books{
public static int price;
public static String name;
public static long bookNumber;
public static float rating;
public static double cost;
public static boolean isGood;
public static char quality;

public Books(int price,String name,long bookNumber,float rating,double cost,boolean isGood,char quality)
{
System.out.println("inside class="+this.price);
System.out.println("inside class="+this.name);
System.out.println("inside class="+this.bookNumber);
System.out.println("inside class="+this.rating);
System.out.println("inside class="+this.cost);
System.out.println("inside class="+this.isGood);
System.out.println("inside class="+this.quality);

this.price = price;
this.name = name;
this.bookNumber = bookNumber;
this.rating = rating;
this.cost = cost;
this.isGood = isGood;
this.quality = quality;

System.out.println("inside class="+this.price);
System.out.println("inside class="+this.name);
System.out.println("inside class="+this.bookNumber);
System.out.println("inside class="+this.rating);
System.out.println("inside class="+this.cost);
System.out.println("inside class="+this.isGood);
System.out.println("inside class="+this.quality);

}
}