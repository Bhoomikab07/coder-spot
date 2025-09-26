class DepartmentRunner{

public static void main(String [] args){

ComputerScience computerScience=new ComputerScience(true,'C');
ComputerScience name=new ComputerScience(false,'C');
DataStructure dataStructure=new DataStructure('D',true,name);
DataBaseSystem dataBaseSystem=new DataBaseSystem('D',150,computerScience);
dataBaseSystem.displayDataBaseSystem();
dataStructure.displayDataStructure();
}
}