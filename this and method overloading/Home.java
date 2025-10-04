class Home{
public Home(){
this(100);
}
public Home (int rent){
this(10000,"kanivehalli");
System.out.println("rent="+rent);
}
public Home(int rent,String place){
this(1000001,true,"chithradurga");
System.out.println("rent="+rent);
System.out.println("place="+place);
}
public Home(int rent,boolean isGood,String place){
System.out.println("rent="+rent);
System.out.println("isGood="+isGood);
System.out.println("place="+place);
}
}