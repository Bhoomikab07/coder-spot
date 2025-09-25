class Grocery{

public int price;
public char groceryQuality;
public Vegitables vegitables;

public Grocery(int price,char groceryQuality,Vegitables vegitables){

this.price=price;
this.groceryQuality=groceryQuality;
this.vegitables=vegitables;
}
public void displayGrocery(){

System.out.println("Grocery price="+price+","+"groceryQuality="+groceryQuality);
System.out.println("vegitables name="+vegitables.name+","+"vegitables price="+vegitables.price);
}
}