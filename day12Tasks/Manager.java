package day12Tasks;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConferenceRoom conferenceRoom=new ConferenceRoom();
		Thread Manager1=new Thread(new ConferenceRoomBookingJob(conferenceRoom,"Manager 1"));
		Thread Manager2=new Thread(new ConferenceRoomBookingJob(conferenceRoom,"Manager 2"));
		Manager1.start();
		Manager2.start();

	}
}
