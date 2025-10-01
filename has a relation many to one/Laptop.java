class Laptop{

public String laptopName;
public int laptopPrice;
public NotePad notePad;
public Intelij intelij;
public MySql mySql;

public Laptop(String laptopName,int laptopPrice,NotePad notePad,Intelij intelij,MySql mySql){

this.laptopName=laptopName;
this.laptopPrice=laptopPrice;
this.notePad=notePad;
this.intelij=intelij;
this.mySql=mySql;
}
public void DisplayLaptopDetails(){

System.out.println("laptop Name="+laptopName+","+"laptop Price="+laptopPrice);
System.out.println("number of users="+notePad.NoOfUsers+","+"app code="+notePad.appCode);
System.out.println("app code="+intelij.appCode+","+"is free="+intelij.isFree);
System.out.println("app name="+mySql.appName+","+"app code="+mySql.appCode);


}
}