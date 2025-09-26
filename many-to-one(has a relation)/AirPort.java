class AirPort{

public String airPortName;
public double totalArea;
public Indigo indigo;
public AirAsia airAsia;
public AirIndia airIndia;

public AirPort(String airPortName,double totalArea,Indigo indigo,AirAsia airAsia,AirIndia airIndia){

this.airPortName=airPortName;
this.totalArea=totalArea;
this.indigo=indigo;
this.airAsia=airAsia;
this.airIndia=airIndia;
}
public void displayAirPortDetails(){

System.out.println("airPort name="+airPortName+","+"total area of a airPort="+totalArea);
System.out.println("name of the flight="+indigo.flightName+","+"ticket price="+indigo.ticketPrice);
System.out.println("air asia ticket price="+airAsia.airAsiaTicketPrice+","+"code of a flight="+airAsia.flightCode);
System.out.println("color of a flight="+airIndia.flightColor+","+"it is available="+airIndia.isAvailable);

}


}