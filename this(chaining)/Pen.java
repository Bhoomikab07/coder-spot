class Pen{
public Pen(){

this(50);
}
public Pen(int price){

this(50,"Cello");
System.out.println("the total price="+price);
}
public Pen(int price,String name){

this(50,"cello",544667l);
System.out.println("the total price="+price);
System.out.println("the pen name="+name);
}
public Pen(int price,String name,long penSerialNumber){

this(60,"Cello",464767l,5456.8f);
System.out.println("the total price="+price);
System.out.println("the pen name="+name);
System.out.println("the penSerialNumber="+penSerialNumber);
}
public Pen(int price,String name,long penSerialNumber,float discount){

this(70,"cello",4353564l,50.0f,'P');
System.out.println("the total price="+price);
System.out.println("the pen name="+name);
System.out.println("the penSerialNumber="+penSerialNumber);
System.out.println("the total discount="+discount);
}
public Pen(int price,String name,long penSerialNumber,float discount,char penGrade){

this(80,"cello",5464667l,20.0f,'C',false);
System.out.println("the total price="+price);
System.out.println("the pen name="+name);
System.out.println("the penSerialNumber="+penSerialNumber);
System.out.println("the total discount="+discount);
System.out.println("the penGrade="+penGrade);
}
public Pen(int price,String name,long penSerialNumber,float discount,char penGrade,boolean isAvailable){

this(90,"cello",554648l,40.0f,'C',true,100.78);
System.out.println("the total price="+price);
System.out.println("the pen name="+name);
System.out.println("the penSerialNumber="+penSerialNumber);
System.out.println("the total discount="+discount);
System.out.println("the penGrade="+penGrade);
System.out.println("is Available="+isAvailable);
}

public Pen(int price,String name,long penSerialNumber,float discount,char penGrade,boolean isAvailable,double totalAmount){
System.out.println("the total price="+price);
System.out.println("the pen name="+name);
System.out.println("the penSerialNumber="+penSerialNumber);
System.out.println("the total discount="+discount);
System.out.println("the penGrade="+penGrade);
System.out.println("is Available="+isAvailable);
System.out.println("the total amount="+totalAmount);
}
}
