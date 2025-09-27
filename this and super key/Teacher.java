class Teacher extends Persons{

public int teacherAge;
public String teacherName;
public float teacherHeight;
public long teacherNumber;
public double teacherSalary;
public char teacherGender;
public boolean isGovernmentTeacher;


public Teacher(){
System.out.println("this non arguement constructor");
}
public Teacher(int teacherAge,String teacherName,float teacherHeight,long teacherNumber,double teacherSalary,char teacherGender,boolean isGovernmentTeacher)
{
super();
super.teacherAge=teacherAge;
super.teacherName=teacherName;
super.teacherHeight=teacherHeight;
super.teacherNumber=teacherNumber;
super.teacherSalary=teacherSalary;
super.teacherGender=teacherGender;
super.isGovernmentTeacher=isGovernmentTeacher;

this.teacherAge=teacherAge;
this.teacherName=teacherName;
this.teacherHeight=teacherHeight;
this.teacherNumber=teacherNumber;
this.teacherSalary=teacherSalary;
this.teacherGender=teacherGender;
this.isGovernmentTeacher=isGovernmentTeacher;

}
public  void displayTeacher(){

System.out.println(teacher Age=="+this.teacherAge);
System.out.println("teacher name=="+this.teacherName);
System.out.println("teacher Height=="+this.teacherHeight);
System.out.println("teacher number=="+this.teacherNumber);
System.out.println("teacher salary=="+this.teacherSalary);
System.out.println("teacher gender=="+this.teacherGender);
System.out.println("he is a goverment teacher=="+this.isGovernmentTeacher);

System.out.println(teacher Age=="+super.teacherAge);
System.out.println("teacher name=="+super.teacherName);
System.out.println("teacher Height=="+super.teacherHeight);
System.out.println("teacher number=="+super.teacherNumber);
System.out.println("teacher salary=="+super.teacherSalary);
System.out.println("teacher gender=="+super.teacherGender);
System.out.println("he is a goverment teacher=="+super.isGovernmentTeacher);
}
}
