package org.example.array.easy;

import java.util.Arrays;

public class plusOne66 {
    public static void main(String[] args) {
        int digits[]={9,9,9};
        int[] res=solutions(digits);
        Arrays.stream(res).forEach(System.out::println);
    }
    public static int[] solutions(int[] digits)
    {
        int n = digits.length;

        // Traverse the digits array from the last element to the first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the digit is less than 9, simply increment the digit and return the array
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0
            digits[i] = 0;
        }

        // If all the digits were 9, the array has turned into all 0s (e.g., 999 -> 000).
        // So we need to create a new array with an extra space for the carry.
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
