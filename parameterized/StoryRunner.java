class StoryRunner
{

public static void main(String [] args)
{
int readers = Story.totalReaders(500);
System.out.println(readers);

String title = Story.storyTitle("Kingdom");
System.out.println(title);

long copies = Story.totalCopies(1235l);
System.out.println(copies);

float average = Story.averageReaders(27.1f);
System.out.println(average);

double ratings = Story.ratings(3.5344);
System.out.println(ratings);

boolean happyEnding = Story.hasHappyEnding(true);
System.out.println(happyEnding);

char code = Story.code('U');
System.out.println(code);
}
}