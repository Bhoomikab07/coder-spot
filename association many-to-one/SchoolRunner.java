class SchoolRunner{

public static void main(String [] args){


Students students=new Students(200,'A');
Teachers teachers=new Teachers("Radha",254353664l);
Principal principal=new Principal(50,50000.0);
School school=new School("Oxford school",10,students,teachers,principal);

school.displaySchoolDetails();
}
}