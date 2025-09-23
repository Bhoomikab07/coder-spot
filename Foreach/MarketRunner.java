class MarketRunner
{
	public static void main(String [] ref)
	{
		Market market = new Market();
		Vegitables vegitableName = new Vegitables("Tomato",true);
		Vegitables name = new Vegitables("Potato",false);
		Vegitables value = new Vegitables("carrot",false);
		Vegitables total = new Vegitables("Onion",true);
		Vegitables[] vegitables = {vegitableName,name,value,total};
		market.marketDetails(vegitables);
	}
}