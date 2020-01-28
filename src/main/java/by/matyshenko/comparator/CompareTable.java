package by.matyshenko.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTable {
    private static final String REGEX_FOR_STR = "[^a-z0-9]+|(?<=[a-z])(?=[0-9])|(?<=[0-9])(?=[a-z])";

    public List<String> compareStrings(List<String> stringList) {
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                System.out.println("STR1: " + str1);
                System.out.println("STR2: " + str2);
                String[] arrayOfStrings1 = str1.split(REGEX_FOR_STR);
                System.out.println("Test line 1: " + Arrays.toString(arrayOfStrings1));

                String[] arrayOfStrings2 = str2.split(REGEX_FOR_STR);

                System.out.println("Test line 2: " + Arrays.toString(arrayOfStrings2));
                System.out.println("ARRAY OF 0: " + arrayOfStrings1[0]);
                System.out.println("ARRAY OF 1: " + arrayOfStrings2[1]);
                int temp = arrayOfStrings1[0].compareTo(arrayOfStrings2[1]);
                System.out.println("CMP: " + temp);
                System.out.println();
                if (temp != 0) {
                    return temp;
                } else {
                    temp = Integer.compare(Integer.parseInt(arrayOfStrings1[1]), Integer.parseInt(arrayOfStrings2[1]));
                    System.out.println("Temp for zero: " + temp);
                }
                return temp;
            }
        });
         return stringList;
    }
}
