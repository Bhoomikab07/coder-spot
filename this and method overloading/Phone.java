class Phone{
public Phone(){
this(100);
}
public Phone(int price){
this("ipad",100000);
System.out.println("price="+price);
}
public Phone(String brand,int price){
this(200002,"onePlus",true);
System.out.println("brand="+brand);
System.out.println("price="+price);
}
public Phone(int price,String name,boolean isWorking){
this(20000,"oppo",5.5,'A');
System.out.println("price="+price);
System.out.println("name="+name);
System.out.println("isWorking="+isWorking);
}
public Phone(int price,String brand,double review,char qulity){
System.out.println("price="+price);
System.out.println("brand="+brand);
System.out.println("review="+review);
System.out.println("qulity="+qulity);
}
}