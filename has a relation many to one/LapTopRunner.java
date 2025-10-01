class LaptopRunner{

public static void main(String [] args){

NotePad notePad=new NotePad(500,'N');
Intelij intelij=new Intelij('I',true);
MySql mysql=new MySql("MySql",'M');

Laptop laptop=new Laptop("Lenovo",45000,notePad,intelij,mysql);
laptop.DisplayLaptopDetails();
}
}