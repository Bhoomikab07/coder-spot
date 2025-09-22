class OfficeRunner{

public static void main(String [] args){

Office office=new Office(100,"Infotech");
Office name= new Office(150,"Info");
Office value=new Office(50,"techno");
Employees employees=new Employees("Akash",15000,name);
Manager manager=new Manager(2354356l,25000,office);
HR hr=new HR("Arun",20000,value);

employees.displayEmployees();
manager.displayManager();
hr.displayHRDetails();
}
}
