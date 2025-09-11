class CarRunner{
public static void main(String [] args){

Car car=new Car();
int id=car.displayId();
System.out.println(id);
String name=car.displayName();
System.out.println(name);
char code=car.displayCode();
System.out.println(code); 
float length=car.displayLength();
System.out.println(length);
double price=car.displayPrice();
System.out.println(price);
boolean electric=car.displayElectric();
System.out.println(electric);
long number=car.displayNumber();
System.out.println(number);
}}