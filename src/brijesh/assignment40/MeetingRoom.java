package brijesh.assignment40;

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
