class DramaRunner
{

public static void main(String [] args)
{
int viewers = Drama.totalViewers(590);
System.out.println(viewers);

String name = Drama.dramaName("RomeoJuliet");
System.out.println(name);

long income = Drama.totalIncome(56789l);
System.out.println(income);

float duration = Drama.episodeDuration(42.1f);
System.out.println(duration);

double ratings = Drama.ratings(2.5658);
System.out.println(ratings);

boolean onGoing = Drama.isOnGoing(true);
System.out.println(onGoing);

char certificate = Drama.ratingsCertificate('U');
System.out.println(certificate);
}
}