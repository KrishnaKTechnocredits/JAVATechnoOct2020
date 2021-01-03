package monika;
/*Assignment 40
 Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility.
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method
for 1 hr.
b. Write another method which helps to book Other then “Nalanda” meeting room by
giving name of meeting room and hrs as parameter.
c. displayInfo method should print booked meeting room info [i.e. meeting room,
booked for how many hrs]
 */


public class MeetingRoom {

	String meetingRoom;
	double time;

	void bookMeetingRoom() {
		meetingRoom = "Nalanda";
		time = 1.30;
		System.out.println(meetingRoom + ": Meeting Room Is booked for-->" + time + " hrs");
	}

	void bookMeetingRoom(String meetingRoom, double time) {
		this.meetingRoom = meetingRoom;
		this.time = time;

		if (!meetingRoom.equalsIgnoreCase("Nalanda")) {
			System.out.println(meetingRoom + ": Meeting Room Is booked for--->" + time + " hrs");
		}

	}

	public static void main(String[] args) {
		MeetingRoom bookRoom = new MeetingRoom();
		bookRoom.bookMeetingRoom();
		bookRoom.bookMeetingRoom("Takshashila", 2.30);
		bookRoom.bookMeetingRoom("PratapGadh", 3);

	}

}
