class India extends Country{

public int population;
public String countryName;
public float literacyRate;
public long area;
public double gdp;
public char grade;
public boolean isDeveloped;

public India(){
System.out.println("this non arguement constructor");
}
public India(int population,String countryName,float literacyRate,long area,double gdp,char grade,boolean isDeveloped)
{
super();
this.population=population;
this.countryName=countryName;
this.literacyRate=literacyRate;
this.area=area;
this.gdp=gdp;
this.grade=grade;
this.isDeveloped=isDeveloped;
}
public  void displayIndia(){

System.out.println("country population=="+this.population);
System.out.println("country name=="+this.countryName);
System.out.println("literacyRate=="+this.literacyRate);
System.out.println("area=="+this.area);
System.out.println("gdp=="+this.gdp);
System.out.println("country grade=="+this.grade);
System.out.println("is Develop=="+this.isDeveloped);



System.out.println("country population=="+super.population);
System.out.println("country name=="+super.countryName);
System.out.println("literacyRate=="+super.literacyRate);
System.out.println("area=="+super.area);
System.out.println("gdp=="+super.gdp);
System.out.println("country grade=="+super.grade);
System.out.println("is Develop=="+super.isDeveloped);




}
}
