class Horlics{

public int price;
public boolean isSweet;
public Tea tea;

public Horlics(int price,boolean isSweet,Tea tea){

this.price=price;
this.isSweet=isSweet;
this.tea=tea;
}
public void displayHorlics(){

System.out.println("price="+price+","+"is sweet="+isSweet);
System.out.println("tea price="+tea.price+","+"tea shop name="+tea.teaShopName);
}
}