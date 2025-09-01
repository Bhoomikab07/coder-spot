class FootBallRunner{
public static void main(String [] args)
{
  
  int duration=FootBall.gameDuration();
  System.out.println(duration);
  
  int teams=FootBall.numberOfTeams();
  System.out.println(teams);
  
  int players=FootBall.totalPlayers();
  System.out.println(players);
  
  int year=FootBall.startedYear();
  System.out.println(year);
  
  int rules=FootBall.totalRules();
  System.out.println(rules);
  
 }
 }