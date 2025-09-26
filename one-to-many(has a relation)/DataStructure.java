class DataStructure{

public char subjectCode;
public boolean isPractical;
public ComputerScience computerScience;

public DataStructure(char subjectCode,boolean isPractical,ComputerScience computerScience){

this.subjectCode=subjectCode;
this.isPractical=isPractical;
this.computerScience=computerScience;
}
public void displayDataStructure(){

System.out.println("subject code="+subjectCode+","+"it is practical="+isPractical);
System.out.println("it is a practical subject="+computerScience.isPracticalSubject+","+"subject code="+computerScience.subjectCode);
}
}