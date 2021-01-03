package shrutiC.assignment40;

import java.util.Scanner;

public class MeetingRoom {

	String meetingRoomName;
	double meetingHours;

	void bookMeetingRoom() {
		this.meetingRoomName = "Nalanda";
		this.meetingHours = 1;
		displayInfo();
	}

	void bookMeetingRoom(String roomName, double hours) {
		this.meetingRoomName = roomName;
		this.meetingHours = hours;
		displayInfo();
	}

	void displayInfo() {
		System.out.println("Meeting room '" + meetingRoomName + "' is booked for '" + meetingHours + "' hours");
	}

	
	public static void main(String[] args) {
		MeetingRoom meeting = new MeetingRoom();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of meeting room to be booked : {Nalanda, Takshashila, AgraFort, PratapGadh}");
		String roomName=sc.next();
		
		if(roomName.equalsIgnoreCase("Nalanda"))
			meeting.bookMeetingRoom();
		else{
			System.out.println("Enter meeting hours : ");
			double meetingHours=sc.nextDouble();			
			meeting.bookMeetingRoom(roomName,meetingHours);
		}
			
	}

}
