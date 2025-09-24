class LaptopRunner
{
	public static void main(String [] ref)
	{
		Charger charger = new Charger("HP");
		Laptop laptop = new Laptop(charger);
		System.out.println(laptop.laptopName);
	}
}