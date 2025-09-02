class PollutionRunner
{
  public static void main(String [] ref)
    {
	 int population = Pollution.cityPopulation();
	 System.out.println(population);
	 System.out.println("-------------------");
	 
	 char grade = Pollution.pollutionGrade();
	 System.out.println(grade);
	 System.out.println("--------------------");
	 
	 
	 byte quality = Pollution.airQuality();
	 System.out.println(quality);
	 System.out.println("-----------------");
	 
	 float co2Level =Pollution.co2Level();
	 System.out.println(co2Level);
	 System.out.println("-----------------");
	 
	 double particle = Pollution.dustParticles();
	 System.out.println(particle);
	 System.out.println("-----------------");
	 
	 short death = Pollution.yearlyDeaths();
	 System.out.println(death);
	 System.out.println("-----------------");
	 
	 long cases = Pollution.pollutionCases();
	 System.out.println(cases);
	 System.out.println("-----------------");
	 
	 boolean dangerous = Pollution.isDangerous();
	 System.out.println(dangerous);
	 System.out.println("-----------------");
	 
	 String city  = Pollution.pollutedCity();
	 System.out.println(city);
	 
	 
	 
    }
}