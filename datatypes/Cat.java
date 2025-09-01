class Cat{
public static void main(String [] args){

     byte age = 3;
	 byte lifeSpan = 8;
	 byte white = 4;
	 byte black =  3;
	 
	 byte [] Cat = {age,lifeSpan,white,black};
	 System.out.println(Cat [3]);
	 
	 System.out.println("disply cat age lifeSpan and color");
	 
	 for (int details=0; details<Cat.length; details++){
	  System.out.println(Cat [details]);
	  }
	  }
	  }