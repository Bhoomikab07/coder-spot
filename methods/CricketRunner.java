class CricketRunner{
public static void main(String [] args)
{
  
  int number=Cricket.playerNumber();
  System.out.println(number);
  
  int player=Cricket.totalPlayer();
  System.out.println(player);
  
  int value=Cricket.batValue();
  System.out.println(value);
  
  int balls=Cricket.numberOfBalls();
  System.out.println(balls);
  
  int over=Cricket.totalOver();
  System.out.println(over);
  
 }
 }