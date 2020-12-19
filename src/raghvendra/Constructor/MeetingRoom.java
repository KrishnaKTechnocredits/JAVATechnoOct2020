package raghvendra.Constructor;
import java.util.Scanner;
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
public class MeetingRoom {
	String meetingRoomName;
	double timeInHours;
	MeetingRoom(String meetingRoomName){
		this.meetingRoomName=meetingRoomName;
		if(meetingRoomName.equalsIgnoreCase("Nalanda"))
			bookMeetingRoom(meetingRoomName);
		else if (meetingRoomName.equalsIgnoreCase("Takshashila") ||meetingRoomName.equalsIgnoreCase("AgraFort") ||meetingRoomName.equalsIgnoreCase("PratapGadh"))
			bookOtherMeetingRoom(meetingRoomName);
	}
	void bookMeetingRoom(String meetingRoomName) {
		this.timeInHours=1;
		displayBookedMeetingRoomInfo(meetingRoomName,1);
	}
	
	void bookOtherMeetingRoom(String meetingRoomName) {
		this.meetingRoomName=meetingRoomName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter booking time");
		this.timeInHours=sc.nextDouble();
		displayBookedMeetingRoomInfo(meetingRoomName,timeInHours);
	}
	void displayBookedMeetingRoomInfo(String meetingRoomName,double timeInHours) {
		System.out.println("Booked Meeting room name: "+meetingRoomName);
		System.out.println("Booked time: "+timeInHours+" hours");
	}

	public static void main(String[] args) {
		new MeetingRoom("Nalanda");
		new MeetingRoom("Takshashila");
	}
}
