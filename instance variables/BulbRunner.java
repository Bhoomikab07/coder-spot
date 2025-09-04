class BulbRunner{
public static void main(String [] args){

Bulb bulb = new Bulb();
bulb.price(200);
bulb.quality('A');
bulb.voltage(12.34);
bulb.size(21.3f);
bulb.cost(50);

System.out.println("****************");

Bulb bulbPrice = new Bulb();
bulbPrice.price(100);
bulbPrice.quality('A');
bulbPrice.voltage(54.2);
bulbPrice.size(31.2f);
bulbPrice.cost(70);

System.out.println("**************");

Bulb bulbQuality = new Bulb();
bulbQuality.price(500);
bulbQuality.quality('B');
bulbQuality.voltage(43.2);
bulbQuality.size(12.3f);
bulbQuality.cost(100);

System.out.println("*************");

Bulb bulbVoltage = new Bulb();
bulbVoltage.price(200);
bulbVoltage.quality('A');
bulbVoltage.voltage(123.4);
bulbVoltage.size(1.2f);
bulbVoltage.cost(50);

System.out.println("*************");
 
Bulb bulbSize = new Bulb();
bulbSize.price(400);
bulbSize.quality('B');
bulbSize.voltage(14.5);
bulbSize.size(21.1f);
bulbSize.cost(150);
 
 }}