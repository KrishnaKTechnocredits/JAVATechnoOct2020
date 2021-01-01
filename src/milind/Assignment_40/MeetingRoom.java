package milind.Assignment_40;

import java.util.Scanner;

public class MeetingRoom {
	
	String meetingRoom;
	int time;
	
	void bookMeetingRoom() {
		meetingRoom = "Nalanda";
		time = 1;
	}
	
	void bookMeetingRoom(String meetingRoom, int time) {
		this.meetingRoom = meetingRoom;
		this.time = time;
	}
	
	void displayMeetingRoomInfo() {
		if(meetingRoom.equalsIgnoreCase("Nalanda")) {
			System.out.println(meetingRoom + " meeting room is booked for " + time);
		}else {
			System.out.println(meetingRoom + " meeting room is booked for " + time);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MeetingRoom meetingRoom = new MeetingRoom();
		
		System.out.println("Enter meeting room name : ");
		String meetingRoomName = scanner.nextLine();
		if(meetingRoomName.equalsIgnoreCase("Nalanda")) {
			meetingRoom.bookMeetingRoom();
		}else if(meetingRoomName.equalsIgnoreCase("Takshashila") || meetingRoomName.equalsIgnoreCase("AgraFort") || meetingRoomName.equalsIgnoreCase("PratapGadh")) {
			System.out.println("Enter timing : ");
			int meetingTiming = scanner.nextInt();
			meetingRoom.bookMeetingRoom(meetingRoomName, meetingTiming);
		}else {
			System.out.println("No such meeting room");
			return;
		}
		meetingRoom.displayMeetingRoomInfo();
	}
}
