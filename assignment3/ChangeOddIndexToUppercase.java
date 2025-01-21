package week3.assignment3;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String string = "changeme";
		char [] chnageString = string.toCharArray();
		for (int i = 0; i < chnageString.length; i++) {
			if (i%2==1) {
				 chnageString [i] = Character.toUpperCase(chnageString[i]);
			}
		}
		String result = new String(chnageString);
		System.out.println("Change Odd Index To Uppercase : "+result);

	}

}
