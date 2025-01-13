package week1.assignment1;


public class Armstrong {
	public static boolean isArmstrong(int num) {
		int temp = num;
		int res = 0;
		while (num>0) {
			int n = num%10;
			res+=(n*n*n);
			num/=10;
	}
		return res==temp;
	}
	

	public static void main(String[] args) {
		int num = 153;
		System.out.println(isArmstrong(num));

	}		

}


