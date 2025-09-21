class MobileRunner{

public static void main(String [] args){

InstaGram instaGram=new InstaGram("Radhika",true);
WhatsApp whatsApp=new WhatsApp(1432543654l,50);
SnapChat snapChat=new SnapChat('S',45);

Mobile mobile=new Mobile("Vivo",15000,instaGram,whatsApp,snapChat);
mobile.displayMobileDetails();
}
}