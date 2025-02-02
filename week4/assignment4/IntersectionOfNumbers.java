package week4.assignment4;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfNumbers {

	public static void main(String[] args) {
		int [] array1 = {3, 2, 11, 4, 6, 7};
		int [] array2 = {1, 2, 8, 4, 9, 7};
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int num : array1) {
			list1.add(num);
		}
		for (int num : array2) {
			list2.add(num);	
		}
     for (Integer num : list1) {
		if (list2.contains(num)) {
			System.out.println("Intersection : "+ num);
		}
	}
	}

}
