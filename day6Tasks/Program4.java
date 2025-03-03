package day6Tasks;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="NEETHAREDDY";
		char separator='!';
		String output=reshape(input, separator);
		System.out.println(output);
	}
	public static String reshape(String input,char separator) {
		StringBuilder reversedString=new StringBuilder(input).reverse();
		StringBuilder formattedString=new StringBuilder();
		for(int i=0;i<reversedString.length();i++) {
			formattedString.append(reversedString.charAt(i));
			if(i<reversedString.length()-1) {
				formattedString.append(separator);
			}
		}
		return formattedString.toString();
	}

}
