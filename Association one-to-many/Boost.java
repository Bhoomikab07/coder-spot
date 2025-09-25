class Boost{

public int boostPrice;
public Tea tea;

public Boost(int price,Tea tea){

this.boostPrice=boostPrice;
this.tea=tea;
}
public void displayBoost()
{

System.out.println("Boost price="+boostPrice);
System.out.println("tea price="+tea.price+","+"tea shop name="+tea.teaShopName);
}
}