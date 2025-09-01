class BoardRunner
{
  public static void main(String [] args)
 {
 int []price = {278,500,677};
 int [] cost = Board.boardPrice(price);
 
 long[]number = {4576897l,356466l,778979l};
 long[]value = Board.boardSerialNumber(number);
 
 float[]width = {45.6f,67.4f,24.7f};
 float [] size = Board.boardWidth(width);
 
 double[]weight = {54.5,24.5,33.4};
 double[] total = Board.boardWeight(weight);
 
 char[] grade = {'A','C','B'};
 char[] quality= Board.boardGrade(grade);
 
 boolean [] smart = {true,false,true};
 boolean [] isSmart = Board.isBoardSmart(smart);
 
 String [] type= {"white","black","green"};
 String [] color =Board.boardType(type);
 
 for(int boardCost=0; boardCost<price.length; boardCost++)
 {
 System.out.println(price[boardCost]);
 }
 for(int serialNum=0; serialNum<number.length; serialNum++)
 {
 System.out.println(number[serialNum]);
 }
 for(int boardWidth=0; boardWidth<width.length; boardWidth++)
 {
 System.out.println(width[boardWidth]);
 }
 for(int boardWeight=0; boardWeight<weight.length; boardWeight++ )
 {
 System.out.println(weight[boardWeight]);
 }
 for(int qualityGrade=0; qualityGrade<grade.length; qualityGrade++)
 {
 System.out.println(grade[qualityGrade]);
 }
 for(int smartBoard=0; smartBoard<smart.length; smartBoard++)
 {
 System.out.println(smart[smartBoard]);
 }
 for(int boardColor=0; boardColor<type.length; boardColor++)
 {
	 System.out.println(type[boardColor]);
 } 
 }
 }