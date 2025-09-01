class UniversityRunner
{
  public static void main(String [] args)
  {
  int []students = {234,54657,7887};
  int []total = University.numberOfStudents(students);
  
   for(int number=0; number<students.length; number++)
   {
   System.out.println(students[number]);
   }
   char []letter = {'U','N','K'};
   char []value = University.firstLetter(letter);
   
   for(int lettervalue=0; lettervalue<letter.length; lettervalue++)
   {
	   System.out.println(letter[lettervalue]);
   }
   long []books = {65676l,9878646l,566547l,};
   long [] average = University.libraryBooks(books);
   
   for(int totalcount=0; totalcount<books.length; totalcount++)
   {
	   System.out.println(books[totalcount]);
   }
   float []GPA = {2.2f,7.4f,3.5f};
   float [] universityGPA = University.averageGPA(GPA);
   
   for(int rate=0; rate<GPA.length; rate++)
   {
	   System.out.println(GPA[rate]);
   }
   boolean [] recognized = {true,true,true};
   boolean [] isRecognized = University.isRecognized(recognized);
   for(int governmentRecognized=0; governmentRecognized<recognized.length; governmentRecognized++)
   {
	   System.out.println(recognized[governmentRecognized]);
	   }
	   double[] budget = {123.345,1243.34,2432.5};
	   double [] totalBudget = University.universityBudget(budget);
	   for (int cost=0; cost<budget.length; cost++)
	   {
		   System.out.println(budget[cost]);
	   }
	   String []name = {"bengaluru university","kuvempu university","mysore university"};
	   String [] nameUniversity = University.universityName(name);
	   for(int nameOfUniversity=0; nameOfUniversity<name.length; nameOfUniversity++)
	   {
		   System.out.println(name[nameOfUniversity]);
		   
	   }
  }


}