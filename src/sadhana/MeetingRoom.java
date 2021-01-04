package sadhana;

/* Assignment_40
 Program - 2:  
Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility.
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method
for 1 hr.
b. Write another method which helps to book Other then “Nalanda” meeting room by
giving name of meeting room and hrs as parameter.
c. displayInfo method should print booked meeting room info [i.e. meeting room,
booked for how many hrs] */

public class MeetingRoom {

	String meetingRoom;
	int timeInhrs;

	void bookMeetingRoom() {
		this.meetingRoom = "Nalanda";
		this.timeInhrs = 1;
	}

	void otherMeetingRoom(String meetingRoom, int timeInhrs) {
		this.meetingRoom = meetingRoom;
		this.timeInhrs = timeInhrs;
	}

	void displayInfo() {
		System.out.println(meetingRoom + " meeting room is booked for " + timeInhrs + " Hours");
	}

	public static void main(String args[]) {
		MeetingRoom meetingroom = new MeetingRoom();
		meetingroom.bookMeetingRoom();
		meetingroom.displayInfo();
		meetingroom.otherMeetingRoom("AgraFort", 2);
		meetingroom.displayInfo();
	}
}
