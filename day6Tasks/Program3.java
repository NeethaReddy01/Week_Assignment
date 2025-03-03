package day6Tasks;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pan1="ABc1234Z";
		String pan2="MNR1291S";
		if(validatePan(pan1)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("InValid");
		}
		if(validatePan(pan2)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("InValid");
		}

	}
	public static boolean validatePan(String pan) {
		if(pan.length() != 8) {
			return false;
		}
		if(!pan.matches("[A-Z]{3}[0-9]{4}[A-Z]")) {
			return false;
		}
		return  true;
	}

}
