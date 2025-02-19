package day2Tasks;

public class PhoneNumber {
	private String areaCode;
	private String exchange;
	private String extension;
	
	public PhoneNumber(String areaCode,String exchange,String extension) {
		this.areaCode=areaCode;
		this.exchange=exchange;
		this.extension=extension;
	}
	
	@Override
	public String toString() {
		return "(" + areaCode + ")" + exchange + "-" + extension;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		PhoneNumber other=(PhoneNumber) obj;
		return areaCode.equals(other.areaCode) && exchange.equals(other.exchange) && extension.equals(other.extension);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneNumber p1=new PhoneNumber("800","867","5390");
		PhoneNumber p2=new PhoneNumber("250","550","9999");
		
		System.out.println("PhoneNumber 1: " + p1);
		System.out.println("PhoneNumber 2: " + p2);
		
		System.out.println(p1.equals(p2));

	}

}
