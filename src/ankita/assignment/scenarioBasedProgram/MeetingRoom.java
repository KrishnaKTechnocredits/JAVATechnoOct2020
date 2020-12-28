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

import java.util.Scanner;

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
		if(room.equalsIgnoreCase("Nalanda"))
		System.out.println(room + " meeting room is booked for " + hrs + " hours");
		else 
			System.out.println(room + " meeting room is booked for " + hrs + " hours");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter meetinng room to be booked");
		String mRoom =  sc.next();
		
		if(mRoom.equalsIgnoreCase("Nalanda"))
			meetingRoom.bookMeetingRoom();
		else if (mRoom.equalsIgnoreCase("Takshashila") || mRoom.equalsIgnoreCase("PratapGadh") || mRoom.equalsIgnoreCase("AgraFort"))	{
			System.out.println("Enter time : ");
			int hr = sc.nextInt();
			meetingRoom.bookMeetingRoom(mRoom, hr);
		}
		else {
			System.out.println("Wrong input...");
			sc.close();
			return;
		}
			
		meetingRoom.display();
		sc.close();
	}
}