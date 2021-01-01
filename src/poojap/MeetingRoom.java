/*Program - 2:  
Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility.
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method
for 1 hr.
b. Write another method which helps to book Other then “Nalanda” meeting room by
giving name of meeting room and hrs as parameter.
c. displayInfo method should print booked meeting room info [i.e. meeting room,
booked for how many hrs]*/

package poojap;

public class MeetingRoom {
	String meetingRoom = "Nalanda";
	int hr = 2;

	void bookMeetingRoom() {
		System.out.println("Meeting room " + meetingRoom + " is booked for " + hr + " hr");
	}

	void bookOtherMeetingRoom(String room, int hr) {
		if (room.equals(meetingRoom))
			System.out.println("This meeting room is already booked");
		else
			System.out.println("Meeting room " + room + " is booked for " + hr + " hr");
	}

	void displayInfo() {
		bookMeetingRoom();
		bookOtherMeetingRoom("AgraFort", 3);
		bookOtherMeetingRoom("Takshashila", 1);
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.displayInfo();
	}
}
