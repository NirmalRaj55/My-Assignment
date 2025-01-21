package week3.assignment3;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
	        String str1 = "Stops";
	        String str2 = "Potss";
	        str1 = str1.replaceAll("\\s","").toLowerCase();
			str2 = str2.replaceAll("\\s","").toLowerCase();
			if (str1.length() != str2.length()) {
				 System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
				 return;
			}
			char [] charArray1 = str1.toCharArray();
			char [] charArray2 = str2.toCharArray();
			System.out.println("CharArray1 "+Arrays.toString(charArray1));
			System.out.println("CharArray1 "+Arrays.toString(charArray2));
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			System.out.println("CharArray1 "+Arrays.toString(charArray1));
			System.out.println("CharArray1 "+Arrays.toString(charArray2));
			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println("The given strings are Anagram.");
				
			} else {
				System.out.println("The given strings are not an Anagram.");
			}
	}

}
