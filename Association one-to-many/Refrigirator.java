class Refrigirator{

public String refrigiratorName;
public int price;
public Electricity electricity;

public Refrigirator(String refrigiratorName,int price,Electricity electricity){

this.refrigiratorName=refrigiratorName;
this.price=price;
this.electricity=electricity;
}
public void displayRefrigirator(){

System.out.println("Refrigirator name="+refrigiratorName+","+"price="+price);
System.out.println("electricity bill="+electricity.electricityBill+","+"is dangerous="+electricity.isDangerous);
}
}