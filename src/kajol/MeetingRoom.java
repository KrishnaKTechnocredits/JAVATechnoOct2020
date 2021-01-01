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

package kajol;

import java.util.Scanner;

public class MeetingRoom {
	int time=0;
	String bookedRoom="";
	
	void bookMeetingRoom(){
		bookedRoom="Nalanda";
		time=1;
	}
	void bookMeetingRoom(String meetingRoomName,int time) {
		 	this.bookedRoom=meetingRoomName;
		 	this.time=time;
	}
	
	void displayBookingInfo() {
		System.out.println("Booking Processing..............");
		System.out.println(bookedRoom+" meeting room is booked for "+time+" hr.");
	}
	
	public static void main(String[] args) {
		MeetingRoom meetingRoom=new MeetingRoom();
		String meetingRooms[]= {"Nalanda", "Takshashila", "AgraFort", "PratapGadh"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Meeting Room you want to Book....");
		String bookingRoom=sc.next();
		if (bookingRoom.equalsIgnoreCase("Nalanda"))
			meetingRoom.bookMeetingRoom();
		if(!bookingRoom.equalsIgnoreCase("Nalanda")) {
			for(int index=1;index<meetingRooms.length;index++) {
				if(bookingRoom.equalsIgnoreCase(meetingRooms[index])){
					System.out.println("Please Enter the Time in hrs you want to book meeting room for...");
					int time=sc.nextInt();
					meetingRoom.bookMeetingRoom(bookingRoom,time);
					break;
				}
			}
		}
		meetingRoom.displayBookingInfo();
		sc.close();
	}
}

