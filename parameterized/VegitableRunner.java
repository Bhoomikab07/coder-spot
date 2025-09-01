class VegitableRunner{

public static void main(String [] args)
{
int number = Vegitable.numberOfVegitable(21);
System.out.println(number);

String name = Vegitable.nameOfVegitables("potato");
System.out.println(name);

long phnNumber = Vegitable.sellerNumber(8987576453l);
System.out.println(phnNumber);

float ratings = Vegitable.vegitableRatings(3.1f);
System.out.println(ratings);

double rent = Vegitable.shopRent(5500.54);
System.out.println(rent);

boolean good = Vegitable.isVegitableGood(true);
System.out.println(good);

char grade = Vegitable.vegitableGrade('B');
System.out.println(grade);
}




}