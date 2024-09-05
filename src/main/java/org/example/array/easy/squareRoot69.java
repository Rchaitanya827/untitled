package org.example.array.easy;

public class squareRoot69 {
    public static void main(String[] args) {
        System.out.println(solution(144));
    }
    public static int solution(int number)
    {
        System.out.println("in solution");
        if (number == 0 || number == 1) {
            return number;
        }
        System.out.println("hi");
        int start = 1, end = number;
        int result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println(mid+"mid");
            // Check if mid*mid is the perfect square
            if (mid <= number / mid) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
