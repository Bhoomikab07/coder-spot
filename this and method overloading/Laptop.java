class Laptop{
public Laptop(){
this(100);
}
public Laptop(int price){
this("ipad",100000);
System.out.println("price="+price);
}
public Laptop(String brand,int price){
this(200002,"lenove",true);
System.out.println("brand="+brand);
System.out.println("price="+price);
}
public Laptop(int price,String name,boolean isWorking){
this(20000,"lenove",5.5,'A');
System.out.println("price="+price);
System.out.println("name="+name);
System.out.println("isWorking="+isWorking);
}
public Laptop(int price,String brand,double review,char qulity){
System.out.println("price="+price);
System.out.println("brand="+brand);
System.out.println("review="+review);
System.out.println("qulity="+qulity);
}
}