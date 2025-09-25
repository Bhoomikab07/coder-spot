class ElectricitySupplyRunner{

public static void main(String [] args){

Electricity electricity=new Electricity(1200,true);
Electricity name=new Electricity(1500,true);
Electricity total=new Electricity(1000,true);
Electricity value=new Electricity(500,false);

Fan fan=new Fan("Usha",4.1f,electricity);
Telivision telivision=new Telivision(25000,"Sony",name);
WashingMachine washingMachine=new WashingMachine("Lg",30000,total);
Refrigirator refrigirator=new Refrigirator("SumSung",15000,electricity);
WaterHeater waterHeater=new WaterHeater(7000,'B',value);

fan.displayFan();
telivision.displayTelivision();
washingMachine.displayWashingMachine();
refrigirator.displayRefrigirator();
waterHeater.displayWaterHeater();
}
}