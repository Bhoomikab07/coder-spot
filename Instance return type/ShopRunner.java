class ShopRunner{
public static void main(String [] args){

Shop shop=new Shop();
int id=shop.displayId();
System.out.println(id);
float area=shop.displayArea();
System.out.println(area);
double distance=shop.displayDistance();
System.out.println(distance);
char code=shop.displayCode();
System.out.println(code);
boolean commercial=shop.displayIsCommercial();
System.out.println(commercial);
String name=shop.displayName();
System.out.println(name);
long number=shop.displayNumber();
System.out.println(number);
}
}