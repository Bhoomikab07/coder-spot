class Dress{
public static void main(String [] args){
    int price = 100;
	int sellingPrice = 120;
	int costPrice = 100;
	int profit = 20;
	
	int [] dressPrice = {price,sellingPrice,costPrice,profit};
	System.out.println(dressPrice[3]);
	System.out.println("the cost of a Dress");
	
	for (int cost=0; cost < dressPrice.length; cost++){
	System.out.println(dressPrice[cost] );
	}
	}
}