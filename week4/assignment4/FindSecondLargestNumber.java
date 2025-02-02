package week4.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {
	public static void main(String[] args) {

        int[] array = {3, 2, 11, 4, 6, 7};

        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num); 
        }

        Collections.sort(list);
        int largestNumber = list.get(list.size() - 1);
        System.out.println("The largest number is: " + largestNumber);
    }

}
