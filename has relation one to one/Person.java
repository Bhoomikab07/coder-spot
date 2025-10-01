class Person{

public String personName;
public int personAge;
public PassPort passPort;

public Person(String personName,int personAge,PassPort passPort){

this.personName=personName;
this.personAge=personAge;
this.passPort=passPort;

}
public void displayPerson(){


System.out.println("person name="+personAge+","+"person age="+personAge);
System.out.println("passPort number="+passPort.passPortNumber+","+"passport price="+passPort.passPortPrice);

}
}