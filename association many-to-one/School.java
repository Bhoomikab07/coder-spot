class School{

public String schoolName;
public int noOfClsRooms;
public Students students;
public Teachers teachers;
public Principal principal;
public School(String schoolName,int noOfClsRooms,Students students,Teachers teachers,Principal principal){


this.schoolName=schoolName;
this.noOfClsRooms=noOfClsRooms;
this.students=students;
this.teachers=teachers;
this.principal=principal;
}
public void displaySchoolDetails(){

System.out.println("school name="+schoolName+","+"number of class rooms="+noOfClsRooms);
System.out.println("total number Students="+students.noOfStudents+","+"students grade="+students.studentGrade);
System.out.println("teachers name="+teachers.teacherName+","+"teachers phone number="+teachers.phnNumber);
System.out.println("Principal age="+principal.principalAge+","+"principal salary="+principal.principalSalary);
}
}