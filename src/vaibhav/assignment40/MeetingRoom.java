package vaibhav.assignment40;

public class MeetingRoom {
	
	String meetingRoom;
	int timeInHours;
	
	void bookMeetingRoom() {
		this.meetingRoom = "Nalanda";
		this.timeInHours=1;
	}
	
	void bookMeetingRoom(String meetingRoom,int time) {
		this.meetingRoom = meetingRoom;
		this.timeInHours= time;		
	}
	
	void displayInfo() {
		System.out.println("Meeting Room "+meetingRoom+" is booked for "+timeInHours+" Hours");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom("Takshashila",2);
		meetingRoom.displayInfo();		
	}

}
