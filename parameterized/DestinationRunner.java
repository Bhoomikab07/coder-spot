class DestinationRunner
{

public static void main(String [] args)
{
int visitors = Destination.numberOfVisitors(750);
System.out.println(visitors);

String name = Destination.destinationName("Taj Mahal");
System.out.println(name);

long lifeTime = Destination.lifeTimeVisitors(76687l);
System.out.println(lifeTime);

float fees = Destination.entryFees(499.0f);
System.out.println(fees);

double latitude = Destination.latitude(27.5344);
System.out.println(latitude);

boolean open = Destination.isOpen(true);
System.out.println(open);

char code = Destination.zoneCode('A');
System.out.println(code);
}
}