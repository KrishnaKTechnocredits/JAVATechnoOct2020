package ritika.Assignments.asgmt_40;

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
booked for how many hrs] 
*/
public class MeetingRoom {
	
	boolean nalandaBooked = false;
	boolean takshashilaBooked = false;
	boolean agrafortBooked = false;
	boolean pratapgarhBooked = false;
	int bookingHrs=0;
	Scanner sc = new Scanner(System.in);
	
	String bookMeetingRoom() {
		int entry = 0;
		System.out.println("Choose number against the meeting room you want to book: ");
		System.out.println("1 for Nalanda 2 for Takshashila 3 for Agrafort and 4 for Pratapgarh");
		entry = sc.nextInt();
		switch (entry) {
			case 1:
				bookingHrs = 1;
				return "Nalanda";
			case 2:
				System.out.println("Enter hours of booking: ");
				bookingHrs = sc.nextInt();
				otherBookings("Takshashila", bookingHrs);
				return "Takshashila";
			case 3:
				System.out.println("Enter hours of booking: ");
				bookingHrs = sc.nextInt();
				otherBookings("Agrafort", bookingHrs);
				return "Agrafort";
			case 4: 
				System.out.println("Enter hours of booking: ");
				bookingHrs = sc.nextInt();
				otherBookings("Pratapgarh", bookingHrs);
				return "Pratapgarh";
			default:
				System.out.println("Invalid entry!");
				return "Invalid";
		}
	}
	
	void otherBookings(String meetingRoom, int bookingHrs) {
		if (meetingRoom == "Takhshashila") 
			takshashilaBooked = true;
		else if (meetingRoom == "Agrafort")
			agrafortBooked = true;
		else if (meetingRoom == "Pratapgarh")
			pratapgarhBooked = true;
	}
	
	void displayInfo() {
		String returnedValue = bookMeetingRoom();
		
		if(returnedValue == "Nalanda") 
			System.out.println("Nalanda meeting room booked successfully for 1 hour");
		else if(returnedValue == "Takshashila") 
			System.out.println("Takshashila meeting room booked successfully for " +bookingHrs+ " hours");
		else if(returnedValue == "Agrafort") 
			System.out.println("Agrafort meeting room booked successfully for " +bookingHrs+ " hours");
		else if(returnedValue == "Pratapgarh") 
			System.out.println("Pratapgarh meeting room booked successfully for " +bookingHrs+ " hours");
		else if(returnedValue == "Invalid") 
			displayInfo();
	}
	
	public static void main(String[] args) {
		MeetingRoom mroom = new MeetingRoom();
		mroom.displayInfo();
	}
}
