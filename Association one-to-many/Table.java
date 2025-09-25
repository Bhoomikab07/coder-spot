class Table{

public int price;
public boolean isWooden;
public House house;

public Table(int price,boolean isWooden,House house){

this.price=price;
this.isWooden=isWooden;
this.house=house;
}
public void displayTable(){

System.out.println("table price="+price+","+"table isWooden="+isWooden);
System.out.println("floorNumber="+house.floorNumber+","+"rentPrice="+house.rentPrice);
}
}