package week3.assignment3;

public class RemoveDuplicates {
	public static void main(String[] args) {
        String input = "We learn Java basics as part of java sessions in java week1";
        String[] words = input.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (!result.contains(words[i])) {
                result += words[i] + " ";
            }
        }
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
