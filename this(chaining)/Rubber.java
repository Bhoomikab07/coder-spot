class Rubber{
public Rubber(){

this(50);
}
public Rubber(int price){

this(30,"Doms");
System.out.println("the total price="+price);
}
public Rubber(int price,String name){

this(3,"Doms",544667l);
System.out.println("the total price="+price);
System.out.println("the rubber name="+name);
}
public Rubber(int price,String name,long rubberSerialNumber){

this(5,"Doms",464767l,5456.8f);
System.out.println("the total price="+price);
System.out.println("the rubber name="+name);
System.out.println("the rubberSerialNumber="+rubberSerialNumber);
}
public Rubber(int price,String name,long rubberSerialNumber,float discount){

this(90,"Doms",4353564l,50.0f,'P');
System.out.println("the total price="+price);
System.out.println("the pen name="+name);
System.out.println("the rubberSerialNumber="+rubberSerialNumber);
System.out.println("the total discount="+discount);
}
public Rubber(int price,String name,long rubberSerialNumber,float discount,char rubberGrade){

this(8,"Doms",5464667l,20.0f,'C',false);
System.out.println("the total price="+price);
System.out.println("the pencil name="+name);
System.out.println("the rubberSerialNumber="+rubberSerialNumber);
System.out.println("the total discount="+discount);
System.out.println("the rubberGrade="+rubberGrade);
}
public Rubber(int price,String name,long rubberSerialNumber,float discount,char rubberGrade,boolean isAvailable){

this(10,"Doms",554648l,40.0f,'C',true,100.78);
System.out.println("the total price="+price);
System.out.println("the rubber name="+name);
System.out.println("the rubberSerialNumber="+rubberSerialNumber);
System.out.println("the total discount="+discount);
System.out.println("the rubberGrade="+rubberGrade);
System.out.println("is Available="+isAvailable);
}

public Rubber(int price,String name,long rubberSerialNumber,float discount,char rubberGrade,boolean isAvailable,double totalAmount){
System.out.println("the total price="+price);
System.out.println("the rubber name="+name);
System.out.println("the rubberSerialNumber="+rubberSerialNumber);
System.out.println("the total discount="+discount);
System.out.println("the rubberGrade="+rubberGrade);
System.out.println("is Available="+isAvailable);
System.out.println("the total amount="+totalAmount);
}
}
