class Bottles{
public Bottles()
{
this(20);
}
public Bottles(int price)
{
this(50,"Milton");
System.out.println("the Bottles constructor with price="+price);
}
public Bottles(int price,String bottlesName)
{
this(100,"milton",true);
System.out.println("in Bottles class:"+price);
System.out.println("in Bottles class:"+bottlesName);
}
public Bottles(int price,String bottlesName,boolean isGood )
{
System.out.println("the Bottles is good");
}
}