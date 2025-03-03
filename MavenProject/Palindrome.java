package com.insight.MavenProject;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("aba","level","apple","banana");
		Optional<String> shortestPalindrome=list.stream().filter(Palindrome::isPalindrome)
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		shortestPalindrome.ifPresent(System.out::println);
	}
	private static boolean isPalindrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
	}

}
