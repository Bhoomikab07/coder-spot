class BuildingRunner{

public static void main(String [] args){

Chair chair=new Chair(400,true);
Table table=new Table(1000,true);
Rooms rooms=new Rooms(455.6f,6565676l);
House house=new House("Brudavana",25000,chair,table,rooms);
Office office=new Office("infotech",50000,chair,table,rooms);
house.displayHouseDetails();
office.displayOfficeDetails();
}
}