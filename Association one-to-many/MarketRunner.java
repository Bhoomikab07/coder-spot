class MarketRunner{

public static void main(String [] args){

Vegitables vegitables=new Vegitables("Potato",50);
Vegitables name=new Vegitables("Onion",60);
Vegitables number=new Vegitables("Carrot",30);
Fruits fruits=new Fruits("red",'A',name);
Flowers flowers=new Flowers("Jasmin",true,number);
Grocery grocery=new Grocery(200,'B',vegitables);

fruits.displayFruits();
flowers.displayFlowers();
grocery.displayGrocery();
}
}