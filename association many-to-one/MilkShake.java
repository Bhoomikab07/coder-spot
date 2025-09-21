class MilkShake{

public int milkShakePrice;
public String milkShakeName;
public DryFruits dryFruits;
public IceCream iceCream;
public Sugar sugar;

public MilkShake(int milkShakePrice,String milkShakeName,DryFruits dryFruits,IceCream iceCream,Sugar sugar){

this.milkShakePrice=milkShakePrice;
this.milkShakeName=milkShakeName;
this.dryFruits=dryFruits;
this.iceCream=iceCream;
this.sugar=sugar;
}
public void displayMilkShakeDetails(){

System.out.println("milkShake Price="+milkShakePrice+","+"milkShake Name="+milkShakeName);
System.out.println("DryFruits name="+dryFruits.dryFruitName+","+"dryFruitsQuality="+dryFruits.dryFruitQuality);
System.out.println("IceCream name="+iceCream.iceCreamName+","+"iceCream price="+iceCream.iceCreamPrice);
System.out.println("number of spoon sugar="+sugar.noOfSpoons+","+"is sugar less="+sugar.isSugarLess);
}
}