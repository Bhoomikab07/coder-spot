class MenthaPalav{
public int price;
public Salt salt;
public Masala masala ;
public Oil oil;

public MenthaPalav(int price,Salt salt,Masala masala,Oil oil){
this.price=price;
this.salt=salt;
this.masala=masala;
this.oil=oil;
}
public void diplay(){
System.out.println("price="+price);
System.out.println("salt="+salt.name);
System.out.println("masala="+masala.price);
System.out.println("oil="+oil.isPure);
}
}
