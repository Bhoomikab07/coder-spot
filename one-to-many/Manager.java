class Manager{

public long managerNumber;
public int managerSalary;
public Office office;
public Manager(long managerNumber,int managerSalary,Office office){

this.managerNumber=managerNumber;
this.managerSalary=managerSalary;

this.office=office;
}
public void displayManager(){
System.out.println("manager Number="+managerNumber+","+"manager Salary="+managerSalary);
System.out.println("number of employees="+office.noOfEmployees+","+"office name="+office.officeName);
}
}