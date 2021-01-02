package suresh;
/*Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility.
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method
for 1 hr.
b. Write another method which helps to book Other then “Nalanda” meeting room by
giving name of meeting room and hrs as parameter.
c. displayInfo method should print booked meeting room info [i.e. meeting room,
booked for how many hrs]*/
public class MeetingRoom {

	String[] meetingRooms = {"Nalanda", "Takshashila", "AgraFort", "PratapGadh"};
	boolean[] isRoomBooked= {false,false,false,false};
	int[] hoursBooked= {0,0,0,0};
	void bookMeetingRoom() {
		bookMeetingRoom("Nalanda",1);
	}

	void bookMeetingRoom(String roomName, int hours) {
		for(int index=0; index<meetingRooms.length;index++) {
			if(meetingRooms[index].equalsIgnoreCase(roomName)) {
				isRoomBooked[index]=true;
				hoursBooked[index]=hours;
			}
		}
	}
	
	void displayInfo(){
		for(int index=0; index<isRoomBooked.length;index++) {
			if(isRoomBooked[index])
				System.out.println("Meeting room booked, NameOfRoom: "+meetingRooms[index]+", HoursBooked: "+hoursBooked[index]);
		}
	}
	
	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("Takshashila", 3);
		meetingRoom.bookMeetingRoom("PratapGadh", 2);
		meetingRoom.displayInfo();
	}
}

