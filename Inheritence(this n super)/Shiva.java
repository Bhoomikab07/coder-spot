class Shiva extends God{

public int followers;
public String godName;
public float godHeight;
public long godAge;
public double godPower;
public char godSymbol;
public boolean isImmortal;

public Shiva(){
System.out.println("this non arguement constructor");
}
public Shiva(int followers,String godName,float godheight,long godAge,double godPower,char godSymbol,boolean isImmortal)
{
super();
this.followers=followers;
this.godName=godName;
this.godHeight=godHeight;
this.godAge=godAge;
this.godPower=godPower;
this.godSymbol=godSymbol;
this.isImmortal=isImmortal;
}
public  void displayShiva(){

System.out.println("god followers=="+this.followers);
System.out.println("god name=="+this.godName);
System.out.println("god height=="+this.godHeight);
System.out.println("god age=="+this.godAge);
System.out.println("god power=="+this.godPower);
System.out.println("god symbol=="+this.godSymbol);
System.out.println("is Immortal=="+this.isImmortal);


System.out.println("god followers=="+super.followers);
System.out.println("god name=="+super.godName);
System.out.println("god height=="+super.godHeight);
System.out.println("god age=="+super.godAge);
System.out.println("god power=="+super.godPower);
System.out.println("god symbol=="+super.godSymbol);
System.out.println("is Immortal=="+super.isImmortal);



}
}
