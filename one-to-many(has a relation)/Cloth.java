class Cloth{

public String clothColor;
public int noOfCloths;
public WardRobe wardRobe;

public Cloth(String clothColor,int noOfCloths,WardRobe wardRobe){

this.clothColor=clothColor;
this.noOfCloths=noOfCloths;
this.wardRobe=wardRobe;


}
public void displayCloth(){

System.out.println("cloth color="+clothColor+","+"number of cloth="+noOfCloths);
System.out.println("wardrobe price="+wardRobe.wardRobePrice+","+"wardRobe height="+wardRobe.wardRobeHeight);
}
}
