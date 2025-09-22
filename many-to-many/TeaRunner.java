class TeaRunner{
public static void main (String args[]){
TeaPowder teapowder=new TeaPowder(true);
Milk milk =new Milk("nandini");
Sugar sugar =new Sugar(60);

GreenTea greentea=new GreenTea("tajauphar",sugar,milk,teapowder);
NormalTea normalea=new NormalTea("veenaStore",sugar,milk,teapowder);
GingerTea gingertea =new GingerTea("teaStal",sugar,milk,teapowder);


greentea.displayGreenTea();
normalea.normalTeaDisplay();
gingertea.displayGingerTea();
}
}