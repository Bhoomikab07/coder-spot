class Vegitables{
public Vegitables()
{
this(250);
}
public Vegitables(int price)
{
this(120,"tomoto");
System.out.println("the tomoto constructor with price="+price);
}
public Vegitables(int price,String vegitablesName)
{
this(160,"tomoto",false);
System.out.println("in Vegitables class:"+price);
System.out.println("in Vegitables class:"+vegitablesName);
}
public Vegitables(int price,String vegitablesName,boolean isGood )
{
System.out.println("the Vegitables is good");
}
}