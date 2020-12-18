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
package suvela.assignment40.prog2;

public class MeetingRoom {
	String room1="Nalanda";
	int hr=1;
	
	void bookMeetingRoom() {
		System.out.println("Meeting room "+room1+" is booked for "+hr+" hr");
	}
	void bookOtherMeetingRoom(String room,int hr) {
		if(room.equals(room1))
			System.out.println("This meeting room is already booked");
		else
		System.out.println("Meeting room "+room+ " is booked for "+hr+" hr");
	}
	void displayInfo() {
		bookMeetingRoom();
		bookOtherMeetingRoom("Takshashila",5);
	}
	public static void main(String[] args) {
		MeetingRoom mr= new MeetingRoom();
		mr.displayInfo();

	}

}
