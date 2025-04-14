package array;

import java.util.Arrays;

public class Day13SmallestPositiveMissing {

    // Method to find the first missing positive number by sorting the array
    public int missingNumberBySortin(int[] arr) {
        // Sort the array to bring the positive numbers in order
        Arrays.sort(arr);
        int result = 1;  // Start checking from 1 (the smallest positive number)

        // Traverse the sorted array to find the first missing positive number
        for (int i = 0; i < arr.length; i++) {
            // Skip non-positive numbers
            if (arr[i] <= 0) {
                continue;
            }
            // If the current number matches the result, increment the result to check the next one
            else if (arr[i] == result) {
                result++;
            }
        }

        // Return the first missing positive number
        return result;
    }

    // Method to find the first missing positive number using a visited array
    public int missingNumberVistedArray(int[] arr) {
        int result = arr.length;
        boolean[] visitedArray = new boolean[result];  // Create a boolean array to track the presence of positive numbers

        // Traverse the input array and mark numbers that are within the range [1, n]
        for (int i = 0; i < result; i++) {
            if (arr[i] > 0 && arr[i] <= result) {
                visitedArray[arr[i] - 1] = true;  // Mark this number as visited
            }
        }

        // Traverse the visited array to find the first index that is not visited
        for (int i = 0; i < result; i++) {
            if (!visitedArray[i]) {
                return i + 1;  // Return the missing number, which is i+1 (index-based)
            }
        }

        // If all numbers from 1 to n are present, return n+1 (the next missing number)
        return result + 1;
    }

    // Method to find the first missing positive number using cycle sort (in-place method)
    public static int missingNumberCyclicSort(int[] arr) {
        int n = arr.length;

        // Rearrange the elements in the array such that each element is placed at its correct index
        for (int i = 0; i < n; i++) {
            // If the current element is in the correct range (1 to n) and not at its correct index
            while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                int correctIndex = arr[i] - 1;
                // Swap the current element with the element at the correct index
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }

        // After the cycle sort, the elements are either in the correct position or out of bounds
        // Traverse the array to find the first element that is not at the correct index
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;  // Return the missing number
            }
        }

        // If all numbers from 1 to n are present, return n+1 (the next missing number)
        return n + 1;
    }
}
