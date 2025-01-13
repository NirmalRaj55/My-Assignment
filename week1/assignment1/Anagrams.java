package week1.assignment1;

import java.util.Arrays;

public class Anagrams {
	public static boolean isAnagram(String str1,String str2) {
		str1 = str1.replaceAll("\\s","").toLowerCase();
		str2 = str2.replaceAll("\\s","").toLowerCase();
		if (str1.length() != str2.length()) {
			return false;
		}
		char[]arr1 = str1.toCharArray();
		char[]arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);	
		return Arrays.equals(arr1, arr2);
		
	}
	public static void main(String[] args) {
		String str1 = "Slient";
		String str2 = "listen";
		System.out.println(isAnagram(str1,str2));
	}

}
