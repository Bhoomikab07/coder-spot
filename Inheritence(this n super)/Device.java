class Device extends ElectronicDevice{

public int price;
public String deviceName;
public float screenSize;
public long serialNumber;
public double processorSpeed;
public char grade;
public boolean isSmart;

public Device(){
System.out.println("this non arguement constructor");
}
public Device(int price,String deviceName,float screenSize,long serialNumber,double processorSpeed,char grade,boolean isSmart)
{
super();
this.price=price;
this.deviceName=deviceName;
this.screenSize=screenSize;
this.serialNumber=serialNumber;
this.processorSpeed=processorSpeed;
this.grade=grade;
this.isSmart=isSmart;
}
public  void displayDevice(){

System.out.println("device price=="+this.price);
System.out.println("device name=="+this.deviceName);
System.out.println("screenSize=="+this.screenSize);
System.out.println("god serialNumber=="+this.serialNumber);
System.out.println("god processorSpeed=="+this.processorSpeed);
System.out.println("god grade=="+this.grade);
System.out.println("is smart=="+this.isSmart);


System.out.println("device price=="+super.price);
System.out.println("device name=="+super.deviceName);
System.out.println("screenSize=="+super.screenSize);
System.out.println("god serialNumber=="+super.serialNumber);
System.out.println("god processorSpeed=="+super.processorSpeed);
System.out.println("god grade=="+super.grade);
System.out.println("is smart=="+super.isSmart);





}
}
