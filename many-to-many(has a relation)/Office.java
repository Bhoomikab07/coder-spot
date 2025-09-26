class Office{

public String officeName;
public int officePrice;
public Chair chair;
public Table table;
public Rooms rooms;

public Office(String officeName,int officePrice,Chair chair,Table table,Rooms rooms){

this.officeName=officeName;
this.officePrice=officePrice;
this.chair=chair;
this.table=table;
this.rooms=rooms;
}
public void displayOfficeDetails(){

System.out.println("office name="+officeName+","+"office price="+officePrice);
System.out.println("chair price="+chair.chairPrice+","+"is wooden="+chair.isWooden);
System.out.println("table price="+table.tablePrice+","+"is wooden="+table.isWooden);
System.out.println("room area="+rooms.roomArea+","+"room number="+rooms.roomNumber);
}
}