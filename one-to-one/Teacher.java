class Teacher{

public String teacherName;
public int teacherSalary;
public Student batch;

public Teacher(String teacherName,int teacherSalary,Student batch){

this.teacherName=teacherName;
this.teacherSalary=teacherSalary;
this.batch=batch;
}
public void displayTeacherDetails(){

System.out.println("teacher name="+teacherName+","+"teacher salary="+teacherSalary);
System.out.println("student batch name="+batch.batchName+","+"total number of students="+batch.totalStudents);
}
}