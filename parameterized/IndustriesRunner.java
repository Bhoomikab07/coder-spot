class IndustriesRunner
{
  public static void main(String [] args)
  {
  int []workers = {5668,998988,5564};
  int []total = Industries.totalWorkers(workers);
  
   for(int number=0; number<workers.length; number++)
   {
   System.out.println(workers[number]);
   }
   char []letter = {'N','P','U'};
   char []value = Industries.firstLetter(letter);
   
   for(int lettervalue=0; lettervalue<letter.length; lettervalue++)
   {
	   System.out.println(letter[lettervalue]);
   }
   long []capacity = {23344l,3443l,5656l,};
   long [] average = Industries.productionCapacity(capacity);
   
   for(int totalCapacity=0; totalCapacity<capacity.length; totalCapacity++)
   {
	   System.out.println(capacity[totalCapacity]);
   }
   float []rate = {23.32f,65.4f,54.5f};
   float [] totalate = Industries.growthRate(rate);
   
   for(int growthrate=0; growthrate<rate.length; growthrate++)
   {
	   System.out.println(rate[growthrate]);
   }
   boolean [] export = {true,true,true};
   boolean []isExport = Industries.isExportOriented(export);
   for(int exportIndustry=0; exportIndustry<export.length; exportIndustry++)
   {
	   System.out.println(export[exportIndustry]);
	   }
	   double[] turnOver = {123.345,1243.34,2432.5};
	   double [] totalOver = Industries.annualTurnOver(turnOver);
	   for (int totalturnOver=0; totalturnOver<turnOver.length; totalturnOver++)
	   {
		   System.out.println(turnOver[totalturnOver]);
	   }
	   String []name = {"steel industry","iron industry","copper industry"};
	   String [] NameOfIndustry = Industries.industryName(name);
	   for(int industryName=0; industryName<name.length; industryName++)
	   {
		   System.out.println(name[industryName]);
		   
	   }
  }


}