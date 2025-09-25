class Chair{

public boolean isWooden;
public int price;
public House house;

public Chair(boolean isWooden,int price,House house){

this.isWooden=isWooden;
this.price=price;
this.house=house;
}
public void displayChair(){

System.out.println("chair isWooden="+isWooden+","+"chair price="+price);
System.out.println("floorNumber="+house.floorNumber+","+"rentPrice="+house.rentPrice);
}
}