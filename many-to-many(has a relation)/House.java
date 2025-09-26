class House{

public String houseName;
public int housePrice;
public Chair chair;
public Table table;
public Rooms rooms;

public House(String houseName,int housePrice,Chair chair,Table table,Rooms rooms){

this.houseName=houseName;
this.housePrice=housePrice;
this.chair=chair;
this.table=table;
this.rooms=rooms;
}
public void displayHouseDetails(){

System.out.println("house name="+houseName+","+"house price="+housePrice);
System.out.println("chair price="+chair.chairPrice+","+"is wooden="+chair.isWooden);
System.out.println("table price="+table.tablePrice+","+"is wooden="+table.isWooden);
System.out.println("room area="+rooms.roomArea+","+"room number="+rooms.roomNumber);
}
}