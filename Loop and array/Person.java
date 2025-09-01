class Person{
public static void main(String [] args){

    char female = 'F';
	char male = 'M';
	
	char []Person = {female,male};
	System.out.println(Person[1]);
	
	System.out.println("display the gender of a person");
	
	for (int gender=0; gender<Person.length; gender++){
	System.out.println(Person [gender]);
	}
	}}