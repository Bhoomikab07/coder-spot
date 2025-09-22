class Employees{

public String employeeName;
public int salary;
public Office office;

public Employees(String employeeName,int salary,Office office){

this.employeeName=employeeName;
this.salary=salary;
this.office=office;

}
public void displayEmployees(){

System.out.println("employee name="+employeeName+","+"employee salary="+salary);
System.out.println("number of employees="+office.noOfEmployees+","+"office name="+office.officeName);
}
}