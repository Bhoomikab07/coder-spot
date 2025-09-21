class Mobile{

public String mobileName;
public int price;
public InstaGram instaGram;
public WhatsApp whatsApp;
public SnapChat snapChat;

public Mobile(String mobileName,int price,InstaGram instaGram,WhatsApp whatsApp,SnapChat snapChat){

this.mobileName=mobileName;
this.price=price;
this.instaGram=instaGram;
this.whatsApp=whatsApp;
this.snapChat=snapChat;
}

public void displayMobileDetails(){

System.out.println("mobile Name="+mobileName+","+"mobile price="+price);
System.out.println("InstaGram user name="+instaGram.userName+","+"account verified="+instaGram.isVerified);
System.out.println("WhatsApp number="+whatsApp.whatsAppNumber+","+"total contacts="+whatsApp.noOfContacts);
System.out.println("snapChat code="+snapChat.snapChatCode+","+"total friends="+snapChat.totalFriends);

}
}