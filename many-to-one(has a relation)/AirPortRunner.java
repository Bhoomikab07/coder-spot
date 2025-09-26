class AirPortRunner{

public static void main(String [] args){


Indigo indigo=new Indigo("Indigo",3000);
AirAsia airAsia=new AirAsia(2500,'A');
AirIndia airIndia=new AirIndia("White",true);
AirPort airPort=new AirPort("KempeGowda Airport",3424.77,indigo,airAsia,airIndia);
airPort.displayAirPortDetails();
}
}