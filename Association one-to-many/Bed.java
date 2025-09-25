class Bed{

public double length;
public float size;
public House house;

public Bed(double length,float size,House house){

this.length=length;
this.size=size;
this.house=house;
}
public void displayBed(){

System.out.println(" bed length="+length+","+" bed size="+size);
System.out.println(" house floorNumber="+house.floorNumber+","+"rentPrice="+house.rentPrice);
}
}