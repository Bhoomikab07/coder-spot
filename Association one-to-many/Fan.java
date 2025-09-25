class Fan{

public String fanName;
public float fanRating;
public Electricity electricity;

public Fan(String fanName, float fanRating,Electricity electricity){

this.fanName=fanName;
this.fanRating=fanRating;
this.electricity=electricity;
}
public void displayFan(){

System.out.println("fan name="+fanName+","+"fanRating="+fanRating);
System.out.println("electricity bill="+electricity.electricityBill+","+"is dangerous="+electricity.isDangerous);
}
}