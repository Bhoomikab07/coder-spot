class TeaStallRunner{

public static void main(String [] args){
 
 Tea tea=new Tea(20,"Sattva tea");
 Tea name=new Tea(15,"Malgudi coffee");
 Tea number=new Tea(25,"Levista Coffee");
 
 Coffee coffee=new Coffee("filterCoffee",true,tea);
 Boost boost=new Boost(30,name);
 Horlics horlics=new Horlics(25,true,number);
 Sugar sugar=new Sugar(3,false,name);
 
 coffee.displayCoffee();
 boost.displayBoost();
 horlics.displayHorlics();
 sugar.displaySugar();
 }
}