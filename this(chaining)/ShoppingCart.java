class ShoppingCart{
public ShoppingCart(){

this(500);
}
public ShoppingCart(int price){

this(500,"Cloth");
System.out.println("the total price="+price);
}
public ShoppingCart(int price,String name){

this(500,"cloth",544667l);
System.out.println("the total price="+price);
System.out.println("the cart name="+name);
}
public ShoppingCart(int price,String name,long paymentId){

this(600,"bangles",46476777l,50.0f);
System.out.println("the total price="+price);
System.out.println("the cart name="+name);
System.out.println("the payment Id="+paymentId);
}
public ShoppingCart(int price,String name,long paymentId,float discount){

this(700,"cloth",4353564l,50.0f,'C');
System.out.println("the total price="+price);
System.out.println("the cart name="+name);
System.out.println("the paymentId="+paymentId);
System.out.println("the total discount="+discount);
}
public ShoppingCart(int price,String name,long paymentId,float discount,char currency){

this(800,"dress",5464667l,20.0f,'C',false);
System.out.println("the total price="+price);
System.out.println("the cart name="+name);
System.out.println("the paymentId="+paymentId);
System.out.println("the total discount="+discount);
System.out.println("the currency="+currency);
}
public ShoppingCart(int price,String name,long paymentId,float discount,char currency,boolean isPaid){

this(900,"dress",554648l,40.0f,'C',true,6565.78);
System.out.println("the total price="+price);
System.out.println("the cart name="+name);
System.out.println("the paymentId="+paymentId);
System.out.println("the total discount="+discount);
System.out.println("the currency="+currency);
System.out.println("is paid="+isPaid);
}

public ShoppingCart(int price,String name,long paymentId,float discount,char currency,boolean isPaid,double totalAmount){
System.out.println("the total price="+price);
System.out.println("the cart name="+name);
System.out.println("the paymentId="+paymentId);
System.out.println("the total discount="+discount);
System.out.println("the currency="+currency);
System.out.println("is paid="+isPaid);
System.out.println("the total amount="+totalAmount);
}
}
