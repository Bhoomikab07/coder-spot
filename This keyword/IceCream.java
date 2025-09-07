class IceCream{
public IceCream()
{
this(100);
}
public IceCream(int price)
{
this(150,"DBC");
System.out.println("the IceCream constructor with price="+price);
}
public IceCream(int price,String iceCreamName)
{
this(150,"DBC",true);
System.out.println("in IceCream class:"+price);
System.out.println("in IceCream class:"+iceCreamName);
}
public IceCream(int price,String iceCreamName,boolean isGood )
{
System.out.println("the iceCream is good");
}
}