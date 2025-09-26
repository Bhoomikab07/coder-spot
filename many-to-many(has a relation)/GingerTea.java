class GingerTea{
public String shopName;
public Sugar sugar;
public Milk milk;
public TeaPowder teapowder;

public GingerTea(String shopName,Sugar sugar,Milk milk,TeaPowder teapowder){
this.shopName=shopName;
this.sugar=sugar;
this.milk=milk;
this.teapowder=teapowder;
}
public void  displayGingerTea(){
System.out.println("shopName="+shopName);
System.out.println("sugar="+sugar.price);
System.out.println("milk="+milk.brand);
System.out.println("teapowder="+teapowder.isGood);
}
}