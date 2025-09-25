class Coffee{

public String coffeeName;
public boolean isTasty;
public Tea tea;

public Coffee(String coffeeName,boolean isTasty,Tea tea){

this.coffeeName=coffeeName;
this.isTasty=isTasty;
this.tea=tea;
}
public void displayCoffee(){

System.out.println("coffee name="+coffeeName+","+"is tasty="+isTasty);
System.out.println("tea price:"+tea.price+","+"tea shop name="+tea.teaShopName);
}
}