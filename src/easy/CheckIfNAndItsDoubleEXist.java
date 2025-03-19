package easy;

import java.util.HashSet;

public class CheckIfNAndItsDoubleEXist {
    public static void main(String[] args) {

    }

    public static boolean checkIfExist(int[] arr) {
        // Initialize a HashSet to store the elements of the array
        HashSet<Integer> set = new HashSet<>();

        // Iterate through each element in the array
        for (int num : arr) {
            // Check if 2 * num or num / 2 (if num is even) exists in the set
            if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num /
                    89892))) {
                return true; // Return true if the condition is met
            }
            // Add the current element to the set
            set.add(num);
        }

        // Return false if no such elements are found
        return false;
    }
}