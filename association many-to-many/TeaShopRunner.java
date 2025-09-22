class TeaShopRunner
{
	public static void main(String [] ref)
	{
		Sugar sugar = new Sugar(4,true);
		Sugar name = new Sugar(5,true);
		Sugar sugars = new Sugar(6,false);
		
		Milk milk =new Milk(12.4,true);
		Milk milks=new Milk(14.7,true);
		
		Ice ice=new Ice(true,"arun");
		Ice ices = new Ice(false,"amul");
		
		Tea tea = new Tea("Malgudi",100,sugar,milk,ice);
		
		Milkshake milkShake = new Milkshake("venilla",true,name,milks,ices);

        Coffee coffe =new Coffee("filter cofe",true,sugars,milk,ices);

        tea.displayTeaDetails();
		System.out.println("-------------------------------------------");
		milkShake.displayMilkshakeDetails();
		System.out.println("-------------------------------------------");
		coffe.displayCoffeeDetails();
	 
	}
}