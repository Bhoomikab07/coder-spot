class College{
public static void main(String [] args){

       float percentage = 79.77f;
	   float highestPercentage = 98.29f;
	   float lowestPercentage = 56.55f;
	   
	   float [] collegePercentage = {percentage,highestPercentage,lowestPercentage};
	   System.out.println(collegePercentage[1]);
	   
	   System.out.println("show some college percentage");
	   float firstClass = 85.99f;
	   collegePercentage[2] = firstClass;
	   System.out.println(collegePercentage[2]);
	   
	   for (int marks=0; marks<collegePercentage.length; marks++){
		   System.out.println(collegePercentage [marks]);
	   }
	   
	   }}