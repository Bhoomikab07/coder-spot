class BusinessRunner
{
	public static void main(String [] ref)
	{
		Employees employee = new Employees("Bhoomi",true);
		Employees employees= new Employees("Mandara ",true);
		Employees employe = new Employees("Chandana ",false);
		
		Owners owner = new Owners("Nidhi",35);
		Owners owners =new Owners("Nithya",40);
		
		Investments invest=new Investments(23452145l,"Radha");
		Investments investment =new Investments(89075444l,"Rani");
		Investments investments = new Investments(67899765l,"Vani");
		
		Company company = new Company(500,4.5f,employe,owner,invest);
		Restaurent restaurent = new Restaurent("New look",true,employee,owners,investment);
		Hotel hotel = new Hotel(50,4.9f,employees,owner,investments);
		
		company.displayCompanyDetails();
		System.out.println("-------------------------------------------------------");
		restaurent.displayRestaurentDetails();
		System.out.println("-------------------------------------------------------");
		hotel.displayHotelDetails();
	}
}