class SweetRunner{
public static void main(String [] args){

Sweet sweet = new Sweet();
sweet.price(50);
sweet.taste("good");
sweet.quality('A');
sweet.size(34.2f);
sweet.sugarContent(545.7);

System.out.println("****************");

Sweet sweetPrice = new Sweet();
sweetPrice.price(60);
sweetPrice.taste("good");
sweetPrice.quality('B');
sweetPrice.size(45.5f);
sweetPrice.sugarContent(344.6);

System.out.println("****************");

Sweet sweetTaste = new Sweet();
sweetTaste.price(75);
sweetTaste.taste("good");
sweetTaste.quality('C');
sweetTaste.size(434.6f);
sweetTaste.sugarContent(123.3);

System.out.println("****************");


Sweet sweetQuality = new Sweet();
sweetQuality.price(90);
sweetQuality.taste("good");
sweetQuality.quality('D');
sweetQuality.size(12.3f);
sweetQuality.sugarContent(12.4);

System.out.println("****************");


Sweet sweetSize = new Sweet();
sweetSize.price(100);
sweetSize.taste("good");
sweetSize.quality('A');
sweetSize.size(41.1f);
sweetSize.sugarContent(12.4);
}
}

