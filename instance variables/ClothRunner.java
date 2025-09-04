class ClothRunner{

public static void main(String [] args){

Cloth cloth = new Cloth();
cloth.cost(500);
cloth.quality('A');
cloth.size(32.6);
cloth.price(700.0f);
cloth.brand("PUMA");

System.out.println("--------------");

Cloth clothCost = new Cloth();
clothCost.cost(657);
clothCost.quality('B');
clothCost.size(12.4);
clothCost.price(14.7f);
clothCost.brand("Adidaas");

System.out.println("---------------");

Cloth clothQuality = new Cloth();
clothQuality.cost(10000);
clothQuality.quality('A');
clothQuality.size(30.0);
clothQuality.price(50.0f);
clothQuality.brand("tokyo talkies");

System.out.println("---------------");

Cloth clothSize = new Cloth();
clothSize.cost(799999);
clothSize.quality('C');
clothSize.size(28.0);
clothSize.price(20.000f);
clothSize.brand("levis");

System.out.println("---------------");

Cloth clothBrand = new Cloth();
clothBrand.cost(76778);
clothBrand.quality('C');
clothBrand.size(34.0);
clothBrand.price(50.00f);
clothBrand.brand("biba");
}
}