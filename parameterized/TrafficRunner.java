class TrafficRunner
{

public static void main(String [] args)
{
int duration = Traffic.totalDuration(2);
System.out.println(duration);

String name = Traffic.roadName("MG road");
System.out.println(name);

long people = Traffic.numberOfPeopleStuckInTraffic(1564l);
System.out.println(people);

float speed = Traffic.averageSpeed(34.1f);
System.out.println(speed);

double rate = Traffic.accidentRate(2.3455);
System.out.println(rate);

boolean greenLight = Traffic.isGreenLight(true);
System.out.println(greenLight);

char code = Traffic.lineCode('A');
System.out.println(code);
}
}