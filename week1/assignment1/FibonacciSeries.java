package week1.assignment1;

public class FibonacciSeries {
	int x = 0;
	int y = 1;
	public static void main(String[] args) {
		int firstNumber = 0, secondNumber = 1;
        System.out.print("Fibonacci Series up to 8 : ");
        for (int i = 0; i<=8; i++) {
            System.out.print(firstNumber + " "); // F+S, F+i, 0+1, 1+1, 1+2, 2+3, 3+5
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;


	}
	}

}
