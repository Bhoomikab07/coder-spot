class CelebritiesRunner
{

public static void main(String [] args)
{
int instagramFollowers = Celebrities.followersOnInstagram(237);
System.out.println(instagramFollowers);

String name = Celebrities.celebrityName("Sudeep");
System.out.println(name);

long income = Celebrities.income(5778l);
System.out.println(income);

float height = Celebrities.celebrityHeight(6.1f);
System.out.println(height);

double ratings = Celebrities.ratings(2.34);
System.out.println(ratings);

boolean married = Celebrities.isMarried(true);
System.out.println(married);

char letter = Celebrities.firstLetter('S');
System.out.println(letter);
}
}