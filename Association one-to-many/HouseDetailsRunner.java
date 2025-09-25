class HouseDetailsRunner{

public static void main(String [] args){

House house=new House(3,5000);
House name=new House(4,10000);
House number=new House(5,15000);

Chair chair=new Chair(false,700,house);
Table table=new Table(1000,true,name);
Furniture furniture=new Furniture('A',1500,name);
Sofa sofa=new Sofa(true,25000,number);
Bed bed=new Bed(75.00,3.5f,house);
Window window=new Window(12.4f,false,name);

chair.displayChair();
table.displayTable();
furniture.displayFurniture();
sofa.displaySofa();
bed.displayBed();
window.displayWindow();
}
}