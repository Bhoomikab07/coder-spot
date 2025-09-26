class Accessories{

public String accessoriesName;
public int accessoriesPrice;
public WardRobe wardRobe;

public Accessories(String accessoriesName,int accessoriesPrice,WardRobe wardRobe){

this.accessoriesName=accessoriesName;
this.accessoriesPrice=accessoriesPrice;
this.wardRobe=wardRobe;
}
public void displayAccessories(){

System.out.println("accessories Name="+accessoriesName+","+"accessories Price="+accessoriesPrice);
System.out.println("wardrobe price="+wardRobe.wardRobePrice+","+"wardRobe height="+wardRobe.wardRobeHeight);
}
}