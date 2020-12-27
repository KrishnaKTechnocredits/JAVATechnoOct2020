package nitin.Assignment_40;
import java.util.Scanner;
/* Assignment - 40: 16th Dec'2020 - Program - 2:Create a class MeetingRoom having method bookMeetingRoom which should provide below facility.
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method for 1 hr.
b. Write another method which helps to book Other then “Nalanda” meeting room by giving name of meeting room and hrs as parameter.
c. displayInfo method should print booked meeting room info [i.e. meeting room,booked for how many hrs]*/
public class MeetingRoom {
	String meetingRoom;
	float hours;
	void bookMeetingRoom() {
		bookMeetingRoom("Nalanda",1.0f);
	}
	void bookMeetingRoom(String selectedRoom, float hrs) {
		this.meetingRoom=selectedRoom;
		this.hours=hrs;		
	}	
	void displayInfo() {
		System.out.println("Meeting room "+meetingRoom+" booked for "+hours+" hrs.");
	}
	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name of meeting room need to booked - ");
		String selectedRoom = sc.nextLine();
			if(selectedRoom.equalsIgnoreCase("Nalanda")) {
				meetingRoom.bookMeetingRoom();
				meetingRoom.displayInfo();
			}
			else if(selectedRoom.equalsIgnoreCase("Takshashila")||selectedRoom.equalsIgnoreCase("AgraFort")||selectedRoom.equalsIgnoreCase("PratapGadh")) {
				System.out.println("Please enter time booking duration in hours - ");
				float hours = sc.nextFloat();
				meetingRoom.bookMeetingRoom(selectedRoom, hours);
				meetingRoom.displayInfo();
			}
			else
				System.out.println("Invalid Input, Please try again..!!");
		sc.close();
	}
}
