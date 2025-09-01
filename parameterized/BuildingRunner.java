class BuildingRunner
{
  public static void main(String [] args)
  {
  int []residents = {5668,998988,5564};
  int []total = Building.residents(residents);
  
   for(int number=0; number<residents.length; number++)
   {
   System.out.println(residents[number]);
   }
   char []letter = {'A','O','B'};
   char []value = Building.firstLetter(letter);
   
   for(int lettervalue=0; lettervalue<letter.length; lettervalue++)
   {
	   System.out.println(letter[lettervalue]);
   }
   long []number = {88877l,65543l,48776l,};
   long [] average = Building.registrationNumber(number);
   
   for(int totalnum=0; totalnum<number.length; totalnum++)
   {
	   System.out.println(number[totalnum]);
   }
   float []rent = {23.32f,65.4f,54.5f};
   float [] totalRent = Building.avgRent(rent);
   
   for(int cost=0; cost<rent.length; cost++)
   {
	   System.out.println(rent[cost]);
   }
   boolean [] residential = {true,true,true};
   boolean []isResidential = Building.isResidential(residential);
   for(int building=0; building<residential.length; building++)
   {
	   System.out.println(residential[building]);
	   }
	   double[] price = {123.345,1243.34,2432.5};
	   double [] totalPrice = Building.buildingPrice(price);
	   for (int totalcost=0; totalcost<price.length; totalcost++)
	   {
		   System.out.println(price[totalcost]);
	   }
	   String []name = {"khushi apartment","bridavana","homes"};
	   String [] NameOfBuilding = Building.buildingName(name);
	   for(int buildingName=0; buildingName<name.length; buildingName++)
	   {
		   System.out.println(name[buildingName]);
		   
	   }
  }


}