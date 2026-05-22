
// Q -> Reverse a number using recursion?

// -->  Reversing a number means: 1234 → 4321. The cleanest recursive approach uses an 
//         accumulator parameter (rev) that builds the reversed number as we go.

// -->  How it works: each call peels the last digit (n%10), shifts the accumulator left 
//         by one position (rev×10), and adds the peeled digit. So the last digit of 
//         the original becomes the first digit of the result.

// -->  The wrapper function calls the helper with rev=0. This is the tail-recursive 
//         accumulator pattern — a fundamental DSA technique used in functional programming 
//         and backtracking.

import java.util.Scanner;

public class question_14 {

    static int reverseHelper(int n, int rev) {
        if (n == 0) return rev;

        int lastDigit = n % 10;
        int newRev = rev * 10 + lastDigit;
        return reverseHelper(n / 10, newRev);
    }

    static int reverse(int n) {
        return reverseHelper(Math.abs(n), 0);     // start accumulator at 0
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = scn.nextInt();
        System.out.println("Reversed = " + reverse(n));

        scn.close();
    }
}
