package week1.assignment1;

public class PalindromeNumber {
 public static boolean palindrome(int number) {
	       int num = number;
	       int reversedNumber = 0;
	       for (; number !=0 ; number/=10) {
	        	int digit = number % 10;
	        	reversedNumber = reversedNumber * 10 + digit;
			}
			return reversedNumber==num;
		}
	  public static void main(String[] args) {
			int number=121;
			System.out.println(number);
	        System.out.println(palindrome(number));
		}	

}
