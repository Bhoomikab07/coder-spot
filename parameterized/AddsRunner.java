class AddsRunner
{

public static void main(String [] args)
{
int duration = Adds.totalDuration(5);
System.out.println(duration);

String name = Adds.nameOfAdd("perfume");
System.out.println(name);

long viewers = Adds.totalNumberOfViewers(1234l);
System.out.println(viewers);

float ratings = Adds.viewersRatings(3.1f);
System.out.println(ratings);

double cost = Adds.totalCostOfAdd(259.54);
System.out.println(cost);

boolean telivisionAdd = Adds.isItTelivisionAdd(true);
System.out.println(telivisionAdd);

char grade = Adds.addShowGrade('A');
System.out.println(grade);
}
}