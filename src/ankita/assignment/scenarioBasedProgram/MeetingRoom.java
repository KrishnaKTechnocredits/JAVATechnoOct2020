/*Program - 2:
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
package ankita.assignment.scenarioBasedProgram;

public class MeetingRoom {
	String room;
	int hrs;

	void bookMeetingRoom() {
		room = "Nalanda";
		hrs = 1;
	}

	void bookMeetingRoom(String room, int hrs) {
		this.room = room;
		this.hrs = hrs;
	}

	void display() {
		System.out.println(room + " meeting room is booked for " + hrs + " hours");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.display();

		meetingRoom.bookMeetingRoom("AgraFort", 5);
		meetingRoom.display();
	}
}
