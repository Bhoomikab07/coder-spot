class Shoes{
public static int price;
public static String brandName;
public static long length;
public static float rating;
public static double weight;
public static boolean isGood;
public static char quality;

public Shoes(int price,String brandName,long length,float rating,double weight,boolean isGood,char quality)
{
System.out.println("inside class="+this.price);
System.out.println("inside class="+this.brandName);
System.out.println("inside class="+this.length);
System.out.println("inside class="+this.rating);
System.out.println("inside class="+this.weight);
System.out.println("inside class="+this.isGood);
System.out.println("inside class="+this.quality);

this.price = price;
this.brandName = brandName;
this.length = length;
this.rating = rating;
this.weight = weight;
this.isGood = isGood;
this.quality = quality;

System.out.println("inside class="+this.price);
System.out.println("inside class="+this.brandName);
System.out.println("inside class="+this.length);
System.out.println("inside class="+this.rating);
System.out.println("inside class="+this.weight);
System.out.println("inside class="+this.isGood);
System.out.println("inside class="+this.quality);

}
}