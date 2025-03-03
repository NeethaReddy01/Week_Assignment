package day6Tasks;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="IG TECHNOLOGIES IG";
		String input2="HELLO IG GOOD MORNING";
		System.out.println(calculatedWordSum(input1));
		System.out.println(calculatedWordSum(input2));
	}
	public static int calculatedWordSum(String str) {
		String[] words=str.split("\\s+");
		if(words[0].equals(words[words.length-1])) {
			return words[0].length();
		}
		else {
			return words[0].length() + words[words.length-1].length();
		}
	}

}
