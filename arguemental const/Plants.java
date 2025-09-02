class Plants{
public Plants(int price){
 System.out.println(price);
 }
 public Plants(int price,String name){
 System.out.println(price);
 System.out.println(name);
 }
 public Plants(int price,String name,boolean isMedical){
 System.out.println(price);
 System.out.println(name);
 System.out.println(isMedical);
 }
 public Plants(int price,String name,boolean isMedical,long seedCount){
 System.out.println(price);
 System.out.println(name);
 System.out.println(isMedical);
 System.out.println(seedCount);
}
public Plants(int price,String name,long seedCount,char type,boolean isMedical){
	System.out.println(price);
	System.out.println(name);
	System.out.println(seedCount);
	System.out.println(type);
	System.out.println(isMedical);
	
}
public Plants(String name){
System.out.println(name);
}
public Plants(String name,int price){
	System.out.println(name);
	System.out.println(price);
}}