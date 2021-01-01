package nagendra.nagendra40;

/*
Program - 2:  
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

	private static String meetingRoome;
	private int hours;

	private MeetingRoom() {

	}

	void bookMeetingRoom() {
		meetingRoome = "Nalanda";
		hours = 1;
	}

	void bookOtherMeetingRoom(String roome, int hrs) {
		switch (roome) {
		case "Takshashila":
			meetingRoome = roome;
			hours = hrs;
			break;
		case "AgraFort":
			meetingRoome = roome;
			hours = hrs;
			break;
		case "PratapGadh":
			meetingRoome = roome;
			hours = hrs;
			break;
		}
	}

	void displayInfo() {

		System.out.println("Roome " + meetingRoome + " is booked for " + hours + " hr.");
	}

	public static void main(String[] args) {
		MeetingRoom mr = new MeetingRoom();
		mr.bookOtherMeetingRoom("AgraFort", 2);
		mr.displayInfo();
	}
}
