class ForestRunner{
public static void main(String [] args){

Forest forest=new Forest();
int id=forest.displayId();
System.out.println(id);
String name=forest.displayName();
System.out.println(name);
float area=forest.displayArea();
System.out.println(area);
double distance=forest.displayDistance();
System.out.println(distance);
char code=forest.displayCode();
System.out.println(code); 
boolean dangerous=forest.displayDangerous();
System.out.println(dangerous);
}}