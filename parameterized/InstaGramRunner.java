class InstaGramRunner
{
  public static void main(String [] args)
  {
  int []followers = {9887,6788,21434};
  int []total = InstaGram.totalFollowers(followers);
  
   for(int number=0; number<followers.length; number++)
   {
   System.out.println(followers[number]);
   }
   char []grade = {'A','B','C'};
   char []value = InstaGram.appGrade(grade);
   
   for(int gradevalue=0; gradevalue<grade.length; gradevalue++)
   {
	   System.out.println(grade[gradevalue]);
   }
   long []likes = {1246l,8746l,46777l,};
   long [] average = InstaGram.postLikes(likes);
   
   for(int totalcount=0; totalcount<likes.length; totalcount++)
   {
	   System.out.println(likes[totalcount]);
   }
   float []rating = {334.2f,47.4f,65.5f};
   float [] app = InstaGram.appRating(rating);
   
   for(int appRating=0; appRating<rating.length; appRating++)
   {
	   System.out.println(rating[appRating]);
   }
   boolean [] verified = {true,false,true};
   boolean []active = InstaGram.isAccountVerified(verified);
   for(int account=0; account<verified.length; account++)
   {
	   System.out.println(verified[account]);
	   }
	   double[] notification = {123.345,1243.34,2432.5};
	   double [] totalNum = InstaGram.storyNotification(notification);
	   for (int averageNotification=0; averageNotification<notification.length; averageNotification++)
	   {
		   System.out.println(notification[averageNotification]);
	   }
	   String []name = {"sudeep","yash","puneth"};
	   String [] actor = InstaGram.celebrityName(name);
	   for(int actorName=0; actorName<name.length; actorName++)
	   {
		   System.out.println(name[actorName]);
		   
	   }
  }


}