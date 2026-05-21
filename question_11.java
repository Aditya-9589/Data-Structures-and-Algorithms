
// Q -> Count digits in a number. 

// --> Every digit-based recursion shares the same skeleton: peel the last digit off with
//         n % 10, recurse on the rest with n / 10, stop when n == 0.

// --> To count digits, we just return 1 + count(n/10). Each call contributes 1 
//         (for the digit it peeled off) and asks the rest how many digits they have.

// --> Edge case: n=0 is itself a 1-digit number, so we guard for that in main. 
//         The recursive function naturally returns 0 for n=0, so we add a check.

import java.util.Scanner;

public class question_11 {

    static int count(int n) {
        if (n == 0) return 0;

        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();

        // int result = (n == 0) ? 1 : count ;      // Error
        // int result = (n == 0) ? 1 : count() ;      // Error
        int result = (n == 0) ? 1 : count(n);
        // int result = (n == 0) ? 1 : count(Math.abs(n));
        System.out.println("Digit count = " + result);
    }
}
