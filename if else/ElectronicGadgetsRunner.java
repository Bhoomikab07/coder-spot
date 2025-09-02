class ElectronicGadgetsRunner
{
	public static void main(String [] ref)
	{
		String name= ElectronicGadgets.gadgetsName(12.66,"laptop");
		System.out.println(name);
		System.out.println("-------------------------");
		
		int value= ElectronicGadgets. batteryCapacity("battery",6000);
		System.out.println(value);
		System.out.println("-------------------------");
		
		double size  = ElectronicGadgets.screenSize(35,44.7);
		System.out.println(size);
		System.out.println("------------------------");
		
		char type = ElectronicGadgets.grade(300,'A');
		System.out.println(type);
		System.out.println("--------------------------");
		
		long amount = ElectronicGadgets.price(true,45000l);
        System.out.println(amount);
		System.out.println("-----------------------");
		
		char connect = ElectronicGadgets.connectivity("Phone",'W');
		System.out.println(connect);
		System.out.println("--------------------");
		
		
		int year = ElectronicGadgets.production("android",2022);
		System.out.println(year);
		System.out.println("------------------");
		
		float speed = ElectronicGadgets.processorSpeed("watch",2.3f);
		System.out.println(speed);
        System.out.println("------------------");
		
		String names= ElectronicGadgets.gadgets(4,"laptop");
		System.out.println(names);
		System.out.println("-------------------------");
		
		int gb = ElectronicGadgets.ram("apple",4);
		System.out.println(gb);
		System.out.println("---------------------");
		
		String nam = ElectronicGadgets.warranty(true, "apple");
		System.out.println(nam);
		System.out.println("--------------------");
		
		float rate = ElectronicGadgets.rating("tab",4.5f);
		System.out.println(rate);
		System.out.println("--------------------");
		
		long price = ElectronicGadgets.gadgetPrice(false,4000);
		System.out.println(price);
		System.out.println("--------------");
		
		int cost = ElectronicGadgets.camerCost(true,455);
		System.out.println(cost);
		System.out.println("-------------------");
		
		String gadgetName = ElectronicGadgets.name(64,"computer");
		System.out.println(gadgetName);
		
	}
}