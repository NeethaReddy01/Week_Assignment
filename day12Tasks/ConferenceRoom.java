package day12Tasks;

class ConferenceRoom {
	private boolean isAvailable=true;
	
	public synchronized boolean checkAvailability() {
		return isAvailable;
	}
	
	public synchronized void bookRoom() {
		isAvailable=false;
	}
	
	public synchronized void releaseRoom() {
		isAvailable=true;
	}
}
