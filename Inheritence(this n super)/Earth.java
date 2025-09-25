class Earth extends Planet{

public int diameterOfPlanet;
public String planetName;
public float orbitPeriod;
public long distanceFromSun;
public double planetMass;
public char planetGrade;
public boolean isHalfLife;

public Earth(){
System.out.println("this non arguement constructor");
}
public Earth(int diameterOfPlanet,String planetName,float orbitPeriod,long distanceFromSun,double planetMass,char planetGrade,boolean isHalfLife)
{
super();
this.diameterOfPlanet=diameterOfPlanet;
this.planetName=planetName;
this.orbitPeriod=orbitPeriod;
this.distanceFromSun=distanceFromSun;
this.planetMass=planetMass;
this.planetGrade=planetGrade;
this.isHalfLife=isHalfLife;
}
public  void displayEarth(){

System.out.println("diameterOfPlanet=="+this.diameterOfPlanet);
System.out.println("planetName=="+this.planetName);
System.out.println("orbitPeriod=="+this.orbitPeriod);
System.out.println("distanceFromSun=="+this.distanceFromSun);
System.out.println("planetMass=="+this.planetMass);
System.out.println("planetGrade=="+this.planetMass);
System.out.println("isHalfLife=="+this.isHalfLife);


System.out.println("diameterOfPlanet=="+super.diameterOfPlanet);
System.out.println("planetName=="+super.planetName);
System.out.println("orbitPeriod=="+super.orbitPeriod);
System.out.println("distanceFromSun=="+super.distanceFromSun);
System.out.println("planetMass=="+super.planetMass);
System.out.println("planetGrade=="+super.planetMass);
System.out.println("isHalfLife=="+super.isHalfLife);



}
}
