class PersonRunner{

public static void main(String [] args){


PassPort passPort=new PassPort(4356567676l,1000);
Person person=new Person("Bhoomi",23,passPort);
person.displayPerson();
}
}