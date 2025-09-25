class Sugar{

public int noOfSpoons;
public boolean isSugarLess;
public Tea tea;

public Sugar(int noOfSpoons,boolean isSugarLess,Tea tea){

this.noOfSpoons=noOfSpoons;
this.isSugarLess=isSugarLess;
this.tea=tea;
}
public void displaySugar(){

System.out.println("noOfSpoons="+noOfSpoons+","+"isSugarLess="+isSugarLess);
System.out.println("tea price="+tea.price+","+"tea shop name="+tea.teaShopName);
}
}