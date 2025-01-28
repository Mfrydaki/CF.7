package gr.aueb.cf.Projects;

public class Project02 {

/**
 This program finds the maximum sum of a contiguous subarray in a given array of integers
 * using Kadane's Algorithm. It runs in O(n) time.
 *
 * Example:
 * For the input array {-2, 1, -3, 4, -1, 2, 1, -5, 4},
 * the maximum sum subarray is {4, -1, 2, 1}, with a sum of 6.
 */

    public static void main(String[] args) {
        // Input array
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Variables to track the maximum sums
        int localMax = array[0];
        int globalMax = array[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {

            // Decide whether to extend the current subarray or start a new one
            localMax = Math.max(array[i], localMax + array[i]);

            // Update the global maximum if the current local maximum is greater
            globalMax = Math.max(globalMax, localMax);
        }

        // Output the result
        System.out.println("The maximum sum of a contiguous subarray is: " + globalMax);
    }
}