class WaterHeater
{

public int price;
public char qualityGrade;
public Electricity electricity;

public WaterHeater(int price,char qualityGrade,Electricity electricity){
this.price=price;
this.qualityGrade=qualityGrade;
this.electricity=electricity;
}
public void displayWaterHeater(){

System.out.println("price="+price+","+"qualityGrade="+qualityGrade);
System.out.println("electricity bill="+electricity.electricityBill+","+"is dangerous="+electricity.isDangerous);
}
}