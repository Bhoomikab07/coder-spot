class PersonRunner
{
	public static void main(String [] ref)
	{
		Person person= new Person();
		person.displayPerson(23);
		person.displayPerson(23,"Bhoomika");
		person.displayPerson(23,"Bhoomika",678923456789l);
		person.displayPerson(23,"Bhoomika",678923456789l,97.45f);
		person.displayPerson(23,"Bhoomika",678923456789l,97.45f,24000);
		person.displayPerson(23,"Bhoomika",678923456789l,97.45f,24000,'F');
		person.displayPerson(23,"Bhoomika",678923456789l,97.45f,24000,'F',true);
	}
}