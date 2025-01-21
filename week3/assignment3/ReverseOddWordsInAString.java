package week3.assignment3;

public class ReverseOddWordsInAString {

	public static void main(String[] args) {
		 String input = "I am a software tester";
	     String[] words = input.split(" ");
	     String result = "";
		for (int i = 0; i < words.length; i++) {
			if (i%2==1) {
				String reversedString = "";
				for (int j =  words[i].length()-1; j >= 0; j--) {
					reversedString += words[i].charAt(j);
				}
				result += reversedString + " ";
			} else {
				result += words[i] + " ";
			}
			}
		System.out.println("Original String: " + input);
        System.out.println("String after reversing odd-indexed words: " + result);
			
	}

}
