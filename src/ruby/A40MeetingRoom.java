package ruby;

/*Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility.
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method
for 1 hr.
b. Write another method which helps to book Other then “Nalanda” meeting room by
giving name of meeting room and hrs as parameter.
c. displayInfo method should print booked meeting room info [i.e. meeting room,
booked for how many hrs]*/

public class A40MeetingRoom {

	String[] meetingRooms = { "Nalanda", "Takshashila", "AgraFort", "PratapGadh" };
	boolean[] isRoomBooked = { false, false, false, false };
	int[] hrsBooked = { 0, 0, 0, 0 };

	void bookMeeting() {
		bookMeetingRoom("Nalanda", 1);
	}

	void bookMeetingRoom(String room, int hrs) {
		for (int i = 0; i < meetingRooms.length; i++) {
			if (meetingRooms[i].equalsIgnoreCase(room)) {
				isRoomBooked[i] = true;
				hrsBooked[i] = hrs;
			}
		}
	}

	void displayInfo() {
		for (int i = 0; i < meetingRooms.length; i++) {
			if (isRoomBooked[i])
				System.out.println(
						"Meeting room booked, Room Name: " + meetingRooms[i] + ", HoursBooked: " + hrsBooked[i]);
		}
	}

	public static void main(String[] args) {
		A40MeetingRoom meetingRoom = new A40MeetingRoom();
		meetingRoom.bookMeeting();
		meetingRoom.bookMeetingRoom("Takshashila", 3);
		meetingRoom.bookMeetingRoom("PratapGadh", 2);
		meetingRoom.displayInfo();
	}
}