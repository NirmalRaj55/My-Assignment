package week4.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {
	public static void main(String[] args) {

        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
        List<String> companyList = new ArrayList<>();

        for (String company : companies) {
            companyList.add(company);
        }

        Collections.sort(companyList);

        System.out.print("Required Output: ");
        for (int i = companyList.size() - 1; i >= 0; i--) {
            System.out.print(companyList.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }

}
