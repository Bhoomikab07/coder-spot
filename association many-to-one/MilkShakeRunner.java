class MilkShakeRunner{

public static void main(String [] args){

DryFruits dryFruits=new DryFruits("Pista",'A');
IceCream iceCream=new IceCream("butterScoch",50);
Sugar sugar=new Sugar(2,false);
MilkShake milkShake=new MilkShake(60,"OreoMilkShake",dryFruits,iceCream,sugar);
milkShake.displayMilkShakeDetails();
}
}