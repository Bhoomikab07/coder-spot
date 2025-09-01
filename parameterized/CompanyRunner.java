class CompanyRunner
{
  public static void main(String [] args)
  {
  int []employees = {234,54657,7887};
  int []total = Company.numberOfEmployees(employees);
  
   for(int number=0; number<employees.length; number++)
   {
   System.out.println(employees[number]);
   }
   char []letter = {'E','C','K'};
   char []value = Company.firstLetter(letter);
   
   for(int lettervalue=0; lettervalue<letter.length; lettervalue++)
   {
	   System.out.println(letter[lettervalue]);
   }
   long []revenue = {6354566l,984566l,58789989l,};
   long [] average = Company.annualRevenue(revenue);
   
   for(int totalrevenue=0; totalrevenue<revenue.length; totalrevenue++)
   {
	   System.out.println(revenue[totalrevenue]);
   }
   float []rating = {4.5f,5.4f,5.5f};
   float [] empRating = Company.employeeRating(rating);
   
   for(int rate=0; rate<rating.length; rate++)
   {
	   System.out.println(rating[rate]);
   }
   boolean [] isPrivates = {true,true,true};
   boolean [] privateCompany = Company.isPrivate(isPrivates);
   for(int company=0; company<isPrivates.length; company++)
   {
	   System.out.println(isPrivates[company]);
	   }
	   double[] price = {123.345,1243.34,2432.5};
	   double [] totalprice = Company.stockPrice(price);
	   for (int cost=0; cost<price.length; cost++)
	   {
		   System.out.println(price[cost]);
	   }
	   String []name = {"tech solution","infosys","wipro"};
	   String [] namecompany = Company.companyName(name);
	   for(int nameOfCompany=0; nameOfCompany<name.length; nameOfCompany++)
	   {
		   System.out.println(name[nameOfCompany]);
		   
	   }
  }


}