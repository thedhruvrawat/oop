// 3) Write a java program to instantiate an ArrayList from user input. Write a program to search for
// a specified integer from this given ArrayList, appropriating handling border cases like numbers
// not found in the list, etc. Use the binary search algorithm for searching the number, after sorting
// the input array. (please refer to the binary search algorithm, or if not possible then apply linear
// search only).

import java.util.*;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(sc.nextInt());
        }
        int number = sc.nextInt();
        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList, number);
        if (index == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index " + index);
        }
        System.out.println("The sorted array is: " + arrayList);
    }
}
