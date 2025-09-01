class HometownRunner
{

public static void main(String [] args)
{
int number = Hometown.numberOfPopulation(700);
System.out.println(number);

String name = Hometown.nameOfHometown("shimoga");
System.out.println(name);

long travellers = Hometown.totalTravellersToHometown(89875l);
System.out.println(travellers);

float rate = Hometown.literacyRate(2.1f);
System.out.println(rate);

double size = Hometown.areaSizeOfHometown(5500.54);
System.out.println(size);

boolean touristPlace = Hometown.isHometownTouristPlace(true);
System.out.println(touristPlace);

char grade = Hometown.hometownGrade('B');
System.out.println(grade);
}
}