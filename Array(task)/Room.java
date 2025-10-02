class Room {
    public String roomFirstThings;
    public String roomSecondThings;
	public String roomThirdThings;
	public String roomFourthThings;
	public String roomFifthThings;

    public Room(String roomFirstThings, String roomSecondThings, String roomThirdThings,
	                 String roomFourthThings, String roomFifthThings) {
        this.roomFirstThings = roomFirstThings;
        this.roomSecondThings = roomThirdThings;
		this.roomThirdThings=roomThirdThings;
		this.roomFourthThings=roomFourthThings;
		this.roomFifthThings=roomFifthThings;
    }

    public void displayRoom() {
        System.out.println("things inside First  room: " + roomFirstThings);
        System.out.println(" things inside Second   room: " + roomSecondThings);
		System.out.println(" things inside Third  room: " + roomThirdThings);
		System.out.println("things inside Fourth   room: " + roomFourthThings);
		System.out.println(" things inside Fifth room: " + roomFifthThings);
		
    }
}