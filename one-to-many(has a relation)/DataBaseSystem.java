class DataBaseSystem{

public char subjectCode;
public int noOfstudents;
public ComputerScience computerScience;

public DataBaseSystem(char subjectCode,int noOfstudents,ComputerScience computerScience){

this.subjectCode=subjectCode;
this.noOfstudents=noOfstudents;
this.computerScience=computerScience;
}
public void displayDataBaseSystem(){

System.out.println("subject Code="+subjectCode+","+"number of students="+noOfstudents);
System.out.println("it is a practical subject="+computerScience.isPracticalSubject+","+"subject code="+computerScience.subjectCode);
}
}