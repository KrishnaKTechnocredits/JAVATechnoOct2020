package prasad;

import java.util.Arrays;
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
import java.util.Scanner;

public class MeetingRoomOverloading {
	
	String meetingRoomName;
	double duration;
	String availMeetingRooms[]= {"NALANDA", "TAKSHASHILA", "AGRAFORT", "PRATAPGADH"};
	
	void bookMeetingRoom() {
		meetingRoomName= availMeetingRooms[0];
		duration= 1;	
	}
	
	void bookMeetingRoom(String selectedRoom,double selectedDuration ) {
		this.meetingRoomName=selectedRoom;
		this.duration=selectedDuration;
	}
	
	void displayDetails() {
		System.out.println("Booking Processed..");
		System.out.println(meetingRoomName + " meeting room booked for " + duration + " Hrs");
	}
		
	
	public static void main (String[]arg) {
		MeetingRoomOverloading meetingroom = new MeetingRoomOverloading();
		Scanner scanner = new Scanner(System.in);
		
		boolean preference= false;
		String temp= "NULL";
		double selectedDuration=0;
		System.out.println("Meeting rooms available for booking: "+ Arrays.toString(meetingroom.availMeetingRooms));
		System.out.println(" ");
		System.out.println("Do you have any preference for meeting room & duration? (Please enter Y or N) :-");
		String selection = scanner.next();
		char ch = selection.charAt(0);
		ch= Character.toUpperCase(ch);
		if(ch=='Y') {
			preference = true;
		}
		
		if(preference) {
			System.out.println("Please enter meeting room name:-");
			temp = scanner.next();
			String selectedRoom=temp.toUpperCase();
			int count=0;
			for(int i=0;i<meetingroom.availMeetingRooms.length;i++) {
				if(selectedRoom.equals(meetingroom.availMeetingRooms[i]))
					count++;
			}
			if(count==1) {
				System.out.println("Please enter duration of booking in Hrs :-");
				selectedDuration= scanner.nextDouble();
				meetingroom.bookMeetingRoom(selectedRoom, selectedDuration);
				meetingroom.displayDetails();
				}
			else 
				System.out.println("Invalid meeting room name entered!");
			}
		else if(!preference) {
			meetingroom.bookMeetingRoom();
			meetingroom.displayDetails();
		}
	}
}
