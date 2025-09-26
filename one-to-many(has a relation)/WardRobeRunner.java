class WardRobeRunner{

public static void main(String [] args){

WardRobe wardRobe=new WardRobe(5500.0,4.8f);
WardRobe name=new WardRobe(6000.0,5.3f);
Cloth cloth=new Cloth("white",500,name);
Accessories accessories=new Accessories("Bangle",2000,wardRobe);
cloth.displayCloth();
accessories.displayAccessories();
}
}