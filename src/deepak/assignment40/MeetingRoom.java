/*
 * Program - 2:  
Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility.
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method
for 1 hr.
b. Write another method which helps to book Other then “Nalanda” meeting room by
giving name of meeting room and hrs as parameter.
c. displayInfo method should print booked meeting room info [i.e. meeting room,
booked for how many hrs]
 * 
 */

package deepak.assignment40;

public class MeetingRoom {
	
	String roomName;
	int time;
		
	MeetingRoom(String roomName, int time){
		
		this.roomName = roomName;
		this.time = time;
		if(roomName.equalsIgnoreCase("Nalanda")) {
			bookMeetingRoom(roomName);
		}
		else
			bookMeetingRoomOtherThanNalanda(roomName, time);
	}
	
	void bookMeetingRoom(String roomName) {

		displayInfo();
	}
	
	void bookMeetingRoomOtherThanNalanda(String roomName, int time) {
			
		displayInfo();
	}
		
	void displayInfo() {
		
		System.out.println("Meeting room "+ this.roomName + " is booked for "+ this.time + " hours");	
	}
	
	public static void main(String[] args) {
		
		MeetingRoom refVar = new MeetingRoom("Nalanda", 1);
	
	}

}
