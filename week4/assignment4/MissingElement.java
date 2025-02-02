package week4.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 10, 6, 8};

        List<Integer> numberList = new ArrayList<>();

        for (int num : numbers) {
            numberList.add(num);
        }

        Collections.sort(numberList);

        for (int i = 0; i < numberList.size() - 1; i++) {
            int current = numberList.get(i);
            int next = numberList.get(i + 1);

            if (current + 1 != next) {
                for (int j = current + 1; j < next; j++) {
                    System.out.print(j + " ");
                }
            }
        }
    }

}
