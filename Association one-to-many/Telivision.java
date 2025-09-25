class Telivision{

public int price;
public String name;
public Electricity electricity;

public Telivision(int price,String name,Electricity electricity){

this.price=price;
this.name=name;
this.electricity=electricity;
}
public void displayTelivision(){

System.out.println("price="+price+","+"name="+name);
System.out.println("electricity bill="+electricity.electricityBill+","+"is dangerous="+electricity.isDangerous);
}
}