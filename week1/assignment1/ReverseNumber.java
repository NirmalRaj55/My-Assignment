package week1.assignment1;

public class ReverseNumber {
	public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

		/*
		 * while (number != 0) { int digit = number % 10; reversedNumber =
		 * reversedNumber * 10 + digit; number /= 10; }
		 */
        for (; number !=0 ; number/=10) {
        	int digit = number % 10;
        	reversedNumber = reversedNumber * 10 + digit;	
		}

        System.out.println("Reversed Number: " + reversedNumber);
    }
}




