//Program - 2:  Create a class MeetingRoom having method bookMeetingRoom which should provide
//below facility. meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
//a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method
//for 1 hr.
//b. Write another method which helps to book Other then “Nalanda” meeting room by
//giving name of meeting room and hrs as parameter.
//c. displayInfo method should print booked meeting room info [i.e. meeting room,
//booked for how many hrs]

package priya;

public class MeetingRoom {

	String meetingRoom;
	double hrs;

	void bookMeetingRoom() {
		meetingRoom = "Nalanda";
		hrs = 1.00;
		System.out.println(meetingRoom + ": Meeting Room Is booked for " + hrs);
	}

	void bookMeetingRoom(String meetingRoom, double hrs) {
		this.meetingRoom = meetingRoom;
		this.hrs = hrs;

		if (!meetingRoom.equalsIgnoreCase("Nalanda")) {
			System.out.println(meetingRoom + ": Meeting Room Is booked for " + hrs);
		}
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("Takshashila", 3.30);
		meetingRoom.bookMeetingRoom("PratapGadh", 4);
	}

}
