class FestivalRunner{
	public static void main(String [] args){
		
		int number = Festival.numberOfFestival(4);
		System.out.println(number);
		
		float expenses = Festival.festivalExpenses(5.6f);
		System.out.println(expenses);
		
		
		char grade = Festival.festivalGrade('A');
		System.out.println(grade);
		
		
		boolean festival = Festival.isFestival(true);
		System.out.println(festival);
		
		
		String name = Festival.festivalName("ganesha");
		System.out.println(name);
		
		
		long people = Festival.totalNumberOfPeople(56888878l);
		System.out.println(people);
		
		
		double budget = Festival.festivalBudget(456.887);
		System.out.println(budget);
	}
}