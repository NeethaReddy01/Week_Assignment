package day12Tasks;

public class ConferenceRoomBookingJob implements Runnable{
	private ConferenceRoom conferenceRoom;
	private String managerName;
	
	public ConferenceRoomBookingJob(ConferenceRoom conferenceRoom,String managerName) {
		this.conferenceRoom=conferenceRoom;
		this.managerName=managerName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized(conferenceRoom) {
				if(conferenceRoom.checkAvailability()) {
					System.out.println(managerName + "Room is Available. Booking the Room");
					conferenceRoom.bookRoom();
					System.out.println(managerName + "Room Booked, conducting meeting");
				
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(managerName + "Meeting Finished");
				conferenceRoom.releaseRoom();
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			else{
					System.out.println(managerName + "Room is not available");
				}
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}	
}
