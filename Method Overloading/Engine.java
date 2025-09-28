class Engine{

public void displayEngine(String modelName){
System.out.println("engine model name=="+modelName);

}
public void displayEngine(String modelName,int price){
System.out.println("engine model name=="+modelName);
System.out.println("engine price=="+price);
}
public void displayEngine(String modelName,int price,long serialNumber){
System.out.println("engine model name=="+modelName);
System.out.println("engine price=="+price);
System.out.println("serial number=="+serialNumber);
}
public void displayEngine(String modelName,int price,long serialNumber,float displacement){
System.out.println("engine model name=="+modelName);
System.out.println("engine price=="+price);
System.out.println("serial number=="+serialNumber);
System.out.println("displacement=="+displacement);
}
public void displayEngine(String modelName,int price,long serialNumber,float displacement,double efficiency){
System.out.println("engine model name=="+modelName);
System.out.println("engine price=="+price);
System.out.println("serial number=="+serialNumber);
System.out.println("displacement=="+displacement);
System.out.println("efficiency of a engine=="+efficiency);
}
public void displayEngine(String modelName,int price,long serialNumber,float displacement,double efficiency,char fuelGrade){
System.out.println("engine model name=="+modelName);
System.out.println("engine price=="+price);
System.out.println("serial number=="+serialNumber);
System.out.println("displacement=="+displacement);
System.out.println("efficiency of a engine=="+efficiency);
System.out.println("engine fuel grade=="+fuelGrade);
}
public void displayEngine(String modelName,int price,long serialNumber,float displacement,double efficiency,char fuelGrade,boolean isCharged){
System.out.println("engine model name=="+modelName);
System.out.println("engine price=="+price);
System.out.println("serial number=="+serialNumber);
System.out.println("displacement=="+displacement);
System.out.println("efficiency of a engine=="+efficiency);
System.out.println("engine fuel grade=="+fuelGrade);
System.out.println("it is charged=="+isCharged);
}
}