class Sofa{

public boolean isLeather;
public int price;
public House house;

public Sofa(boolean isLeather,int price,House house){

this.isLeather=isLeather;
this.price=price;
this.house=house;
}
public void displaySofa()
{
System.out.println("sofa isLeather="+isLeather+","+"sofa price="+price);
System.out.println("floorNumber="+house.floorNumber+","+"rentPrice="+house.rentPrice);
}
}