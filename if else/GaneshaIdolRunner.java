class GaneshaIdolRunner
{
	public static void main(String [] ref)
	{
		int amount = GaneshaIdol.price("oneInch",1000);
		System.out.println(amount);
		System.out.println("---------------");
		
		
		int price =GaneshaIdol.amount("twoInc",3000);
		System.out.println(price);
		System.out.println("---------------");
		
		
		int stock = GaneshaIdol.idolAvailability("ganes",10);
		System.out.println(stock);
		System.out.println("---------------");
		
		
		 int num = GaneshaIdol.delivery(44.56,6);
		 System.out.println(num);
		 System.out.println("---------------");
		
		  
		 int hours = GaneshaIdol.transport("bik",3);
		 System.out.println(hours);
		 System.out.println("---------------");
		
		  
		  
		 int ligth = GaneshaIdol.numberOfLigth("red",1);
		 System.out.println(ligth);
		 System.out.println("---------------");
		
		  
		 int idol = GaneshaIdol.numberOfIdol("Gold",35);
		 System.out.println(idol);
		 System.out.println("---------------");
		
		  
		 int heigth = GaneshaIdol.idolHeigth("smallGwori",2);
		 System.out.println(heigth);
		 System.out.println("---------------");
		
		  
		 int codes = GaneshaIdol.material("clay",200);
		 System.out.println(codes);
		 System.out.println("---------------");
	}
}
