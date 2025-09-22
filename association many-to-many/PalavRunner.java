class PalavRunner{
public static void main(String args[]){

//Oil oil =new Oil(true);
Masala masala =new Masala(20);
Salt salt =new Salt("tata");
Oil oil =new Oil(true);
VegetablePalav vegetablepalva=new VegetablePalav(60,salt,masala,oil);
MenthaPalav menthapalav=new MenthaPalav(40,salt,masala,oil);
Palav palav=new Palav(30,salt,masala,oil);
 
palav.diplaypalav();
menthapalav.diplay();
vegetablepalva.diplayPalav();
}
}
 