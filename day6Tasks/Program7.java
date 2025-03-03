package day6Tasks;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="191-212-1921";
		String output=convertedFormat(input);
		System.out.println(output);
	}
	public static String convertedFormat(String str) {
		String cleaned=str.replaceAll("-","");
		if(cleaned.length() != 10) {
			throw new IllegalArgumentException("Input must contain exactly 10 digits");
		}
		StringBuilder newFormat=new StringBuilder();
		newFormat.append(cleaned.substring(0,2)).append("-");
		newFormat.append(cleaned.substring(2,4)).append("-");
		newFormat.append(cleaned.substring(4,7)).append("-");
		newFormat.append(cleaned.substring(7,10));
		
		return newFormat.toString();
	}

}
