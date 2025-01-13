package week1.assignment1;

public class FactorialNumber {
	public static int factorialIterative(int num) {
        int factorial = 1; 
        for (int i = 1; i <= num; i++) {
            factorial *= i; 
        }
        return factorial;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorialIterative(num));
    }
}
