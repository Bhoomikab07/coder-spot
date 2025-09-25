class Appu extends Hero
{
public int appuAge;
public String heroName;
public long heroNumber;
public float heroHeight;
public double movieTicket;
public char heroGender;
public boolean isFamous;


public Appu(){
System.out.println("this is non arguement constructor");
}

public Appu(int appuAge,String heroName,long heroNumber,float heroHeight,double movieTicket,char heroGender,boolean isFamous)
{
super();

this.appuAge=appuAge;
this.heroName=heroName;
this.heroNumber=heroNumber;
this.heroHeight=heroHeight;
this.movieTicket=movieTicket;
this.heroGender=heroGender;
this.isFamous=isFamous;
}

public void displayAppu(){

System.out.println("appu age=="+this.appuAge);
System.out.println("hero name=="+this.heroName);
System.out.println("hero number=="+this.heroNumber);
System.out.println("hero height=="+this.heroHeight);
System.out.println("movie ticket price=="+this.movieTicket);
System.out.println("hero gender=="+this.heroGender);
System.out.println("hero is a famous=="+this.isFamous);
}
}