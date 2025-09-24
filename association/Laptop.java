class Laptop
{
	public String laptopName;
	public Charger charger;
	
	public Laptop(Charger charger)
	{
		this.charger=charger;
		this.laptopName=charger.chargerName;
	}
}