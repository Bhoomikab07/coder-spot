 class BuildingRunner {
    public static void main(String[] args) {

        Building building = new Building();
		
        Room[] roomsFloor1 = { new Room("Ac", "switch","Fridg","heater","table") };
        Room[] roomsFloor2 = { new Room("Chair", "fan","Tv","battery","sofa") };
        Room[] roomsFloor3 = { new Room("Sofa", "TV","fan","stable","chair") };
        Room[] roomsFloor4 = { new Room("Tv", "Ac","pillow","bed","photo") };
        Room[] roomsFloor5 = { new Room("chair", "Bed","phone","shelph","box") };
		Room[] roomsFloor6 = { new Room("pillow", "door","box","light","switch") };
		Room[] roomsFloor7 = { new Room("books", "doumble","Fruits","Ac","bulb") };
		Room[] roomsFloor8 = { new Room("door", "Tv","toys","doll","Photos") };
		Room[] roomsFloor9 = { new Room("door", "light","phone","photo","Keys") };
		Room[] roomsFloor10 = { new Room("ac", "heater","comb","charger","laptop") };
		

        
        Floor firstFloor = new Floor("F1", 111, roomsFloor1);
        Floor secondFloor = new Floor("F2", 112, roomsFloor2);
        Floor thirdFloor = new Floor("F3", 113, roomsFloor3);
        Floor fourthFloor = new Floor("F4", 114, roomsFloor4);
        Floor fifthFloor = new Floor("F5", 115, roomsFloor5);
		Floor sixthFloor = new Floor("F6", 116, roomsFloor6);
		Floor seventhFloor = new Floor("F7", 117, roomsFloor7);
		Floor eighthFloor = new Floor("F8", 118, roomsFloor8);
		Floor ninthFloor = new Floor("F9", 119, roomsFloor9);
		Floor tenthFloor = new Floor("F10", 120, roomsFloor10);

        
        Floor[] floors = { firstFloor, secondFloor, thirdFloor, fourthFloor, fifthFloor,
		                   sixthFloor,seventhFloor, eighthFloor,ninthFloor,tenthFloor};

        
        building.displayBuilding(floors);
    }
}