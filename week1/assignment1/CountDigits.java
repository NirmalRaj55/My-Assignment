package week1.assignment1;

public class CountDigits {
	    public static int countDigits(int number) {
	        int count = 0;
	        if (number == 0) {
	            return 1;
	        }
	        while (number != 0) {
	            number /= 10;
	            count++;
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int number = -67890;
	        System.out.println("Number of digits: " + countDigits(number));
	    }
	}


