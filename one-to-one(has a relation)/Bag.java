class Bag{

public String bagName;
public int bagPrice;
public Pen pen;

public Bag(String bagName,int bagPrice,Pen pen){

this.bagName=bagName;
this.bagPrice=bagPrice;
this.pen=pen;
}
public void displayBag(){

System.out.println("name of the bag="+bagName+","+"bag price="+bagPrice);
System.out.println("name of the pen="+pen.penName+","+"pen price="+pen.penPrice);
}
}