package week1.assignment1;

public class ReverseString {
	public static String reverseString(String str) {
	       String rev = "";
	      for(int i=(str.length()-1); i>=0; i--){
	        rev = rev+str.charAt(i);
	      }
			return rev;
		}
	  public static void main(String[] args) {
			String str="testleaf";
			System.out.println(str);
	        System.out.println(reverseString(str));
		}	
	}


