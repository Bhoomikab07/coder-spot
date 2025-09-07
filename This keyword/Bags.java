class Bags{
public Bags()
{
this(600);
}
public Bags(int price)
{
this(600,"Globus");
System.out.println("the Bags constructor with price="+price);
}
public Bags(int price,String bagsName)
{
this(1000,"Globus",true);
System.out.println("in Bags class:"+price);
System.out.println("in Bags class:"+bagsName);
}
public Bags(int price,String bagsName,boolean isGood )
{
System.out.println("the Bags is good");
}
}