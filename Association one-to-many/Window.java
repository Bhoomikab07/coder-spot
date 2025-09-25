class Window{

public float size;
public boolean isGlass;
public House house;

public Window(float size,boolean isGlass,House house){

this.size=size;
this.isGlass=isGlass;
this.house=house;
}
public void displayWindow(){

System.out.println(" window size="+size+","+"isGlass="+isGlass);
System.out.println("floorNumber="+house.floorNumber+","+"rentPrice="+house.rentPrice);
}
}