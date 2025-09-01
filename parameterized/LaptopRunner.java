class LaptopRunner
{
  public static void main(String [] args)
  {
  int []price = {10000,20000,30000};
  int []total = Laptop.priceOfLaptops(price);
  
   for(int number=0; number<price.length; number++)
   {
   System.out.println(price[number]);
   }
   char []grade = {'A','B','C'};
   char []value = Laptop.qualityGrade(grade);
   
   for(int gradevalue=0; gradevalue<grade.length; gradevalue++)
   {
	   System.out.println(grade[gradevalue]);
   }
   long []number = {12435456l,87465847l,9759847,};
   long []serial = Laptop.serialNumber(number);
   
   for(int serialnum=0; serialnum<number.length; serialnum++)
   {
	   System.out.println(number[serialnum]);
   }
   float []size = {334.2f,47.4f,65.5f};
   float [] screen = Laptop.screenSize(size);
   
   for(int screenSize=0; screenSize<size.length; screenSize++)
   {
	   System.out.println(size[screenSize]);
   }
   boolean [] open = {true,false,true};
   boolean []laptopOpen = Laptop.isLaptopOpen(open);
   for(int isLapOpen=0; isLapOpen<open.length; isLapOpen++)
   {
	   System.out.println(open[isLapOpen]);
	   }
	   double[] speed = {79868.33,668.22,324.566};
	   double [] laptopSpeed = Laptop.processSpeed(speed);
	   for (int procesSpeed=0; procesSpeed<speed.length; procesSpeed++)
	   {
		   System.out.println(speed[procesSpeed]);
	   }
	   String []name = {"lenovo","dell","HP"};
	   String [] laptopName = Laptop.brandName(name);
	   for(int brand=0; brand<name.length; brand++)
	   {
		   System.out.println(name[brand]);
		   
	   }
  }


}