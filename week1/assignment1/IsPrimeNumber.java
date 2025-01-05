package week1.assignment1;

public class IsPrimeNumber { // The Number which divisible by the same number is Prime number

	public static void main(String[] args) {
		int a = 13;
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }

	}

}
