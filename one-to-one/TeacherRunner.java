class TeacherRunner{

public static void main(String [] args){

Student student=new Student("Bc123",50);
Teacher teacher=new Teacher("Radha",15000,student);
teacher.displayTeacherDetails();
}
}