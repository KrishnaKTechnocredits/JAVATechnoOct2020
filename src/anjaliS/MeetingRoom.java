package anjaliS;

public class MeetingRoom {
	String meetingRoomName;
	int periodOfTime;

	void bookMeetingRoom() {
		meetingRoomName = "Nalanda";
		periodOfTime = 1;

	}

	void bookMeetingRoom(String meetingRoomName, int periodOfTime) {
            this.meetingRoomName = meetingRoomName;
            this.periodOfTime = periodOfTime;
	}

	void displayInfo() {
		System.out.println("Booked " + meetingRoomName + " meeting room for " + periodOfTime + " hour");
	//	System.out.println("Booked " + meetingRoomName + " meeting room for " + time + " hour");

	}

	public static void main(String[] args) {
		MeetingRoom meetingroom = new MeetingRoom();
		meetingroom.bookMeetingRoom();
		meetingroom.displayInfo();
		meetingroom.bookMeetingRoom("AgraFort", 4);
		meetingroom.displayInfo();
	}

}
