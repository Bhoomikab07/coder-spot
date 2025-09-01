class NewsPaperRunner
{
  public static void main(String [] args)
  {
  int []copies = {4455,5458,32324};
  int []total = NewsPaper.dailyCopies(copies);
  
   for(int number=0; number<copies.length; number++)
   {
   System.out.println(copies[number]);
   }
   char []letter = {'P','N','T'};
   char []value = NewsPaper.firstLetter(letter);
   
   for(int lettervalue=0; lettervalue<letter.length; lettervalue++)
   {
	   System.out.println(letter[lettervalue]);
   }
   long []circulation = {125666l,767646l,4643347l,};
   long [] average = NewsPaper.yearlyCirculation(circulation);
   
   for(int totalcount=0; totalcount<circulation.length; totalcount++)
   {
	   System.out.println(circulation[totalcount]);
   }
   float []price = {2.2f,7.4f,3.5f};
   float [] paperPrice = NewsPaper.paperPrice(price);
   
   for(int rate=0; rate<price.length; rate++)
   {
	   System.out.println(price[rate]);
   }
   boolean [] daily = {true,false,true};
   boolean []dailyPaper = NewsPaper.isDaily(daily);
   for(int paper=0; paper<daily.length; paper++)
   {
	   System.out.println(daily[paper]);
	   }
	   double[] revenue = {123.345,1243.34,2432.5};
	   double [] totalNum = NewsPaper.annualRevenue(revenue);
	   for (int cost=0; cost<revenue.length; cost++)
	   {
		   System.out.println(revenue[cost]);
	   }
	   String []name = {"deccanherald","vijayavaani","prajavaani"};
	   String [] paperName = NewsPaper.newsPaperName(name);
	   for(int newsPaperName=0; newsPaperName<name.length; newsPaperName++)
	   {
		   System.out.println(name[newsPaperName]);
		   
	   }
  }


}