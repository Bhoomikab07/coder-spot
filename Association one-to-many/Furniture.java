class Furniture{

public char qualityGrade;
public int price;
public House house;

public Furniture(char qualityGrade,int price,House house){

this.qualityGrade=qualityGrade;
this.price=price;
this.house=house;
}
public void displayFurniture(){

System.out.println("furniture qualityGrade="+qualityGrade+","+" furniture price="+price);
System.out.println("floorNumber="+house.floorNumber+","+"rentPrice="+house.rentPrice);
}
}