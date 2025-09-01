class BookRunner
{
  public static void main(String [] args)
  {
  int []price = {120,200,30};
  int []total = Book.priceOfBook(price);
  
   for(int number=0; number<price.length; number++)
   {
   System.out.println(price[number]);
   }
   char []grade = {'A','B','C'};
   char []value = Book.bookGrade(grade);
   
   for(int gradevalue=0; gradevalue<grade.length; gradevalue++)
   {
	   System.out.println(grade[gradevalue]);
   }
   long []number = {12435456l,874847l,6767884l,};
   long []book = Book.bookNumber(number);
   
   for(int bookNum=0; bookNum<number.length; bookNum++)
   {
	   System.out.println(number[bookNum]);
   }
   float []weight = {33.2f,27.4f,65.5f};
   float [] average = Book.bookWeight(weight);
   
   for(int bookWeight=0; bookWeight<weight.length; bookWeight++)
   {
	   System.out.println(weight[bookWeight]);
   }
   boolean [] harder = {true,false,true};
   boolean [] cover = Book.isHarderCover(harder);
   for(int harderCover=0; harderCover<harder.length; harderCover++)
   {
	   System.out.println(harder[harderCover]);
	   }
	   double[] thickness = {79.33,668.22,32.56};
	   double [] quality = Book.bookThickness(thickness);
	   for (int bookQuality=0; bookQuality<thickness.length; bookQuality++)
	   {
		   System.out.println(thickness[bookQuality]);
	   }
	   String []title = {"lekhna","vidya","classmate"};
	   String [] bookName = Book.bookTitle(title);
	   for(int name=0; name<title.length; name++)
	   {
		   System.out.println(title[name]);
		   
	   }
  }


}