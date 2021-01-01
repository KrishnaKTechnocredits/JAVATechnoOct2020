package nandini.constructorProgs;

public class MeetingRoom {

	String meetingRoom;
	int timeInhrs;
	
	void bookMeetingRoom(){
		this.meetingRoom = "Nalanda";
		this.timeInhrs = 1;
	}
	
	void book_MeetingRoom(String meetingRoom, int timeInhrs) {
		this.meetingRoom = meetingRoom;
		this.timeInhrs = timeInhrs;
	}
	
	void displayInfo() {
		System.out.println("Meeting Room "+meetingRoom+" is booked for "+timeInhrs+" Hours");
	}
	
	public static void main(String args[]) {
		MeetingRoom meetingroom = new MeetingRoom();
		meetingroom.bookMeetingRoom();
		meetingroom.displayInfo();
		meetingroom.book_MeetingRoom("Takshila", 4);
		meetingroom.displayInfo();
	}
}
