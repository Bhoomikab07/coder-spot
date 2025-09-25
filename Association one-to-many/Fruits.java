class Fruits{

public String fruitColor;
public char fruitQuality;
public Vegitables vegitables;

public Fruits(String fruitColor,char fruitQuality,Vegitables vegitables){

this.fruitColor=fruitColor;
this.fruitQuality=fruitQuality;
this.vegitables=vegitables;
}
public void displayFruits(){

System.out.println("fruitColor="+fruitColor+","+"fruitQuality="+fruitQuality);
System.out.println("vegitables name="+vegitables.name+","+"vegitables price="+vegitables.price);
}
}