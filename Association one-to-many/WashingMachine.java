class WashingMachine{

public String name;
public int price;
public Electricity electricity;

public WashingMachine(String name,int price,Electricity electricity){

this.name=name;
this.price=price;
this.electricity=electricity;
}
public void displayWashingMachine(){

System.out.println("name="+name+","+"price="+price);
System.out.println("electricity bill="+electricity.electricityBill+","+"is dangerous="+electricity.isDangerous);
}
}