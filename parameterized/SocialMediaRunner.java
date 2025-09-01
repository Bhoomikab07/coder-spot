class SocialMediaRunner
{
  public static void main(String [] args)
  {
  int []followers = {1040,20450,30060};
  int []total = SocialMedia.totalFollowers(followers);
  
   for(int number=0; number<followers.length; number++)
   {
   System.out.println(followers[number]);
   }
   char []letter = {'A','B','C'};
   char []value = SocialMedia.firstLetter(letter);
   
   for(int gradevalue=0; gradevalue<letter.length; gradevalue++)
   {
	   System.out.println(letter[gradevalue]);
   }
   long []views = {12435456l,87465847l,9759847,};
   long [] count = SocialMedia.totalViews(views);
   
   for(int totalcount=0; totalcount<views.length; totalcount++)
   {
	   System.out.println(views[totalcount]);
   }
   float []rating = {334.2f,47.4f,65.5f};
   float [] app = SocialMedia.appRating(rating);
   
   for(int appRating=0; appRating<rating.length; appRating++)
   {
	   System.out.println(rating[appRating]);
   }
   boolean [] active = {true,false,true};
   boolean []online = SocialMedia.isAccountActive(active);
   for(int activeAccount=0; activeAccount<active.length; activeAccount++)
   {
	   System.out.println(active[activeAccount]);
	   }
	   double[] revenue = {798.33,668.22,324.566};
	   double [] average = SocialMedia.addRevenue(revenue);
	   for (int totalRevenue=0; totalRevenue<revenue.length; totalRevenue++)
	   {
		   System.out.println(revenue[totalRevenue]);
	   }
	   String []name = {"instagram","facebook","twiter"};
	   String [] mediaName = SocialMedia.socialMediaName(name);
	   for(int socialMediaName=0; socialMediaName<name.length; socialMediaName++)
	   {
		   System.out.println(name[socialMediaName]);
		   
	   }
  }


}