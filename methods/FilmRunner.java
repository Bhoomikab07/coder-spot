class FilmRunner{
public static void main(String [] args)
{
  
  int date=Film.filmReleaseDate();
  System.out.println(date);
  
  int hero=Film.numberOfHero();
  System.out.println(hero);
  
  int age=Film.heroAge();
  System.out.println(age);
  
  int time=Film.filmTime();
  System.out.println(time);
  
  int hours=Film.totalHours();
  System.out.println(hours);
  
 }
 }