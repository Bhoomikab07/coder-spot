class HolidaysRunner{
	public static void main(String [] args){
		
		int number = Holidays.numberOfHolidays(6);
		System.out.println(number);
		
		float temperature = Holidays.temparatureInHolidays(42.2f);
		System.out.println(temperature);
		
		
		char season = Holidays.holidaysSeason('S');
		System.out.println(season);
		
		
		boolean national = Holidays.isNationalHoliday(true);
		System.out.println(national);
		
		
		String name = Holidays.nameOfTheHoliday("summer");
		System.out.println(name);
		
		
		long people = Holidays.numberOfPeopleTravelling(56886l);
		System.out.println(people);
		
		
		double budget = Holidays.holidayTripBudget(456.123);
		System.out.println(budget);
	}
}